<template>
    <div>
        <h1>TheHeader</h1>
        <router-link to="/">home</router-link>
        <router-link to="/join">join</router-link>
        <router-link to="/about">About</router-link>
    </div>
</template>

<script setup>
        import {RouterLink} from 'vue-router';
</script>

<style lang="scss" scoped>

</style>