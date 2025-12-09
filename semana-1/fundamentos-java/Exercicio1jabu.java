import java.util.Scanner;

public class Exercicio1jabu{

    public static void main(String[] args) {
        //declaracao de variaveis
        int anodenascimento;
        String nome;
        Scanner teclado = new Scanner(System.in);

        //receber dados por teclado
        System.out.println("digite o nome");
        nome = teclado.nextLine();
        System.out.println("digite o ano de nascimento");
        anodenascimento = teclado.nextInt();


        //saida de dados
        System.out.println("nome: "+nome);
        System.out.println("ano de nascimento: "+anodenascimento);


    }
}