<template>

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

</script>
