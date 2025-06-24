import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Olá, informe seu nome";

    public static void main(String[] args) {
        /*
        OOOOOOOOO MAGAAAAAAAAAA

         */
        Scanner sc = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = sc.next();
        System.out.println("infoome sua idade");
        int age = sc.nextInt();
        System.out.printf("OOlá %s sua idade é %s", name, age);



    }

}
