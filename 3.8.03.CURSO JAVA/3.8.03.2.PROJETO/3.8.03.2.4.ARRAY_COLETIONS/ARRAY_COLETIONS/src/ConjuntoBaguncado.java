import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(40028922);
        conjunto.add("breno@gmail.com");
        conjunto.add(true);

        System.out.printf("Tamanho é: " + conjunto.size());
    }
}
