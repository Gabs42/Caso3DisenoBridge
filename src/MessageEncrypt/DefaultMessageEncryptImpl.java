/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageEncrypt;

import Encrypt.IEncryptAlgorithm;

/**
 *
 * @author Gabriel
 */
public class DefaultMessageEncryptImpl implements IMessageEncrypt {
    private IEncryptAlgorithm encryptAlgorith;

    public DefaultMessageEncryptImpl(IEncryptAlgorithm encryptAlgorith) {
        this.encryptAlgorith = encryptAlgorith;
    }
    
    
    
    @Override
    public String encryptMessage(String message, String password) throws Exception {
        return encryptAlgorith.encrypt(message,password);
    }
    
}
