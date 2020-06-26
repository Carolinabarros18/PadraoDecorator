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

    public class FrutaPêssego extends Frutas {

    public FrutaPêssego(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return this.getBolo().getAdcionais() + "Adicionando a fruta: Pêssego\n" ;
    }

    @Override
    public double getValor() {

        return 1.50 + this.getBolo().getValor();
    }

}
