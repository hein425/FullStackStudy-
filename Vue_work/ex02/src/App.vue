<template>
  <div>
    <TheNav></TheNav>
    
    <RouterView></RouterView>
  </div>
</template>

<script>
import TheCounter from './views/TheCounter.vue';
import AA from './views/AA.vue';
import TheNav from './views/TheNav.vue';
import { RouterView } from 'vue-router';

export default {
  components: {
  
    RouterView,
    TheNav
  },
  setup() {

    return { TheCounter, AA, RouterView, TheNav }
  }
}
</script>
<style lang="scss" scoped></style>

