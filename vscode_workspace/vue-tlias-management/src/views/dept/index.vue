<script setup lang="ts">
import { ref, onMounted } from 'vue'
import type { DeptModel, DeptModelArray } from '@/api/model/model.ts'

import { addApi, queryAllDept, getInfoApi, updateApi, deleteApi } from '../../api/dept';
import { ElMessage, ElMessageBox } from 'element-plus';



const deptList = ref<DeptModelArray>([])
const dept = ref<DeptModel>({
  name: ''
})

//新增部门
const dialogFormVisible = ref<boolean>(false)
const formTitle = ref<string>('')

const add = () => {
  dialogFormVisible.value = true
  formTitle.value = '新增部门'
  dept.value = { name: '' }
}

const save = async () => {
  let result;
  if (dept.value.id) {
    result = await updateApi(dept.value);
  } else {
    result = await addApi(dept.value);
  }
  if (result.code) {
    dialogFormVisible.value = false
    search()
    ElMessage.success('操作成功')

  } else {
    ElMessage.error(result.msg)

  }


}

const search = async () => {
  let result = await queryAllDept() //axios.get('https://mock.apifox.com/m1/3161925-0-default/depts')
  if (result.code) {
    deptList.value = result.data
  }
}

const update = async (id: number) => {
  dialogFormVisible.value = true
  formTitle.value = '修改部门'
  dept.value = { name: '' }
  const result = await getInfoApi(id)
  if (result.code) {
    dept.value = result.data
  }
}

const deleteById = (id: number) => {
  ElMessageBox.confirm(
    '您确认要删除该数据吗？',
    '删除部门',
    { confirmButtonText: '确定', cancelButtonText: '取消', type: 'warning', }
  )
    .then(async () => {
      //删除部门操作
      const result = await deleteApi(id);
      if (result.code) {
        ElMessage({
          type: 'success', message: '删除成功',
        })
        search()
      } else {
        ElMessage.error(result.msg)
      }

    })
    .catch(() => {
      ElMessage({
        type: 'info',
        message: '取消删除',
      })
    })
}



onMounted(() => {
  search()
})

</script>

<template>
  <h1>部门管理</h1> <br>
  <el-button type="primary" @click="add">+ 新增部门</el-button> <br><br>

  <el-table :data="deptList" border style="width: 100% ">
    <el-table-column type="index" label="序号" width="100" align="center" />
    <el-table-column prop="name" label="部门名称" width="200" align="center" />
    <el-table-column prop="updateTime" label="最后操作时间" width="250" align="center" />
    <el-table-column prop="address" label="操作" align="center">
      <template #default="scope">
        <el-button type="success" @click="update(scope.row.id)">编辑</el-button>
        <el-button type="danger" @click="deleteById(scope.row.id)">删除</el-button>
      </template>

    </el-table-column>
  </el-table>


  <!-- 新增部门表单 -->
  <el-dialog v-model="dialogFormVisible" :title="formTitle" width="30%">
    <el-form :model="dept">
      <el-form-item label="部门名称">
        <el-input v-model="dept.name" autocomplete="off" />
      </el-form-item>
    </el-form>


    <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取消</el-button>
        <el-button type="primary" @click="save">确定</el-button>
      </span>
    </template>
  </el-dialog>
</template>

<style scoped></style>
