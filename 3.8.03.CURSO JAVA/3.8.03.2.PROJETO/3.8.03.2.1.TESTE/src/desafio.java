
public class desafio {

    public static void main(String[] args) {
        //(°F - 32) x 5/9 = °C
        final Double FATOR = 5.0 / 9.0;
        final int AJUSTE = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C.");

    }
}
