import java.util.Scanner;

public class Exercicio1Bjabu{

    public static void main(String[] args) {
        //declaracao de variaveis
        int anodenascimento;
        String nome;
        int anoatual = 2025;
        int idade;
        Scanner teclado = new Scanner(System.in);

        //receber dados por teclado
        System.out.println("digite o nome");
        nome = teclado.nextLine();
        System.out.println("digite o ano de nascimento");
        anodenascimento = teclado.nextInt();




idade = anoatual - anodenascimento;


        //saida de dados
        System.out.println("nome: "+nome);
        System.out.println("idade: "+idade);



    }
}