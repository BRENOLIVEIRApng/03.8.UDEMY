import java.util.Scanner;

public class DesafioIfelse {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do dia desejado: ");
        String dia = entrada.nextLine();

        if("domingo".equals(dia.toLowerCase())){
            System.out.println(1);
        } else if ("Segunda".equalsIgnoreCase(dia)){
            System.out.println(2);
        }else if ("terca".equalsIgnoreCase(dia)){
            System.out.println(3);
        }else if ("quarta".equalsIgnoreCase(dia)){
            System.out.println(4);
        }else if ("quinta".equalsIgnoreCase(dia)){
            System.out.println(5);
        }else if ("sexta".equalsIgnoreCase(dia)){
            System.out.println(6);
        }else if ("sabado".equalsIgnoreCase(dia)){
            System.out.println(7);
        }

        entrada.close();
    }
}
