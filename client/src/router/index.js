import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

import Main from "@/pages/Main"
import Dashboard from "@/pages/Dashboard"
import Quotation from "@/pages/Quotation"

let routes = [{
  path: '/',
  component: Main,
  hidden: true,
  children: [{
    path: '/',
    component: Dashboard,
    name: '首页'
  }]
}]
routes.push({
  path: '/quotation',
  name: '语录管理',
  component: Main,
  iconCls: 'fa fa-user-circle-c',
  children: [{
    path: '/quotation/data',
    component: Quotation,
    name: '语录信息管理'
  }]
})

const router = new Router({
  routes: routes
})

export default router
