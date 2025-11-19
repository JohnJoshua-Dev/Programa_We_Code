import java.util.Scanner;

public class Aula2{


public static void main(String[] args) {
        String nome;
        float nota1;
        float nota2;
        float media;
        String situacaodoaluno;
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o nome");
        nome = teclado.nextLine();
        System.out.println("digite a nota1");
        nota1 = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("digite a nota2");
        nota2 = teclado.nextFloat();
        teclado.nextLine();

            media = (nota1 + nota2) / 2;

            if (media>=14) {
                situacaodoaluno = "Dispensado";

            
            } else if(media>=10) {
                situacaodoaluno = "Adimitido";

            } else{
                situacaodoaluno="Reprovado";
            }

            System.out.println("O "+nome+" teve nota1 "+ nota1+" nota2 "+nota2+"\n A sua media e:" +media + "o aluno esta: "+ situacaodoaluno);
            
}
}