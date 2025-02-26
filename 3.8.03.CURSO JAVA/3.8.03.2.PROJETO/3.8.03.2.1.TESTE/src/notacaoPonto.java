
public class notacaoPonto {

    public static void main(String[] args) {
        double a = 2.3;
        String s = "Bom dia X";
        s = s.toUpperCase();
        //Realiza a troca / replace
        s = s.replace("X", "Senhor");
        s = s.concat("!!!");

        System.out.println(a);
        System.out.println(s);
        System.out.println("Leo".toUpperCase());
        //Tipos primitivos não possui pontos
    }
}
