import java.util.Scanner;

public class Exercicio1Cjabu {
    
    public static void main(String[] args) {
        //declaracao de variaveis
        int anodenascimento1;
        int anodenascimento2;
        int anodenascimento3;
        int anodenascimento4;
        int anodenascimento5;
        String nome1;
        String nome2;
        String nome3;
        String nome4;
        String nome5;
        int idade1;
        int idade2;
        int idade3;
        int idade4;
        int idade5;
        int anoatual = 2025;
    
        Scanner teclado = new Scanner(System.in);

        //receber dados por teclado
        System.out.println("digite o nome");
        nome1 = teclado.nextLine();
        System.out.println("digite o ano de nascimento");
        anodenascimento1 = teclado.nextInt();
        teclado.nextLine();
    
           

        System.out.println("digite o nome2");
        nome2 = teclado.nextLine();
        System.out.println("digite o ano de nascimento2");
        anodenascimento2 = teclado.nextInt();
        teclado.nextLine();


     

        System.out.println("digite o nome3");
        nome3 = teclado.nextLine();
        System.out.println("digite o ano de nascimento3");
        anodenascimento3 = teclado.nextInt();
        teclado.nextLine();


    

        System.out.println("digite o nome4");
        nome4 = teclado.nextLine();
        System.out.println("digite o ano de nascimento4");
        anodenascimento4 = teclado.nextInt();
        teclado.nextLine();


    

        System.out.println("digite o nome5");
        nome5 = teclado.nextLine();
        System.out.println("digite o ano de nascimento5");
        anodenascimento5 = teclado.nextInt();
        teclado.nextLine();


        idade1 = anoatual - anodenascimento1;
        idade2 = anoatual - anodenascimento2; 
        idade3 = anoatual - anodenascimento3;
        idade4 = anoatual - anodenascimento4;  
        idade5 = anoatual - anodenascimento5;    

        //saida de dados
        System.out.println("nome: "+nome1);
        System.out.println("idade: "+idade1);

        //saida de dados
        System.out.println("nome: "+nome2);
        System.out.println("idade: "+idade2);

        //saida de dados
        System.out.println("nome: "+nome3);
        System.out.println("idade: "+idade3);

        //saida de dados
        System.out.println("nome: "+nome4);
        System.out.println("idade: "+idade4);

        //saida de dados
        System.out.println("nome: "+nome5);
        System.out.println("idade: "+idade5);
    }
}
