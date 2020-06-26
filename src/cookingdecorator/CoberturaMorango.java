
package cookingdecorator;

public class CoberturaMorango extends Cobertura {

    public CoberturaMorango(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return  this.getBolo().getAdcionais() + "Adicionando a cobertura: Morango\n" ;
    }

    @Override
    public double getValor() {

        return 2.0 + this.getBolo().getValor();
    }

}