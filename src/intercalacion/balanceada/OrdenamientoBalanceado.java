/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercalacion.balanceada;

import com.csvreader.CsvReader;
import intercalacion.directa.MezclaDirecta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Daniel
 */
public class OrdenamientoBalanceado {

    public static void Procesar(int campo, File archivo) {
        
        MezclaBalanceada mezcla = new MezclaBalanceada(archivo,campo); 
        mezcla.mezclaBalanceada(archivo.getAbsolutePath());
    
   
    }
   
}
