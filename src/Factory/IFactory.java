/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Encrypt.IEncryptAlgorithm;

/**
 *
 * @author Gabriel
 */
public interface IFactory {
    public IEncryptAlgorithm getInstace(String type);
}
