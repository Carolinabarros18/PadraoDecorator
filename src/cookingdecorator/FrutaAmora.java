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

    public class FrutaAmora extends Frutas {

    public FrutaAmora(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return this.getBolo().getAdcionais() + "Adicionando a fruta: Amora\n" ;
    }

    @Override
    public double getValor() {

        return 2.0 + this.getBolo().getValor();
    }

}

