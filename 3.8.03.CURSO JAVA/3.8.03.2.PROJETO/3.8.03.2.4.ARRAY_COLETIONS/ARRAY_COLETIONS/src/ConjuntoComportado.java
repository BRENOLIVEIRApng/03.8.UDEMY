import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Breno Oliveira");
        listaAprovados.add("Juliana Oliveira");
        listaAprovados.add("Juju Du Buce");
        listaAprovados.add("Bruno Oliveira");
        listaAprovados.add("Maria Oliveira");
        listaAprovados.add("Juju Du Buce");

        for (String listaAprovado : listaAprovados) {
            System.out.println(listaAprovado);
        }

    }
}
