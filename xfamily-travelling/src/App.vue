<template>
  <div class="header-container">
    <img alt="Vue logo" src="./assets/X family.png"> <h1 class="main-title">X family</h1>
  </div>
  <HelloWorld msg="X family"/>
  <router-view />
  <TheFooter />
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

import TheFooter from './components/TheFooter.vue' 

export default {
  name: 'App',
  components: {
    HelloWorld, TheFooter
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0px;
}

.header-container {
  background-color: #55aa00;
  color: #0c0f50;
  display: flex;        
  align-items: flex-start;   
  gap: 30px;             
  padding: 10px 10px;         
}

img {
  width: 80px;   
  height: auto;
}
</style>