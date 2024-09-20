<template>
    <div>
        <h1 color-red >The FreeBoard View</h1>
        <div class="p-5">
            <div class="border border-b-slate-400 rounded p-3">
                <h1 class="font-bold" >글제목 <span>{{ title }}</span> </h1>
                <p class="h-64">{{ content }}</p>
                <h1>작성일자 {{ regDate }}</h1>
                <h1>작성자 {{  creAuthor }}</h1>
            </div>
            <div>
                <button @click="pageMove(idx)">수정</button>
                <button @click="doDelete(idx)">삭제</button>
            </div>
        </div>
    </div>
</template>

<script setup>

import axios from 'axios' ;
import { ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';

const route = useRoute();
const router = useRouter();
const title = ref('초기값');
const content = ref('초기값');
const regdate = ref('초기값');
const creAuthor = ref('초기값');
const idx = ref(0);

const pageMove = () => {
    router.push({ name:"freeboardinput", query: {idx:idx.value} });
}


const doDelete = (idx) => {
    console.log(idx);
    axios.delete(`http://localhost:8080/freeboard/delete/${idx}`)
        .then( res=>{
            if(res.status=='200' && res.data=='삭제되었습니다'){
                router.push({name: "freeboardlist"})
            }

        })
        .catch(e => console.log(e));
}


const getFreeBoard= () =>{
    axios.get(`http://localhost:8080/freeboard/view/${route.params.idx}`)
        .then(res =>{
            title.value = res.data.title;
            content.value = res.data.content;
            regdate.value = res.data.regdate;
            creAuthor.value = res.data.creAuthor;
            idx.value = res.data.idx;
        })
        .catch(e => {
        console.log(e);
        alert(e.response.data.message);
        router.puch({name:"freeboardlist"})
        })
    }

        getFreeBoard();
        

</script>

<style lang="scss" scoped>

</style>