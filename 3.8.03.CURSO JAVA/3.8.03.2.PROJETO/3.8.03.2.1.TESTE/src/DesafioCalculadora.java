import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:\n");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o segundo numero:\n");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação:\n");
        String operacao = entrada.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao)? num1 - num2 : resultado;
        resultado = "*".equals(operacao)? num1 * num2 : resultado;
        resultado = "/".equals(operacao)? num1 / num2 : resultado;

        System.out.printf("%f %s %f = %.2f", num1, operacao, num2, resultado);


        entrada.close();
    }
}
