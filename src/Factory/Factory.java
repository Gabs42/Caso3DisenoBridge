/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Encrypt.AESEncryptAlgorithm;
import Encrypt.DESEncryptAlgorithm;
import Encrypt.EncryptAdapter;
import Encrypt.IEncryptAlgorithm;
import Encrypt.NOEncryptAlgorithm;
import Encrypt.NewEncrypt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel
 */
public class Factory implements IFactory {
    

    @Override
    public IEncryptAlgorithm getInstace(String type) {
            if(type.equalsIgnoreCase("AES")){
                return new AESEncryptAlgorithm();
            }
            else if(type.equalsIgnoreCase("DES")){
                return new DESEncryptAlgorithm();
            }
            else if(type.equalsIgnoreCase("NO")){
                return new NOEncryptAlgorithm();
            }
            
            else if(type.equalsIgnoreCase("NEW")){
                return new NewEncrypt();
            }
            
            else if(type.equalsIgnoreCase("ADAPTER")){
                return new EncryptAdapter();
            }
            return null;
    }
}
