<script>
export default{
  data() {
    return {
      message:"山东菏泽曹县，牛批666，我嘞宝贝儿~~",
      count:0
    }
  },
  methods:{
    addd:function () {
      this.count++
    }
  },
  mounted(){
    console.log("---------->");
  }
}

</script>

<template>
  <h1>{{ message }}</h1>
  <input type="button" value="一键三连" @click="addd">{{ count }}
</template>

<style >

</style>
