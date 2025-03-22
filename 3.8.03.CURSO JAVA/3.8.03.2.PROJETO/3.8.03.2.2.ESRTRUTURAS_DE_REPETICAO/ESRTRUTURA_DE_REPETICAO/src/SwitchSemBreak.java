public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei a Bassai-sai");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Saffu Lifite");
            case "branca":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Verde");
            case "azul":
                System.out.println("Sei o Azul");
            default:
                System.out.println("Sei de nada");
        }
        System.out.println("Fim");

        int idade = 5;
        switch (idade){
            case 3:
                System.out.println("Sabe falar");
                break;
                case 4:
                    System.out.println("Sabe andar");
                    break;
                    case 5:
                        System.out.println("Sabe respirar");
                        break;
        }
    }
}
