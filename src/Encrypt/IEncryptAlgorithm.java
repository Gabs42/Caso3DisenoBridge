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
public interface IEncryptAlgorithm {
    public String encrypt(String message,String password)throws Exception;
}
