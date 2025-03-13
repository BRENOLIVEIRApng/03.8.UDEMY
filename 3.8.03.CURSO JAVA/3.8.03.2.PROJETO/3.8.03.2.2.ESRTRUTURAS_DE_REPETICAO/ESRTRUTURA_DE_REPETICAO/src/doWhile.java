
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        //if (...) setenca de codigo
        //while(...) setenca de codigo
        //for(...;...;...) setenca
        //do setenca; ou {} while(...);

        Scanner entrada = new Scanner(System.in);
        
        String valor = "";

        do { 
            System.out.println("Voce precisa falar as palavras certas");
            System.out.println("quer sair");
            valor = entrada.nextLine();
        } while (!valor.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        
        entrada.close();



    }
}
