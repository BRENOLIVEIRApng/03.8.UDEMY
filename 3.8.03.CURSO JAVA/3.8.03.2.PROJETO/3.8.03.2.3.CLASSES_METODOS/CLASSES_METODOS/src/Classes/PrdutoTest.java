package Classes;

public class PrdutoTest {
public static void main(String[] args) {

    Produto p1 = new Produto();
    p1.nome = "Notebook";
    p1.preco = 4345.65;
    p1.desconto = 0.32;

    var p2 = new Produto();
    p2.nome = "Caneta";
    p2.preco = 12.34;
    p2.desconto = 0.25;

    System.out.println(p1.nome);
    System.out.println(p2.nome);

    double precoFinal1 = p1.preco * (1 - p1.desconto);
    double precoFinal2 = p2.preco * (1 - p2.desconto);
    double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
    System.out.printf("Media do carrinho = R$ %.2f", mediaCarrinho);
}
}
