import java.util.Scanner;

public class Aula2B {

    public static void main(String[] args) {
        //declaracao de variaveis
        int anodenascimento;
        String nome;
        int anoatual = 2025;
        int idade;
        String situacaodapessoa;
        Scanner teclado = new Scanner(System.in);

        //receber dados por teclado
        System.out.println("digite o nome");
        nome = teclado.nextLine();
        System.out.println("digite o ano de nascimento");
        anodenascimento = teclado.nextInt();


idade = anoatual - anodenascimento;


            if (idade>=18 & idade<=65)  {
                situacaodapessoa = "pode votar";
            
            } else {
                situacaodapessoa = "nao pode votar";
            }


System.out.println("O "+nome+" tem "+ idade +" anos de idade e ele/a " + situacaodapessoa);

    }
}