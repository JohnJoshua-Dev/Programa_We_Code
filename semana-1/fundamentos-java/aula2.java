
import java.util.Scanner;

public class aula2 {

    //declaração de Variaveis
    public static void main(String[] args) {

        int idade;
        String nome;
        Scanner teclado = new Scanner(System.in);

        //atribuindo valores
        System.out.print("Digite sua idade: ");
         idade = teclado.nextInt();
        // scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();  
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }

}
