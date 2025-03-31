import java.util.Arrays;

public class Execicio {
    public static void main(String[] args) {
        
        double notasAlunoA[] = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 1.0;
        notasAlunoA[2] = 9.6;

        Arrays.toString(notasAlunoA);
        System.out.println(notasAlunoA);

        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        double notasAlunoB[] = {6.9, 8.9, 5.5, 10};

        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);
    }

}
