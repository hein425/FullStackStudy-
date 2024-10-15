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

        <template v-if="loginPinia.loginCheck">
          <div class="flex space-x-5">
            <h1>{{ loginPinia.name }} 님</h1>
            <button @click="logout()"> logout</button>
          </div>
            
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
// import { router } from '@/router';
import { useLoginStore } from '@/store/loginPinia';
import { watchEffect } from 'vue';
import { RouterLink } from 'vue-router';

const loginPinia = useLoginStore();
const logout = () => {
  localStorage.removeItem("token");
  loginPinia.logout();
}

watchEffect(async() => {
   const result = await dologinCheck();
   
   if(result==false){
    // loginCheck.value = false;
    // router.push({name : 'login'});
    loginPinia.logout();
   }else{
    console.log(result);
    if(result.status==200){
      // loginCheck.value = true;
      loginPinia.login(result.data)
    }else if(result.status==401){
      localStorage.removeItem("token");
      loginPinia.logout();
      // loginCheck.value = false;
    }
    // loginCheck.value = false;
   }
});
</script>

<style scoped></style>
