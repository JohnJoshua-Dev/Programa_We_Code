import java.util.*;
public class Aula3 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        //Estrutura de repetição Para - Árvore
        int altura = 7;
        for (int i = 0; i < altura; i++) {
            // Imprime espaços para centralizar
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            // Imprime asteriscos
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        // Estrutura de repetição Enquanto - (While e do while)
         int ano;
        String nome;
        int controlador =1;

        //a
        while(controlador==1){
        System.out.println("Digite o nome:");
        nome =x.nextLine();
        System.out.println("Digite o ano:");
        ano = x.nextInt();
        x.nextLine();  
            System.out.println("Exercicio A:");
         System.out.println("Nome: " + nome + " Ano: " + ano);

         System.out.println("Deseja continuar? 1-Sim 0-Não");
         controlador = x.nextInt();
         x.nextLine();

        }

     

    }
}
