import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("infomrme o numero");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("Número par");
        }

        if (numero % 3 == 1){
            System.out.println("Número ímpar!");
        }

        if (numero % 2 == 0){
            System.out.println("Numero par!");
        } else 
            System.out.println("Numero impar");

    
    }
}
