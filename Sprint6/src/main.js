import Vue from 'vue'
import VueRouter from 'vue-router'
import home from '../views/homeCliente.vue'
import pedidos from '../views/pedidos.vue'
import salir from '../views/salir.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/home',
    name: 'home',
    component: home
  },
  {
    path: '/pedidos',
    name: 'pedidos',
    component: pedidos
  },
  {
    path: '/salir',
    name: 'salir',
    component: salir
  },

]

const router = new VueRouter({
  routes
})

export default router
