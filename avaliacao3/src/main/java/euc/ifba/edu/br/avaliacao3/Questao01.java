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

public class Questao01 {

    public static void main(String[] args) {
        //Questão 01 - Time de Futebol (1,0)

        System.out.println("Questão 01 - Time de Futebol");
        // DESENVOLVA A QUESTÃO A PARTIR DA PRÓXIMA LINHA
        Scanner teclado = new Scanner(System.in);
        String time[] = new String[12];
        for (int i = 0; i < time.length; i++) {
            if (i == 0) {
                System.out.println("Digite o nome do tecnico :");
            } else if (i>0){
                System.out.println("Nome do jogador : ");
            }
            time[i] = teclado.nextLine();


        }
        for (int i=0 ; i < time.length; i++){
            if (i == 0) {
                System.out.println("Tecnico :"+time[i]);
            } else if (i>0){
                System.out.println(i+" - "+time[i]);
            }
            }
    }
}
