<script setup lang="ts">
import {ref, onMounted} from 'vue'
import type { DeptModelArray, DeptModel } from '@/api/model/model'
import {queryAllApi, addApi, queryInfoApi, updateApi, deleteApi} from '@/api/dept'
import { ElMessage, ElMessageBox, type FormInstance, type FormRules } from 'element-plus';

//声明列表展示数据
let tableData = ref<DeptModelArray>([])

//动态加载数据-查询部门
const queryAll = async () => {
  const result = await queryAllApi()
  tableData.value = result.data
}

//钩子函数
onMounted(() => {
  queryAll()
})


//新增部门
const dialogFormVisible = ref<boolean>(false) 
const deptForm = ref<DeptModel>({name: ''})
const formTitle = ref<string>('')

//点击新增按钮触发的函数
const add = () => {
  formTitle.value = '新增部门'
  dialogFormVisible.value = true
  deptForm.value = {name: ''}
}

//点击保存按钮-发送异步请求
const save = async (form:FormInstance | undefined) => {
  if(!form) return;
  await form.validate(async (valid) => {
    if (valid) {
      let result = null;
      if(deptForm.value.id){
        result = await updateApi(deptForm.value)
      }else {
        result = await addApi(deptForm.value)
      }

      if(result.code){
        ElMessage.success('操作成功')
      }else{
        ElMessage.error(result.msg)
      }
      dialogFormVisible.value = false
      queryAll()
    }
  })
}

//修改部门-查询回显
const update = async (id:number) => {
  formTitle.value = '修改部门'
  dialogFormVisible.value = true
  deptForm.value = {name: ''}

  const result = await queryInfoApi(id)
  deptForm.value = result.data
}

//删除部门
const deleteById =async (id:number) => {
  //弹出确认框
  ElMessageBox.confirm('您确认删除此部门吗? ', '确认删除').then( async () => {
    let result = await deleteApi(id)
    if(result.code){ //成功
      ElMessage.success('删除成功')
      queryAll()
    }else {
      ElMessage.error(result.msg)
    }
  }).catch(() => {
    ElMessage.info('取消删除')
  })
}

//定义表单校验规则
const deptFormRef = ref<FormInstance>()
const rules = ref<FormRules<DeptModel>>({
  name: [
    { required: true, message: '部门名称不能为空', trigger: 'blur' },
    { min: 2, max: 10, message: '部门名称长度在2-10个字之间', trigger: 'blur' },
  ]
})

//重置表单校验结果
const resetForm = (form: FormInstance | undefined) => {
  if (!form) return
  form.resetFields()
}
</script>

<template>
  <h1>部门管理</h1>
  <el-button type="primary" style="float: right" @click="add(); resetForm(deptFormRef);">+ 新增</el-button>
  <br><br>

  <!-- 部门数据表格 -->
  <el-table :data="tableData" border style="width: 100%">
    <el-table-column type="index" label="序号"  width="80"  align="center"/>
    <el-table-column prop="name" label="部门名称" width="250"  align="center"/>
    <el-table-column prop="updateTime" label="最后操作时间" width="300"  align="center"/>
    <el-table-column label="操作"  align="center">
      <template #default="scope">
        <el-button size="small" type="primary" @click="update(scope.row.id); resetForm(deptFormRef);">修改</el-button>
        <el-button size="small" type="danger"  @click="deleteById(scope.row.id)">删除</el-button>
      </template>
    </el-table-column>
  </el-table>

  <!-- 新增部门 / 修改部门对话框 -->
  <el-dialog v-model="dialogFormVisible" :title="formTitle" width="30%">
    <el-form :model="deptForm" :rules="rules" ref="deptFormRef">
      <el-form-item label="部门名称" label-width="80px" prop="name">
        <el-input v-model="deptForm.name" autocomplete="off" />
      </el-form-item>
    </el-form>

    <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogFormVisible = false; resetForm(deptFormRef);">取消</el-button>
        <el-button type="primary" @click="save(deptFormRef)">确定</el-button>
      </span>
    </template>
  </el-dialog>

</template>

<style scoped>

</style>
