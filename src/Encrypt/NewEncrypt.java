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
public class NewEncrypt implements IEncryptAlgorithm {

    @Override
    public String encrypt(String message, String password) throws Exception {
        StringBuilder x = new StringBuilder(message);
        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            if(c=='A'||c=='a'){
                x.setCharAt(i,'@');
            }
            else if(c=='S'||c=='s'){
                x.setCharAt(i,'5');
            }
        }
       return x.toString();
    }
    
}
