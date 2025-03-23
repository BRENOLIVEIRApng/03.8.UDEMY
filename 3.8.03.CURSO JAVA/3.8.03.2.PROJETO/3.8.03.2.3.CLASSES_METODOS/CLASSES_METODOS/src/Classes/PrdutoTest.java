package Classes;

public class PrdutoTest {
public static void main(String[] args) {

    Produto p1 = new Produto("Notebook", 34444);
    //p1.nome = "Notebook";
    //p1.preco = 4345.65;
    //p1.desconto = 0.32;

    Produto.desconto = 0.50;

    var p2 = new Produto("Caneta",12.50);
    //p2.nome = "Caneta";
    //p2.preco = 12.34;
    //p2.desconto = 0.25;

    System.out.println(p1.nome + "" + p1.precoComDesconto());
    System.out.println(p2.nome + "" + p2.precoComDesconto());

    double precoFinal1 = p1.precoComDesconto();
    double precoFinal2 = p2.precoComDesconto();
    double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
    System.out.printf("Media do carrinho = R$ %.2f", mediaCarrinho);
}
}
