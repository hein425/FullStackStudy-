<template>
  <div class="p-16">
    <h1 class="text-5xl">Home</h1>
    <p>ref 반응형 함수를 사용해볼게요</p>
    <h2>{{ count }}</h2>
    <button @click="doMin" class="bg-green-500 hover:bg-green-900">감소</button>
    <button @click="doPls" class="bg-green-500 hover:bg-green-900">증가</button>
  </div>
</template>

<script>
import { ref } from 'vue';

export default {
  setup () {
    const count = ref(0);
    const doPls = () =>{
      count.value = count.value +1;
    }

    const doMin = () =>{
      count.value = count.value -1;
    }

    return { count , doPls, doMin }
  }
}
</script>

<style lang="scss" scoped>

</style>