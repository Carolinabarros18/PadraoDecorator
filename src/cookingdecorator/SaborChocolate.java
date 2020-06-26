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
public class SaborChocolate extends Bolo {
   

    public SaborChocolate() {

        this.setNome("Chocolate");
    }

    @Override
    public String getAdcionais() {

        return "Massa + Chocolate\n";
    }

    @Override
    public double getValor() {

        return 6.0;
    }

    
}
