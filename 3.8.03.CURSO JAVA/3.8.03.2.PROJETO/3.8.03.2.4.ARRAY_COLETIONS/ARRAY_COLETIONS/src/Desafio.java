import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas: ");
        int quantidadeNotas = entrada.nextInt();

        double[] notas = new double[quantidadeNotas];

        for(int i = 0; i < notas.length; i++){
            System.out.print("Informe da nota: " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota: notas){
            total += nota;
        }
        double media = total /notas.length;
        System.out.println("Media: " + media);
        
        entrada.close();
    }

}
