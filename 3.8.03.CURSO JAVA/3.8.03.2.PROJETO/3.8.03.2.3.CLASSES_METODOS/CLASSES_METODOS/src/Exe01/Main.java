package Exe01;
import java.util.Scanner;

class Data{
    private int dia;
    private int mes;
    private int ano;


    public Data(int  dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public String formatarData(){
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}

 public class Main{
    public static Data obterDataFormatada(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o dia: ");
        int dia = entrada.nextInt();

        System.out.println("Informe o mes: ");
        int mes = entrada.nextInt();

        System.out.println("Informe o ano: ");
        int ano = entrada.nextInt();
        entrada.close();

        return new Data(dia,mes,ano);

    }

    public static void main(String[] args){

        Data data = obterDataFormatada();

        System.out.println("Data Formatada: " + data.formatarData());
    }
 }

