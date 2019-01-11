/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.Model;

/**
 *
 * @author bdani
 */
public class ProducModel {
    private int  id;
    private  String nombre_product;
    private String codigo_product;
    private String descripcion;
    private double precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_product() {
        return nombre_product;
    }

    public void setNombre_product(String nombre_product) {
        this.nombre_product = nombre_product;
    }

    public String getCodigo_product() {
        return codigo_product;
    }

    public void setCodigo_product(String codigo_product) {
        this.codigo_product = codigo_product;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
    
   
