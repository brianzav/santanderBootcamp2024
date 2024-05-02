package contaBanco;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    protected static int account;
    protected static String branch;
    protected static String clientName;
    protected static BigDecimal salary;
    protected static Scanner input;

    public static void main(String[] args) {

        System.out.println("Bem-vindo cliente! Por favor digite seu nome: ");
        input = new Scanner(System.in);
        clientName = input.nextLine();
        System.out.println("Digite o numero da sua agência: ");
        branch = input.nextLine();
        System.out.println("Digite seu numero de conta: ");
        account = input.nextInt();
        System.out.println("Por ultimo, digite seu salario: ");
        salary = input.nextBigDecimal();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", clientName, branch, account, salary);

    }
}
