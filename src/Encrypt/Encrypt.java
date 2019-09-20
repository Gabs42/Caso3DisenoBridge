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
public class Encrypt {
    
    public String encrypt(String message,char character1,char character2){
        StringBuilder x = new StringBuilder(message);
        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            if(Character.toLowerCase(c)==Character.toLowerCase(character1)){
                x.setCharAt(i,character2);
            }
        }
        return x.toString();
    }
}
