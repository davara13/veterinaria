/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilicensable1;

/**
 *
 * @author daaariaspa
 */
public class Bird implements ISpeaking{
    public String especie;

    public Bird(String especie) {
        this.especie = especie;
    }
    
    @Override
    public  void speak(){
    
    }
}
