<template>
  <header>
    <div class="p-5 bg-teal-500 text-white text-3xl">
      <nav class="flex justify-between">
        <div class="flex space-x-5">
          <div>
            <RouterLink to="/">Home</RouterLink>
          </div>
          <div>
            <RouterLink to="/user">User</RouterLink>
          </div>
          <div class="group relative">
            <RouterLink to="/freeboardlist">FreeBoard</RouterLink>
            <div
              class="opacity-0 group-hover:opacity-100 transition absolute bg-teal-400 p-5 top-8 -left-5 rounded"
            >
              <div>
                <RouterLink to="/freeboardlist">FreeBoardList</RouterLink>
              </div>
              <div>
                <RouterLink to="/freeboardinput">FreeBoardinput</RouterLink>
              </div>
            </div>
          </div>

          <div class="group relative">
            <RouterLink to="/fileupload">file</RouterLink>
            <div
              class="opacity-0 group-hover:opacity-100 transition absolute bg-teal-400 p-5 top-8 -left-5 rounded"
            >
              <div>
                <RouterLink to="/fileupload">fileupload</RouterLink>
              </div>
              <div>
                <RouterLink to="/fileupload">fileupload</RouterLink>
              </div>
              <div>
                <RouterLink to="/filedownload">filedownload</RouterLink>
              </div>
            </div>
          </div>
        </div>

        <template v-if="loginCheck">
          <div> 로그인 하셧네요? </div>
        </template>

        <template v-else>
            <div class="flex space-x-5">
            <div>
              <RouterLink to="/join">join</RouterLink>
            </div>
            <div>
              <RouterLink to="/login">login</RouterLink>
            </div>
          </div>    
        </template>
      </nav>
    </div>
  </header>
</template>

<script setup>
import { dologinCheck } from '@/api/loginApi';
import { ref, watchEffect } from 'vue';
import { RouterLink } from 'vue-router';
const loginCheck = ref('false');

watchEffect(() => {
   const result = dologinCheck(); 
   if(result==false){
    loginCheck.value = false;
   }else{
    console.log(result);
    loginCheck.value = true;
   }
});
</script>

<style scoped></style>
