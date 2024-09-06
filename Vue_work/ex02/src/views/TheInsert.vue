<template>
  <div>
    <h1> 인서트다 </h1>
    <button @click="userSend">sfdsfdsfdaasfd</button>
  </div>
</template>

<script>
export default {
  setup () {

    const mydata = {
        "name": "정해인",
        "age": 29,
        "email": "VVS@google.com",
        "password": "password",
        "wdate": "2024-09-06T11:21:14.565925"
    }

    const userSend = () =>{
      fetch('http://localhost:8080/user/insert',{
        method:"POST",
        headers:{'Content-Type':'application/json'},
        body: JSON.stringify(mydata)
      })
      .then(res =>{
        console.log(res);
      })
    }
    
    return {userSend}
  }
}
</script>

<style lang="scss" scoped>

</style>