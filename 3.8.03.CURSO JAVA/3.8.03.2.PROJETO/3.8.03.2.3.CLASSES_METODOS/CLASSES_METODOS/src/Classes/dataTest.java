package Classes;

public class dataTest {
public static void main(String[] args) {

    Data d1 = new Data();
    d1.dia = 07;
    d1.mes = 11;
    d1.ano = 2025;

    System.out.printf("%d/%d/%d",d1.dia,d1.mes,d1.ano);

    var d2 =  new Data();
    d2.dia = 27;
    d2.mes = 12;
    d2.ano = 2002;

    System.out.printf("\n%d/%d/%d",d2.dia,d2.mes,d2.ano);
}
}
