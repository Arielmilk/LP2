
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

public class Questao04 {

    public static void main(String[] args) {
        //Questão 04 - Notas da Turma (3,5)

        System.out.println("Questão 04 - Notas da Turma");
        
        // DESENVOLVA A QUESTÃO A PARTIR DA PRÓXIMA LINHA
        Scanner teclado = new Scanner(System.in);
        double not[] = new double[6];
        for (int i = 0; i < not.length; i++) {
            System.out.println("Digite a nota do "+(i+1)+"° aluno");
            not[i] = teclado.nextDouble();
        }
        double menor = not[0];
        double maior = not[0];
        for (int i = 0; i < not.length; i++) {
            if (not[i]<menor){menor=not[i];}
        }
        for (int i = 0; i < not.length; i++) {
            if (not[i]>maior){maior=not[i];}
        }

    }
}
