public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 1){
                continue;
            }
            System.out.println(args[i]);
        }
    }
}
