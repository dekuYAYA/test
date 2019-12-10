// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
//在main.js中也将路由加入 。router 即 router 文件夹里定义的路由。
import router from './router'
//引入IVIEW组件
import iView from 'iview';
import 'iview/dist/styles/iview.css';
Vue.use(iView);
//引入vue-easytable
import 'vue-easytable/libs/themes-base/index.css'
import {VTable,VPagination} from 'vue-easytable'
Vue.component(VTable.name, VTable)
Vue.component(VPagination.name, VPagination)
//引入axios
import axios from 'axios'
// 全局注册，之后可在其他组件中通过 this.$axios 发送数据
Vue.prototype.$ajax = axios
//作用是阻止vue 在启动时生成生产提示。
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
