import Vue from 'vue'
import Router from 'vue-router'

import User from '@/components/User'
import Order from '@/components/Order'

Vue.use(Router)

export default new Router({
  // 去除/#/
  mode: "history",
  routes: [
    {
      path: '/',
      name: 'table-main',
      component: User
    },
    {
      path: '/order',
      name: 'table-Order',
      component: Order
    }
  ]
})
