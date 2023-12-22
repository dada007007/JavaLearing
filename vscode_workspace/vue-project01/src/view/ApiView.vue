<script setup>
import { onMounted, ref } from 'vue';
let message = ref("🐂🐎🐏🐕🐱🐇🐍🐦");
let count = ref(0);

let addd = () => {
    count.value++;
}

onMounted(() => {
    console.log("页面加载完毕....");
})


</script>

<template>
    <h1>{{ message }}</h1>
    <input type="button" value="同意的请一键三连" @click="addd">{{ count }}
</template>

<style ></style>
