/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CAROL
 */
 package cookingdecorator;
public class SaborLimão extends Bolo {
     public SaborLimão() {

        this.setNome("Limão");
    }

    @Override
    public String getAdcionais() {

        return "Massa + Limão\n";
    }

    @Override
    public double getValor() {

        return 5.0;
    }

}
    
    
