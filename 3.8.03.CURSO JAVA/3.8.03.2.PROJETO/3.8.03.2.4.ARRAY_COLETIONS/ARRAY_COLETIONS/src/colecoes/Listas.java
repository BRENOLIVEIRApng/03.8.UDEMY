package colecoes;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Otavio");

        lista.add(u1);
        lista.add(new Usuario("Breno"));
        lista.add(new Usuario("Fabio"));
        lista.add(new Usuario("Lilian"));
        lista.add(new Usuario("Lucas"));
        lista.add(new Usuario("David"));

        System.out.println(lista.get(3).nome);

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

    }
}
