<script setup>
import { RouterView } from 'vue-router';
import LayoutHeader from './layout/LayoutHeader.vue';
</script>

<template>

  <LayoutHeader/>
  <RouterView />
  
</template>

<style scoped></style>



<!--  JWT 토큰을 가지고 프리보드에 요청을 함.  -->