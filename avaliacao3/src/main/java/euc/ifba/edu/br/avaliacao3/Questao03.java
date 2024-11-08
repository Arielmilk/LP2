
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

public class    Questao03 {

    public static void main(String[] args) {
        //Questão 03 - Macarrão ao Vivo (3,5)

        System.out.println("Questão 03 - Macarrão ao Vivo");

        // DESENVOLVA A QUESTÃO A PARTIR DA PRÓXIMA LINHA
        Scanner teclado = new Scanner(System.in);
        String ing[] = new String[5];
        ing[0] = "Molho de tomate";
        ing[1] = "Alcaparras";
        ing[2] = "Queijo ralado";
        ing[3] = "Cebola";
        ing[4] = "Alho";

        System.out.println("Novo pedido");
        for (int i = 0; i < ing.length; i++) {
            System.out.println((i + 1) + "-" + ing[i]);
        }
        System.out.println("Escolha qual ingrediente quer trocar");
        String esc = teclado.nextLine();
        System.out.println("Escolha o novo ingrediente");
        String nov = teclado.nextLine();
        for (int i = 0; i < ing.length; i++) {
            int c = 0;
            if (esc.equals(ing[i])) {
                ing[i] = nov;
            } else {
                c = (c + 1);
            }
            if (c == 5) {
                System.out.println("Escolha um ingrediente disponivel");
            }
        }
            System.out.println("Novo pedido");
            for (int i = 0; i < ing.length; i++) {
                System.out.println((i + 1) + "-" + ing[i]);
            }
        }
    }