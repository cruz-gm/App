
package impostosapp;

/**
 * @author Guilherme
 */
public abstract class Imposto {
    private String descricao;
    
    
    public Imposto(String _descricao){
        this.descricao = _descricao;
    }
    
    
    public Imposto(){};

    
    @Override
    public String toString(){
        return "Tipo de imposto: " + descricao;
    }
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public abstract void executar();
    
    
    public abstract void calcularImposto();
    
   
}




