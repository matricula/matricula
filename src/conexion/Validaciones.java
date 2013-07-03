
package conexion;


public class Validaciones 
{
     private void Validaciones()
    {
        
    }
    
        public boolean solonumeros(String cadena)
        {
                try
                {
                    Integer.parseInt(cadena);
                    return true;
                }
                
                catch(NumberFormatException nfe)
                {
                    return false;  
                }
        } 
}    
