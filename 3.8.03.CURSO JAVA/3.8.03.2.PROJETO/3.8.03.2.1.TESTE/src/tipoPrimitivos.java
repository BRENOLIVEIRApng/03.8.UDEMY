public class tipoPrimitivos {
    public static void main(String[] args) {
        //Informação do funcionado

        //Tipos númericos inteiros
        byte anosDeEmpresa = 23;
        short numeroVoos= 32767;
        int id = 56789;
        long pontosAcumulados = 1234845223;

        //Tipos númeiricos reais
        float salario = 1.444F;
        double vendasAcumaladas = 2_991_797_103.01;

        //Tipo boleano
        boolean estadoFerias = false; //True

        //Tipo caractere
        char status = 'A'; //Ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numero de viagens
        System.out.println(numeroVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumaladas);

        System.out.println(id + ":ganha ->" + salario);
        System.out.println("Ferias?" + estadoFerias);
        System.out.println("Status:" + status);

    }
}
