import java.util.Scanner;

public class DesafioIf {
    public static void main (String [] args){
        //desafio e entender o motivo desse bug
        //double nota = 1.3;
        
        //if (nota >= 9.0){
         //   System.out.println("Quadro de hora!");
         //   System.out.println("Você é demais!");
       // }

        System.out.println("Vamos resolver abaixo!");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a verdadeira nota do aluno:");
        double media = entrada.nextDouble();

        if (media >= 4.5 && media >= 7.0){
            System.out.println("Recuperação!");
        } else{
            System.out.println("Reprovado!");
        }
        /* 
        if (media >= 7.0){
            System.out.println("Aprovado!");
        }
        */ 
        entrada.close();
    }
}
