<template>
  <div>
    <h1 class="text-5xl">Insert</h1>
    <label for="email">email</label>
    <input type="text" name="" id="email" v-model="email" class="border-purple-950">
    <h1 class="test-3xl">{{ email }}</h1>
    <button @click="doInsert" class="bg-green-500 hover:bg-green-900">Insert</button>
  </div>
</template>

<script>
import{ ref } from "vue";

export default {
  setup () {
    const email = ref('')
    const doInsert = () => {
      console.log(email.value);
      // fetch('http://localhost:8080/user/insert')
      //   .then()
    }
    

    return { email, doInsert }
  }
}
</script>

<style lang="scss" scoped>

</style>