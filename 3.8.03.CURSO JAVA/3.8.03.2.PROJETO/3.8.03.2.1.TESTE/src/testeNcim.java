import java.util.Scanner;

public class testeNcim {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senha = 40028922;
        System.out.println("Digite sua senha:");
        int valor1 = entrada.nextInt();

        if (valor1 == senha)     {
            System.out.println("Senha correta!");   
        } else{
            System.err.println("Senha Incorreta!\nTeste no Nvim");
        }

    }
}
