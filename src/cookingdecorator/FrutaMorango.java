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

public class FrutaMorango extends Frutas {

    public FrutaMorango(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return this.getBolo().getAdcionais() + "Adicionando a fruta: Morango\n" ;
    }

    @Override
    public double getValor() {

        return 2.50 + this.getBolo().getValor();
    }

}

