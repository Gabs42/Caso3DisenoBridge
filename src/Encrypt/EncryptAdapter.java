/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encrypt;

/**
 *
 * @author Gabriel
 */
public class EncryptAdapter implements IEncryptAlgorithm {

    @Override
    public String encrypt(String message, String password) throws Exception {
        Encrypt en = new Encrypt();
        return en.encrypt(message,password.charAt(0),password.charAt(1));
    }
    
}
