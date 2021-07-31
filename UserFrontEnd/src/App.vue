<template>
  <Header></Header>
  <router-view />
  <Footer></Footer>
</template>

<script>
import Header from "./components/user/Header.vue";
import Footer from "./components/user/Footer.vue";

export default {
  components: {
    Header,
    Footer
  },
  data() {
    return{

    }
  }
}
</script>

<style>
/* #app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
} */


</style>
