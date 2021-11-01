<template>
 <div id="app" class="container">
    <div class="row" v-if="resultado == '' || resultado == 'error'">
        <div class="col-12 formsesion" >
            <h2 class="title">Inicio de sesión</h2>
            <form v-on:submit="onSubmit">
              <div class="mb-3">
                <label for="usuario" class="form-label">Usuario</label>
                <input type="text" class="form-control" id="usuario" v-model="form.nick_usuario">
              </div>
              <div class="mb-3">
                <label for="contrasenaUsuario" class="form-label">Contraseña</label>
                <input type="password" class="form-control" id="contrasenaUsuario" v-model="form.contra_usuario">
              </div>
              <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
        </div>
    </div>

    <div v-else>
    <nav class="navbar navbar-expand-lg navbar-light" style="background-color:#0f872e;">
        <div class="container-fluid">
          <a class="navbar-brand" href="#"><h1>FruverApp</h1></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <form class="d-flex ms-lg-5">
            <input class="buscador form-control me-2" type="search" placeholder="Busca aqui tu fruta o verdura favorita" aria-label="Search">
            <button class="btn btn-dark" type="submit">Buscar</button>
          </form>
          <div class="botones collapse navbar-collapse" id="navbarSupportedContent">
              <br><br>
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <button type="button" class="btn btn-dark ms-lg-5"> 
                <i class="fas fa-portrait"></i>  
              </button>
              <li class="nav-item"> 
                <router-link to="/cuentaCliente" class="nav-link"><h5>Mi cuenta</h5></router-link>
              </li>
              <button type="button" class="btn btn-dark"> 
                <i class="fas fa-dolly-flatbed"></i> 
              </button>
              
              <li class="nav-item">
                <router-link to="/pedidos" class="nav-link"><h5>Mis pedidos</h5></router-link>
              </li>
              <li class="nav-item">
                <a class="nav-link" v-on:click="salir">Salir</a>
              </li>
              <a class="btn btn-light ms-lg-5"  v-on:click="Deseasalir()" type="button"><h5>Salir</h5></a>
            </ul>
          </div>
        </div>
      </nav>
</template>

<script>
  import axios from 'axios'
  import router from './router'

  export default {
    data: function(){
      return {
        form: {
          nick_usuario: '',
          contra_usuario: '',
        },
        resultado: "",
        textIzq: "Inicio"
      }
    },
    methods: {
      onSubmit(event) {
        event.preventDefault()
        axios.post("http://localhost:8080/cliente/",JSON.stringify(this.form),{
          headers: { 
              'Accept': 'application/json',
              'Content-Type': 'application/json'
          },
        })
        .then(res => { 
          this.resultado = res.data 
          if(res.data == "error"){
            alert("Revise el usuario y la contraseña")
          }else{
            if(res.data == "cliente"){
              router.push({ path: '/homeCliente' })
            }else{
              router.push({ path: '/homeCliente' })
            }
          }
        })
        .catch(err => {
          alert(err); 
        })
      },
      salir(){
        this.resultado = ""
      },
      cambiarMensajeIzq(text){
        this.textIzq = text
      }
    }
  }
</script>

<style>
  @import './assets/estilos.css';
</style>

