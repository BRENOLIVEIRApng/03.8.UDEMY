package Classes;

//a base principal e por que seo sout e 'a' nao aparece
//so consigo ver o valor de a mesmo estando dentro da classe
//pois preciso instanciar e contruir o caminho para o acesso
//de outra forma nao consigo mostar o valor de a 

public class primeiroTrauma {

    int a = 3;//aqui eu nao posso modificar

    public static void main(String[] args) {

        primeiroTrauma p = new primeiroTrauma();//explicacao na 6 e 7 linha
        System.out.println(p.a);//aqui eu posso mexer abertamente
    }

}
