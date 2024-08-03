
package impostosapp;

import java.util.Scanner;

/**
 * @author Guilherme
 */
public class Pis extends Imposto{
    private float valorTotalDebito;
    private float valorTotalCredito;
    private float impostoPis;
    private float aliquota;
    private float resultado;
    
    
    public Pis(String _descricao, float valorTotalDebito, float valorTotalCredito, float impostoPis){
        super(_descricao);
        this.valorTotalDebito = valorTotalDebito;
        this.valorTotalCredito = valorTotalCredito;
        this.impostoPis = impostoPis;
    }
    
    public Pis(String _descricao){
        super(_descricao);
    }

    
    public float getValorTotalDebito() {
        return valorTotalDebito;
    }

    public void setValorTotalDebito(float valorTotalDebito) {
        this.valorTotalDebito = valorTotalDebito;
    }

    public float getValorTotalCredito() {
        return valorTotalCredito;
    }

    public void setValorTotalCredito(float valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
    }

    public float getImpostoPis() {
        return impostoPis;
    }

    public void setImpostoPis(float impostoPis) {
        this.impostoPis = impostoPis;
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
    
    
    
    
    
    @Override
    public void calcularImposto() {      
        resultado = (valorTotalDebito - valorTotalCredito) * impostoPis;
        
    }

            
    
    @Override
    public void executar() {
        Scanner input = new Scanner(System.in, "latin1");
        
        System.out.println("-- Você escolheu cadastrar PIS --");
        
        System.out.println("Por favor, digite primeiro o valor total do debito: ");
        valorTotalDebito = input.nextFloat();
        
        System.out.println("Agora, digite o valor total do credito: ");
        valorTotalCredito = input.nextFloat();
        
        System.out.println("Agora por ultimo, digite a aliquota: ");
        aliquota = input.nextFloat();
        
        impostoPis = aliquota / 100;
        
        calcularImposto();
       
        
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Valor total do debito: R$" + valorTotalDebito + ", Valor total do"
                + " crédito: R$" + valorTotalCredito + ", Aliquota %" + aliquota + ", Total a pagar: R$" + resultado;
    }
    
}
