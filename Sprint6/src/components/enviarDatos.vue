<template>
<form class="row g-4 py-2 container-xl">
          <h1>Mi Cuenta</h1>
          <h6>Por favor ingresa todos tus datos </h6>
        <div class="col-md-4">
          <label for="inputNombre" class="form-label">Nombres</label>
          <input type="text" class="form-control" id="inputNombre">
        </div>
        <div class="col-md-5">
          <label for="inputApellidos" class="form-label">Apellidos</label>
          <input type="text" class="form-control" id="inputApellidos">
        </div>
        <div class="col-4">
          <label for="inputTel" class="form-label">Telefono</label>
          <input type="text" class="form-control" id="inputAddress" placeholder="Telefono">
        </div>
        <div class="col-5">
          <label for="inputAddress" class="form-label">Direccion</label>
          <input type="text" class="form-control" id="inputAddress" placeholder="Adress">
        </div>
        <div class="col-md-6">
          <label for="inputCity" class="form-label">Indicaciones (Casa,Apartamento,,torre,barrio,etc)</label>
          <input type="text" class="form-control" id="inputCity">
        </div>
        
        <div class="col-12"> 
          <button type="button" href="#" class="btn btn-dark" id="basicToastBtn">Enviar</button>     
        </div>
    
      </form>

</template>
<script>
import axios from 'axios'

    export default {
    name: 'enviarDatos',
    props: {
        datosEnviarId: Number
    },
    data: function () {
      return {
        form: {
            id_cliente: 0,
            nombre_cliente: "",
            apellido_cliente: "",
            telefono_cliente: "",
            direccion_cliente: "",
            indicaciones_cliente: "",
            
        },
        mensajeInfo: 'Se guardó correctamente',
        estadoMsgInf: 'display: none;'
      }
    },
    methods: {
        onSubmit(event) {
            event.preventDefault()
            if (this.verficarCampos()) {
                alert("Llene todos los campos")
            } else {
                if(this.datosEnviarId==0){
                    this.guardarCliente()
                }else{
                    this.editarCliente()
                }
            }
            this.form.id_cliente= 0,
            this.form.nombre_cliente= "",
            this.form.apellido_cliente= "",
            this.form.telefono_cliente= "",
            this.form.direccion_cliente= "",
            this.form.indicaciones_cliente= ""
        },
        traerDatosCliente() {
            axios.get("http://localhost:8081/comprador/"+this.datosEnviarId)
            .then(res => {  
                this.form.nombre_cliente= res.data.nombre_cliente
                this.form.apellido_cliente= res.data.apellido_cliente
                this.form.telefono_cliente= res.data.telefono_cliente
                this.form.direccion_cliente= res.data.direccion_cliente
                this.form.indicaciones_cliente= res.data.indicaciones_cliente
            })
            .catch(err => {
            alert(err); 
            })
             },
    
    
        verficarCampos(){
            return this.form.nombre_cliente== "" ||
            this.form.apellido_cliente== "" ||
            this.form.telefono_cliente== "" ||
            this.form.direccion_cliente== "" ||
            this.form.indicaciones_cliente== ""  
        }
    },
    mounted() {
      if (this.datosEnviarId != 0) {//si tiene algo para modificar,
          this.traerDatosCliente()
          //para llenar la información de los datos cuando va a editar.
      }
    }
  }
</script>


