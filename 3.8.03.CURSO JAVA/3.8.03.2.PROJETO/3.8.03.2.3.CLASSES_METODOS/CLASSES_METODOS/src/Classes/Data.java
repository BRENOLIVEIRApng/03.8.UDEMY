package Classes;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        //dia = 1;
        //mes = 12;
        //ano = 2022;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada(){
        String formato  = "%d/%d/%d";//local + variavel de instacia
        return String.format(formato, dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }

}
