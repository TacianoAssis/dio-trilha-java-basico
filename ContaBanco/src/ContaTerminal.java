import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        double saldo;
        String agencia, nomeCliente;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o seu nome:");
        nomeCliente = scan.next();
        System.out.println("Por favor digite o seu sobrenome:");
        nomeCliente = nomeCliente.concat(" " + scan.next())   ;
        System.out.println("Por favor digite o código de sua agência:");
        agencia = scan.next();
        System.out.println("Por favor digite o número da sua conta:");
        numero = scan.nextInt();
        System.out.println("Por favor digite o valor de depósito:");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +
                " e seu saldo R$ " + saldo + ", ja está disponível para saque");
    }
}
