public class tipoString {
public static void main(String[] args) {
    System.out.println("Olá pessoal".charAt(2));

    String s = "Boa tarde";
    //s = s.toUpperCase();
    System.out.println(s.concat("!!!"));
    System.out.println(s + "!!!");
    System.out.println(s.startsWith("Boa")); //True
    System.out.println(s.toLowerCase().startsWith("boa")); //True
    System.out.println(s.length());//Conta seu tamanho 
    System.out.println(s.endsWith("Tarde"));//False
    System.out.println(s.equals("Boa tarde"));//  True
    System.out.println(s.equalsIgnoreCase("boa tarde"));//True pois ignora se está maiusculo ou minusculo

    var nome = "Pedro";
    var sobrenome = "Santos";
    var idade = 23;
    var salario = 256.3;

    System.out.printf("%s %s tem %s seu salario é R$ %.2f", nome, sobrenome, idade, salario);


}
}
