
/**
 * Write a description of class doc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface doc
{
   /**
    * Resumen: En este Metodo vamos a ver el contenido de una fila en especial, dentro de el fichero con la ruta indicada.
    * Entrada:Un entero llamado x que sera la fila del fichero, y una Cadena denominada file como ruta absoluta.
    * Salida: El contenido de la fila x, 
    * Precondiciones: Un entero valido que no sea negativo y no sobrepase el numero de lineas del fichero. La Cadena con la ruta absoluta correcta.
    * PostCondiciones: La linea del fichero indicada por parametro.
    * 
    */
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   public abstract String obtenerLinea(int x, String file);
   
   
}
