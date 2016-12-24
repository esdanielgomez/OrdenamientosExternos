package intercalacion.natural;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Daniel
 */
public class OrdenamientoNatural {
    public static void Procesar(int campo, File archivo) throws IOException
    {
        System.out.println("campo: "+campo);
        MezclaNatural mezcla = new MezclaNatural(archivo,campo);
        mezcla.ordenar();
        
        System.out.println("Mezcla Natural Terminada..");   
    }
}