<script setup lang="ts">
import { onMounted, reactive, ref } from 'vue'
import axios from 'axios';
let emp = ref({
    name: '',
    gender: '',
    job: '',
})
let empList = ref([

])

// 查询
let search = async () => {
    let result = await axios.get(`http://47.98.197.202/api/emps/list?name=${emp.value.name}&gender=${emp.value.gender}&job=${emp.value.job}`)
    empList.value = result.data.data
}

// 清空
let clear = () => {
    emp.value = {
        name: '',
        gender: '',
        job: '',
    }
    search();
}

onMounted(() => {
    search();
})
</script>

<template>
    <!-- 搜索表单 -->
    <el-form :inline="true" :model="emp" class="demo-form-inline">
        <el-form-item label="姓名">
            <el-input v-model="emp.name" placeholder="请输入姓名" clearable />
        </el-form-item>
        <el-form-item label="性别">
            <el-select v-model="emp.gender" placeholder="请选择" clearable>
                <el-option label="男" value=1 />
                <el-option label="女" value=2 />
            </el-select>
        </el-form-item>
        <el-form-item label="职位">
            <el-select v-model="emp.job" placeholder="请选择" clearable>
                <el-option label="班主任" value=1 />
                <el-option label="讲师" value=2 />
                <el-option label="其他" value=3 />
            </el-select>
        </el-form-item>
        <el-form-item>
            <el-button type="primary" @click="search">查询</el-button>
        </el-form-item>
        <el-form-item>
            <el-button type="primary" @click="clear">清空</el-button>
        </el-form-item>
    </el-form>

    <!-- 搜索表格 -->
    <el-table :data="empList" border style="width: 80%" >
        <el-table-column prop="id" label="ID" width="50px" align="center"/>
        <el-table-column prop="name" label="名字" width="180" align="center"/>
        <el-table-column label="头像" align="center">
            <template #default="scope">
                <img :src="scope.row.image" width="50px">
            </template>
        </el-table-column>
        <el-table-column label="性别" width="180"  align="center">
            <template #default="scope">
                {{ scope.row.gender==1?'男':'女' }}
<!--                 
                <span v-if=" scope.row.gender==1">
                    男
                </span>
                <span v-else-if=" scope.row.gender==2">
                    女
                </span>
                <span v-else>
                    其他
                </span> 
-->
            </template>
        </el-table-column>
        <el-table-column label="职位" align="center">
            <template #default="scope">
                <span v-if=" scope.row.job==1">
                    班主任
                </span>
                <span v-else-if=" scope.row.job==2">
                    讲师
                </span>
                <span v-else>
                    其他
                </span>
            </template>
        </el-table-column>
        <el-table-column prop="entrydate" label="入职日期" width="180px" align="center"/>
        <el-table-column prop="updatetime" label="更新时间" align="center"/>

    </el-table>
</template>

<style scoped></style>