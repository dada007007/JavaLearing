<script setup>
import axios from 'axios';
import { ref, onMounted } from 'vue';
let name = ref('');
let job = ref('');
let gender = ref('');
let userList = ref([]);
let search = () => {
    axios.get(`http://47.98.197.202/api/emps/list?name=${name.value}&gender=${gender.value}&job=${job.value}`).then((result) => {
        userList.value = result.data.data;
    }).catch((err) => {
        console.log(err);
    });
}
onMounted(() => {
    search();
})
</script>

<template>
    <div id="center">
        姓名: <input type="text" name="name" v-model="name">
        性别:
        <select name="gender" v-model="gender">
            <option value="1">男</option>
            <option value="2">女</option>
        </select>
        职位:
        <select name="job" v-model="job">
            <option value="1">班主任</option>
            <option value="2">讲师</option>
            <option value="3">其他</option>
        </select>

        <input class="btn" type="button" value="查询" @click="search">
    </div>

    <table>
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>头像</th>
            <th>性别</th>
            <th>职位</th>
            <th>入职时间</th>
            <th>更新时间</th>
        </tr>

        <tr v-for="(user, index) in userList" :key="index">
            <td>{{ index + 1 }}</td>
            <td>{{ user.name }}</td>
            <td><img v-bind:src="user.image"> </td>
            <td>
                <span v-if="user.gender == 1">男</span>
                <span v-else>女</span>
            </td>
            <td>
                <span v-show="user.job == 1">班主任</span>
                <span v-show="user.job == 2">讲师</span>
                <span v-show="user.job == 3">其他</span>
            </td>
            <td>{{ user.entrydate }}</td>
            <td>{{ user.updatetime }}</td>
        </tr>
    </table>
</template>

<style>
table,
th,
td {
    border: 1px solid #000;
    border-collapse: collapse;
    line-height: 50px;
    text-align: center;
}

#center,
table {
    width: 60%;
    margin: auto;
}

#center {
    margin-bottom: 20px;
}

img {
    width: 50px;
}

input,
select {
    width: 17%;
    padding: 10px;
    margin-right: 30px;
    border: 1px solid #ccc;
    border-radius: 4px;
}

.btn {
    background-color: #ccc;
}
</style>