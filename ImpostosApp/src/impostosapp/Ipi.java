
package impostosapp;

import java.util.Scanner;

/**
 * @author Guilherme
 */
public class Ipi extends Imposto {
    private float valorProduto;
    private float valorFrete;
    private float seguro;
    private float outrasDespesas;
    private float aliquota;
    private float resultado;
    private float impostoIpi;

    public Ipi(float valorProduto, float valorFrete, float seguro, float outrasDespesas, float aliquota, String _descricao) {
        super(_descricao);
        this.valorProduto = valorProduto;
        this.valorFrete = valorFrete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }

    public Ipi(String _descricao) {
        super(_descricao);
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public float getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        this.valorFrete = valorFrete;
    }

    public float getSeguro() {
        return seguro;
    }

    public void setSeguro(float seguro) {
        this.seguro = seguro;
    }

    public float getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(float outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public float getAliquota() {
        return aliquota;
    }

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float getImpostoIpi() {
        return impostoIpi;
    }

    public void setImpostoIpi(float impostoIpi) {
        this.impostoIpi = impostoIpi;
    }
    
    
    
    

    @Override
    public void calcularImposto() {
            resultado = (valorProduto + valorFrete + seguro + outrasDespesas) * impostoIpi;    
    }

            
    
    @Override
    public void executar() {
        Scanner input = new Scanner(System.in, "latin1");
        
        System.out.println("-- Você escolheu cadastrar IPI --");
        
        System.out.println("Por favor, digite o valor do produto: ");
        valorProduto = input.nextFloat();
        
        System.out.println("Agora, digite o valor do frete: ");
        valorFrete = input.nextFloat();
        
        System.out.println("Agora, digite o valor do seguro:  ");
        seguro = input.nextFloat();
        
        System.out.println("Agora, digite o valor de outras despesas: ");
        outrasDespesas = input.nextFloat();
        
        System.out.println("Agora por ultimo, digite a aliquota: ");
        aliquota = input.nextFloat();
        
        impostoIpi = aliquota / 100;
        
        calcularImposto();
       
        
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ", Valor do produto: R$" + valorProduto + ", Valor do frete:"
                + " R$" + valorFrete + ", Seguro R$" + seguro + ", Outras despesas: R$" + outrasDespesas + ","
                + " Aliquota: %" + aliquota + ", Total a pagar: R$" + resultado;
    }
}
