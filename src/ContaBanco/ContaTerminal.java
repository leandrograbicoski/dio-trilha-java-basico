package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta!");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite oo número da agência!");
        String agencia = sc.next();
        System.out.println("Por favor, digite o seu nome");
        String nome = sc.next();
        double saldo = 237.48;

        System.out.printf("Olá %s, obrigado por criar uma conta em noosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo );



    }

}
