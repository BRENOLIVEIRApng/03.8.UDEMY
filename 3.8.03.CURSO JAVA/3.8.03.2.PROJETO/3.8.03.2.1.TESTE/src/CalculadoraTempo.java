import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class CalculadoraTempo {
    public static void main(String[] args) {
        // Obtém o horário atual do sistema
        LocalTime agora = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        
        // Exibe o horário atual
        JOptionPane.showMessageDialog(null, "Horário atual: " + agora.format(formatter));
        
        try {
            // Solicita um horário ao usuário
            String input = JOptionPane.showInputDialog("Digite o horário desejado (HH:mm):");
            LocalTime horarioDestino = LocalTime.parse(input, formatter);
            
            // Calcula a diferença de tempo
            Duration duracao = Duration.between(agora, horarioDestino);
            long horas = duracao.toHours();
            long minutos = duracao.toMinutes() % 60;
            
            if (duracao.isNegative()) {
                JOptionPane.showMessageDialog(null, "O horário informado já passou!");
            } else {
                JOptionPane.showMessageDialog(null, "Faltam " + horas + " horas e " + minutos + " minutos para " + horarioDestino.format(formatter));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! Digite um horário válido no formato HH:mm", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
