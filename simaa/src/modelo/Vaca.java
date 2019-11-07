/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author iago-
 */
public class Vaca {
    private String brinco;

    public String getBrinco() {
        return brinco;
    }

    public void setBrinco(String brinco) {
        this.brinco = brinco;
    }

    @Override
    public String toString() {
        return "Vaca{" + "brinco=" + brinco + '}';
    }
    
}
