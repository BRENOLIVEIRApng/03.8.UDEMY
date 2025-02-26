
public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1;//implícita
        System.out.println(a);

        int c = 4;//explícita (CAST)
        byte d = (byte) c;

        double e = 1;//explícita (CAST)
        int f = (int) e;
        System.out.println(f);

    }
}
