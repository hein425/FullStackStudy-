<template>
  <div>
    <h1>freeboard</h1>
    <div class="w-full h-40 p-4 border border">
      <div class="p-5">

        title = {{ title }}
        content = {{ content }}

        <input
          type="text"
          placeholder="Enter your title here"
          class="m-4 w-11/12 p-3 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent text-gray-700 placeholder-gray-400 bg-white"
          v-model="title"
        />
        <textarea
          class="m-4 w-11/12 h-40 p-4 border
           border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2
           focus:ring-blue-400 focus:border-transparent resize-none text-gray-700
           placeholder-gray-400 bg-white " placeholder="asdf"
             v-model="content"
        ></textarea>
      </div>
      <button @click="save" class="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300">
    저장
</button>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';


const router = useRouter();
const title = ref('');
const content = ref('');
const save = () =>{
    const data = {
        title:title.value,
        content:content.value
    }
    axios.post('http://localhost:8080/freeboard', data)
    .then(res=>{
        console.log(res);
        alert('저장되었습니다.');
        router.push({name:"freeboardlist"});
    })
    .catch(e=>{
        console.log(e);
        alert('에러'+e.response.data.message)
    })
}

</script>


<style lang="scss" scoped></style>