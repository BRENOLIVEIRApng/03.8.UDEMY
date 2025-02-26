
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        System.out.print("Bom dia");
        System.out.println(" !!!");

        System.out.println("Bom");
        System.out.println("Dia!");

        System.out.printf("Megasena %s %s %s %s %s %s\n", 1, 2, 3, 4, 5, 6);

        //Pega tudo que for solicitado do cliente *teclado*
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite seu idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.",nome, sobrenome, idade);

        entrada.close();
    }
}
