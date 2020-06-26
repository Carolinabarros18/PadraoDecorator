
package cookingdecorator;

/**
 *
 * @author CAROL
 */
public class CookingDecorator {


    public static void main(String[] args) {

        Bolo bolo = new SaborChocolate();
        bolo = new CoberturaChocolate(bolo);
        bolo = new FrutaMorango(bolo);
        InformaçãoBolo.ResumoBolo(bolo);

        System.out.println("----");

        Bolo bolo2 = new SaborLimão();
        bolo2 = new FrutaPêssego(bolo2);
        InformaçãoBolo.ResumoBolo(bolo2);

        System.out.println("----");
        
        Bolo bolo3 = new SaborBaunilha();
        bolo3 = new CoberturaMorango(bolo3);
        bolo3 = new FrutaAmora(bolo3);
        InformaçãoBolo.ResumoBolo(bolo3);
        
         System.out.println("----");
         
        Bolo bolo4 = new SaborLaranja();
        bolo4 = new CoberturaDocedeLeite(bolo4);
        bolo4 = new FrutaPêssego(bolo4);
        InformaçãoBolo.ResumoBolo(bolo4);

    }

}



       