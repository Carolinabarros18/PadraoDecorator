

/**
 *
 * @author CAROL
 */
 package cookingdecorator;
public class SaborBaunilha extends Bolo{
   

    public SaborBaunilha() {

        this.setNome("Baunilha");
    }

    @Override
    public String getAdcionais() {

        return "Massa + Baunilha\n";
    }

    @Override
    public double getValor() {

        return 3.0;
    }

}
    

