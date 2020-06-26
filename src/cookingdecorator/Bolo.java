

/**
 *
 * @author CAROL
 */
   package cookingdecorator;


public abstract class Bolo {
    
    private String nome;
    
    public abstract String getAdcionais();
    public abstract double getValor();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
    

