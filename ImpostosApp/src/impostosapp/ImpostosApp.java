
package impostosapp;

import java.util.Scanner;

/**
 * @author Guilherme
 */
public class ImpostosApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "latin1");
        
        System.out.println(" --- Seja bem vindo ---");
        
        System.out.println("Por favor digite o nome da empresa que deseja cadastrar os impostos: ");
        String empresa = input.nextLine();
        
        Pagamento pagamento = new Pagamento(empresa);
        
        pagamento.cadastrarImposto();
        
    }
    
}
