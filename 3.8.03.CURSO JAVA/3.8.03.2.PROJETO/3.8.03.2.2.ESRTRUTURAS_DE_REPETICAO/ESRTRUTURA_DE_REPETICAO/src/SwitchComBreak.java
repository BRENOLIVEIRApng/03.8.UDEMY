import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String conceito = "";
        System.out.println("Digite uma conceito: ");
        int nota = sc.nextInt();
        switch (nota) {
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "B";
                break;
            case 8:
                conceito = "C";
                break;
            case 7: case 6: case 5: case 4: case 3:
                conceito = "D";
                break;
            default:
                conceito = "não informado";

        }
        System.out.println("Conceito é: " + conceito);

        sc.close();
    }
}
