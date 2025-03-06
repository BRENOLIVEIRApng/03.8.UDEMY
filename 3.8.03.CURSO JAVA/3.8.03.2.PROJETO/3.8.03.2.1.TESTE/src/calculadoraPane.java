import javax.swing.JOptionPane;

public class calculadoraPane {
    public static void main(String[] args) {
        while (true) {
            try {
                // Obtém os números
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
                
                // Escolha da operação
                String[] operacoes = {"Soma (+)", "Subtração (-)", "Multiplicação (*)", "Divisão (/)", "Sair"};
                int escolha = JOptionPane.showOptionDialog(null, "Escolha a operação:", "Calculadora",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);
                
                double resultado = 0;
                String operacao = "";
                boolean calcular = true;
                
                switch (escolha) {
                    case 0: // Soma
                        operacao = "+";
                        resultado = num1 + num2;
                        break;
                    case 1: // Subtração
                        operacao = "-";
                        resultado = num1 - num2;
                        break;
                    case 2: // Multiplicação
                        operacao = "*";
                        resultado = num1 * num2;
                        break;
                    case 3: // Divisão
                        operacao = "/";
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                            calcular = false;
                        }
                        break;
                    case 4: // Sair
                        JOptionPane.showMessageDialog(null, "Calculadora encerrada.");
                        System.exit(0);
                        break;
                    default:
                        calcular = false;
                }
                
                if (calcular) {
                    // Confirmação do cálculo
                    int confirmacao = JOptionPane.showConfirmDialog(null,
                            "Deseja calcular: " + num1 + " " + operacao + " " + num2 + " ?",
                            "Confirmação",
                            JOptionPane.YES_NO_OPTION);
                    
                    if (confirmacao == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação cancelada.");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}