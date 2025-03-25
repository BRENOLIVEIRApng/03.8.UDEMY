package Exe01;

public class resposta {

    int dia;
    int mes;
    int ano;

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
