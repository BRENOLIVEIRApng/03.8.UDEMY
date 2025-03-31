
public class EqualsHashcode {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Breno Oliveira";
        u1.email = "breno@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Breno Oliveira";
        u2.email = "breno@gmail.com";
        System.out.println(u1.equals(u2));
    }

}
