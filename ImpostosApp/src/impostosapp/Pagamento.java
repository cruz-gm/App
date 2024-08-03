
package impostosapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Guilherme
 */
public class Pagamento {
    private String nomeEmpresa; 
    List<Imposto> pagamentos = new ArrayList<>();
    
    
    public Pagamento(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public List<Imposto> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Imposto> pagamentos) {
        this.pagamentos = pagamentos;
    }
       
    
    public void cadastrarImposto(){
        Scanner input = new Scanner(System.in, "latin1");
        String opcaoImposto = "PIS";
  

        while(!opcaoImposto.equals("PARE")){
        System.out.println("Por favor, informe o tipo de imposto que deseja cadastrar: PIS, IPI, digite DADOS para resumo de"
                + " impostos cadastrados ou digite PARE para sair.");
        opcaoImposto = input.nextLine();
         
            switch(opcaoImposto){
                case "PIS":
                    Pis pis = new Pis("PIS");
                    pis.executar();
                    
                    pagamentos.add(pis);              
                    
                    break;  
                    
                case "IPI":
                    Ipi ipi = new Ipi("IPI");
                    ipi.executar();
                    
                    pagamentos.add(ipi);
                    
                    break;
                    
                case "DADOS":
          
                    for(int i = 0; i < pagamentos.size(); i++){
                        System.out.println(pagamentos.get(i));
                    }
                     
                    break;
                    
                
            }

            
            
        }
       
                        
    }
    
}
