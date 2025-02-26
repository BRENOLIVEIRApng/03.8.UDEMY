
public class Wapper {

    public static void main(String[] args) {

        //byte
        Byte b = 100;
        Short s = 1000;

        //vamos mudar para de string para um valor // Integer.parseInt(entrada.nextLine())
        Integer i = 1000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase()); //Converti em string primeiro para passar pelo UpperCase e fica formatado 

        Character c = '#';
        System.out.println(c + "...");
    }
}
