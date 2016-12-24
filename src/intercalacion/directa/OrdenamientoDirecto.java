package intercalacion.directa;

import com.csvreader.CsvReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Daniel
 */
public class OrdenamientoDirecto {
    
    public static void Procesar(int campo, File archivo) throws IOException {
        
        int rango=0;

        //  rango: numRegistros
        try 
        {
            CsvReader leer = new CsvReader(archivo.getAbsolutePath());
            while (leer.readRecord()) 
                rango++;
            leer.close();
        } 
        catch (FileNotFoundException ex) {} catch (IOException ex) {}
        
        File file1 = new File(archivo.getParent()+"\\"+"F1.csv");
        File file2 = new File(archivo.getParent()+"\\"+"F2.csv"); 
        System.out.println("numRegistros: " + rango+"  campo: "+campo);
        MezclaDirecta mezcla = new MezclaDirecta(archivo,file1,file2,rango,campo);   
    }
}