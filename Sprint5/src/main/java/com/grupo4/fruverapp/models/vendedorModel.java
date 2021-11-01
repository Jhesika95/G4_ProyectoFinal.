package com.grupo4.fruverapp.models;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "vendedor")
public class vendedorModel {
    
    @Id //de la 10 a la 13 se usa para establecer la primary key 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private int id_vendedor;
    // Declaración de atributos que se quieren para la tabla
    private String nombre_vendedor;
    private String segnombre_vendedor;
    private String apellido_vendedor;
    private String segapellido_vendedor;
    private String direccion_vendedor;
    private String indicacion;
    private String telefono_vendedor;
    private String barrio_vendedor;
    
    
    @OneToMany(mappedBy = "id_cliente",cascade = CascadeType.ALL)
    private Set<clienteModel> cliente;


    public int getId_vendedor() {
        return this.id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNombre_vendedor() {
        return this.nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public String getSegnombre_vendedor() {
        return this.segnombre_vendedor;
    }

    public void setSegnombre_vendedor(String segnombre_vendedor) {
        this.segnombre_vendedor = segnombre_vendedor;
    }

    public String getApellido_vendedor() {
        return this.apellido_vendedor;
    }

    public void setApellido_vendedor(String apellido_vendedor) {
        this.apellido_vendedor = apellido_vendedor;
    }

    public String getSegapellido_vendedor() {
        return this.segapellido_vendedor;
    }

    public void setSegapellido_vendedor(String segapellido_vendedor) {
        this.segapellido_vendedor = segapellido_vendedor;
    }

    public String getIndicacion() {
        return this.indicacion;
    }

    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }

    public String getTelefono_vendedor() {
        return this.telefono_vendedor;
    }

    public void setTelefono_vendedor(String telefono_vendedor) {
        this.telefono_vendedor = telefono_vendedor;
    }

    public String getBarrio_vendedor() {
        return this.barrio_vendedor;
    }

    public void setBarrio_vendedor(String barrio_vendedor) {
        this.barrio_vendedor = barrio_vendedor;
    }

    public Set<clienteModel> getCliente() {
        return this.cliente;
    }

    public void setCliente(Set<clienteModel> cliente) {
        this.cliente = cliente;
    }
    
}