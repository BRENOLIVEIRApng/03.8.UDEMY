import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos?: ");
        int quantidadeAlunos = sc.nextInt();

        System.out.println("Quantos notas por aluno?: ");
        int quantidadeNotas = sc.nextInt();

        double[][] notasTurma = new double[quantidadeAlunos][quantidadeNotas];
        double total = 0;
        for (int a = 0; a < notasTurma.length; a++) {
            for (int n = 0; n < notasTurma[a].length; n++) {
                System.out.printf("Informe a nota  %d do aluno %d:", n + 1, a + 1);
                notasTurma[a][n] = sc.nextDouble();
                total += notasTurma[a][n];
            }
        }

        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("Média da turma é: " + media);
    }
}
