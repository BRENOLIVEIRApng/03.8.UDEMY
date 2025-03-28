import java.util.Arrays;

public class Execicio {
    public static void main(String[] args) {
        
        double notasAlunoA[] = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 1.0;
        notasAlunoA[2] = 9.6;

        Arrays.toString(notasAlunoA);
        System.out.println(notasAlunoA);

        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }

        System.out.println(total / 3);
    }

}
