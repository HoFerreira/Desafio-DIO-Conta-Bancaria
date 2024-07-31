import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Solicita número da agência
        System.out.println("Por favor digite o número da sua agência: ");
        agencia = sc.nextLine();

        //Solicita número da conta
        System.out.println("Por favor digite o número da sua conta: ");
        numero = sc.nextInt();

        //Solicita nome do cliente
        System.out.println("Insira seu nome: ");
        nomeCliente = sc.nextLine();

        //Solicita o saldo inicial
        System.out.println("Quanto você deseja inserir de saldo? ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
