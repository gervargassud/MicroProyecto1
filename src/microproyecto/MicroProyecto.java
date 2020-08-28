/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microproyecto;

import javax.swing.JOptionPane;

        
        
        
public class MicroProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int anio,cuotaPorMarca = 0, precioFinal = 0;
        String marca;
        String marca1;
        String[] altaGama = {"BMW", "VOLVO", "AUDI"};
        
        
        marca = JOptionPane.showInputDialog("Ingrese la marca del auto");
        
        anio = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el año del auto"));
        
        marca1 = marca.toUpperCase();
        
        boolean buscar1 = buscarMarca (marca1, altaGama);
        
        if(buscar1){
            
         cuotaPorMarca = 1800;   
            
        } else {
            
         cuotaPorMarca = 890;   
            
        }
       
        
        int PrecioSegunAnio = cotizarA(anio);
        
        precioFinal = cuotaPorMarca + PrecioSegunAnio;
        
        JOptionPane.showMessageDialog(null, "Tu auto de modelo: " +marca1 + "     del año: "+anio  + "\n    Tiene una cuota a pagar de: $"+precioFinal );
        
    }
    
  public static boolean buscarMarca(String marca1, String altaGama [])  {
      
      for (int i =0; i <= altaGama.length; i++) {
          
          if(altaGama.equals(marca1)){
              
              return false;
          }
          
      }
      
     return true; 
  }
    
    public static int cotizarA (int anio) {
        
        int Precio = 0;
        
        if (anio < 1990){
            
            Precio = 350;
            
        }else {
            
            if (anio >= 1990 && anio <= 1999){
                
                Precio = 480;
                
            } else {
                
                if (anio > 1999 && anio <= 2010){
                    
                    Precio = 780;
                    
                } else {
                    
                    if (anio > 2010 && anio <= 2016){
                    
                        Precio = 950;
                    } else {
                        
                        Precio = 1200;
                    }
                }
            }
        }
      
        return Precio;
        
    }  
    
}
