
/**
 *
 * @author CAROL
 */
   package cookingdecorator;
public class CoberturaChocolate  extends Cobertura {
    


    public CoberturaChocolate(Bolo b) {
        super(b);
    }

    @Override
    public String getAdcionais() {

        return  this.getBolo().getAdcionais() + "Adicionando acobertura: Chocolate\n";
    }

    @Override
    public double getValor() {

        return 2.25 + this.getBolo().getValor();
    }

}

    
