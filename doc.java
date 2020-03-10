
/**
 * Write a description of class doc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface doc
{
   
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   public abstract String obtenerLinea(int x, String file);
   
   
   /**
    * Resumen: En este Metodo vamos a ingresar una direccion especifica para hayar su latitud y longitud.
    * Entrada:Una cadena denominada direccion.
    * Salida: La latitud y longitud por medio de dos Float.
    * Precondiciones: Direccion valida, 
    * PostCondiciones: Devuelve la posicion geografica especifica indicada por la direccion.
    * 
    */
   public abstract void posicionGeografica(String direccion);
  
   
}
