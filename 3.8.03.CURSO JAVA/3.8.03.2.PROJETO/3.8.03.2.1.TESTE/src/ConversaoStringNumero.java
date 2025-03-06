
import javax.swing.JOptionPane;


public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");

        
        System.out.println(valor1 + valor2);
        
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        //boolean sim = true;
        //boolean nao = false;
        
        double soma = numero1 + numero2;
        System.out.println("Soma é:"+soma);
        System.out.println("Média é:"+soma/2);
        JOptionPane.showInputDialog(soma);
        JOptionPane.showInputDialog("Foi esse o valor da soma");
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja somar os valores?", "Confirmação", JOptionPane.YES_NO_OPTION);

if (escolha == JOptionPane.YES_OPTION) {
    int resultado = 20 + 30; // Exemplo de soma
    JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
}

    }
}
