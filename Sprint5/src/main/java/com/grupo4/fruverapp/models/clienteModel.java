package com.grupo4.fruverapp.models;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class clienteModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_cliente;

    private String nombre_cliente;
    private String segnombre_cliente;
    private String apellido_cliente;
    private String segapellido_cliente;
    private String direccion_cliente;
    private String indicacion;
    private String telefono_cliente;
    private String barrio_cliente


    @ManyToOne
    @JoinColumn(name ="id_vendedor")
    private vendedorModel vendedor_id_vendedor;

    public int getId_cliente() {
        return this.id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return this.nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getSegnombre_cliente() {
        return this.segnombre_cliente;
    }

    public void setSegnombre_cliente(String segnombre_cliente) {
        this.segnombre_cliente = segnombre_cliente;
    }

    public String getApellido_cliente() {
        return this.apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getSegapellido_cliente() {
        return this.segapellido_cliente;
    }

    public void setSegapellido_cliente(String segapellido_cliente) {
        this.segapellido_cliente= segapellido_cliente;
    }

    public String getIndicacion() {
        return this.indicacion;
    }

    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }

    public String getTelefono_cliente() {
        return this.telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getBarrio_cliente() {
        return this.barrio_cliente;
    }

    public void setBarrio_cliente(String barrio_cliente) {
        this.barrio_cliente = barrio_cliente;
    }

    public vendedorModel getVendedor_id_vendedor() {
        return this.vendedor_id_vendedor;
    }

    public void setVendedor_id_vendedor(vendedorModel vendedor_id_vendedor) {
        this.vendedor_id_vendedor = vendedor_id_vendedor;
    }