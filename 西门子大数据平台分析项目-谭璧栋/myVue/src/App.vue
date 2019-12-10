<template>
  <div id="app">
    <!--router-link组件是用来跳转路由的，to属性是将要跳转的路由页地址.-->
    <!--router-view组件是用来展示组件页的。-->
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
