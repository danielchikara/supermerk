/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.Controller;

import supermercado.Model.Conexion;
import supermercado.View.Login;
import supermercado.View.Venta;

/**
 *
 * @author bdani
 */
public class SuperMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conectar = new  Conexion();
        conectar.conectar();
        conectar.conectar("localhost", "3306", "supermercado", "root","" );
        
        SuperMercado llamarMetodo = new SuperMercado();
        llamarMetodo.index();
        
                
        
    }
    public  void index (){
        Login inicio  = new Login();
        inicio.setVisible(true);
    }
   public void  VistaVenta (){
       Venta vistave = new Venta();
       vistave.setVisible(true);
       
   }
   
}
