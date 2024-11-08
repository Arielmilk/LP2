
package euc.ifba.edu.br.avaliacao3;
import java.util.Scanner;
/**
 *
 * @author ariel.franca
 */

/*             ****    IMPORTANTE ********

      EXPORTA E ENVIAR O PROJETO AVALIACAO3.ZIP PARA 

            evilasio.junior@ifba.edu.br

  Confirme se o projeto foi adicionado corretamente no email

*/

public class Questao02 {

    public static void main(String[] args) {
        //Questão 02 - Açaí na Tigela (2,0)

        System.out.println("Questão 02 - Açaí na Tigela");
        
        // DESENVOLVA A QUESTÃO A PARTIR DA PRÓXIMA LINHA
        Scanner teclado = new Scanner(System.in);
        String comp[] = new String[5];
        for (int i = 0; i < comp.length; i++) {
            System.out.println("Escolha "+(5-i)+" complementos");
            comp[i] = teclado.nextLine();
        }
        System.out.println("Produto : Açai na Tigela - 500g");
        System.out.println("Complementos :");
        for (int i = 0; i < comp.length; i++) {
            System.out.println((i+1)+"-"+ comp[i]);
        }
    }
}
