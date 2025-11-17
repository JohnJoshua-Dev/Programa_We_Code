
import java.util.Scanner;

public class Sintese {
    
    public static String nomeAno(String nome, int ano){
    return "O "+nome+" nasceu no ano "+ano;
    }

    public static int Idade( int ano){
        int anoAtual = 2025;
      return anoAtual-ano;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int ano;
        String nome;


        //a
        System.out.println("Digite o nome:");
        nome =x.nextLine();
        System.out.println("Digite o ano:");
        ano = x.nextInt();
        x.nextLine();  
            System.out.println("Exercicio A:");
         System.out.println(nomeAno(nome,ano));


         //b
            System.out.println("Exercicio B:");
         System.out.println("O "+nome+" tem "+Idade(ano)+" anos de Idade");

         //c 
         System.out.println("Exercicio C: Informe 5 nomes e anos de nascimento");
         int anos[]= new int[5];
         String nomes[]= new String[5];
        

         for (int i = 0; i < 5; i++) {
             System.out.println("Digite o nome"+(i+1));
             nomes[i]=x.nextLine();
            System.out.println("Digite o ano"+(i+1));
             anos[i]=x.nextInt();
                x.nextLine();
         };
            System.out.println("Exercicio C:");
         for (int i = 0; i < 5; i++) {
            System.out.println("Nome: "+nomes[i]+" Idade: "+Idade(anos[i]));
            
         }
         
    }

}
