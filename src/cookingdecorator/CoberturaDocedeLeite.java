

/**
 *
 * @author CAROL
 */
 package cookingdecorator;
public class CoberturaDocedeLeite extends Cobertura {

    public CoberturaDocedeLeite(Bolo b) {
        super(b);
    }
    
    @Override
    public String getAdcionais() {
        
        return  this.getBolo().getAdcionais() + "Adicionando a cobertura: Doce de leite\n";
   }

    @Override
    public double getValor() {
        
        return 1.50 + this.getBolo().getValor();
   }
    
}

