/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso3diseno;

import Encrypt.IEncryptAlgorithm;
import Factory.Factory;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Caso3Diseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Factory tests = new Factory();
        Scanner configuracion = new Scanner(new File("config.txt"));
        String encryptionMethod = configuracion.next();
        IEncryptAlgorithm encrypt = tests.getInstace(encryptionMethod);
        String message = "<Persona><Nombre>Oscar Blancarte</Nombre></Persona>";
        //String password = "QT58QZ3SZ518305Z";
        String password = "ap";
        String encrypted = encrypt.encrypt(message, password);
        System.out.print(encrypted);
    }
    
}
