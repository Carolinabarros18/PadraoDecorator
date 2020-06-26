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
public class SaborLaranja extends Bolo{
 
    public SaborLaranja() {

        this.setNome("Laranja");
    }

    @Override
    public String getAdcionais() {

        return "Massa + Laranja\n";
    }

    @Override
    public double getValor() {

        return 5.0;
    }

}
    

