import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        String nomeCliente = "";
        do{
            System.out.print("Por favor digite o seu nome: ");
            try {
                nomeCliente = scan.nextLine().trim();
                if(nomeCliente.isEmpty()) {
                    throw new IllegalArgumentException("O nome não pode ser vazio!");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Entrada inválida! Erro: " + e.getMessage());
            }
        }while(nomeCliente.isEmpty());

        String agencia = "";
        do{
            System.out.print("Por favor digite o número da sua agência: ");
            try {
                agencia = scan.nextLine().trim();
                if(agencia.isEmpty()) {
                    throw new IllegalArgumentException("O número da agência não pode ser vazio!");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Entrada inválida! Erro: " + e.getMessage());
            }
        }while(agencia.isEmpty());

        int numeroConta = 0;
        do{
            System.out.print("Por favor digite o número da sua conta: ");
            try {
                numeroConta =  Integer.parseInt(scan.nextLine().trim());

                if(numeroConta <= 0) {
                    throw new IllegalArgumentException("O número da conta não pode ser 0 ou um número negativo!");
                }
            } catch (NumberFormatException e){
                System.out.println("Entrada inválida! Erro: informe um número de conta válido! Exemplo: '1234' ");

            } catch (IllegalArgumentException e){
                System.out.println("Entrada inválida! Erro: " + e.getMessage());
            }
        }while(numeroConta <= 0);

        double saldoConta = 0.0;
        do{
            System.out.print("Por favor digite o valor de depósito no formato xx.xx: ");
            try{
                saldoConta = Double.parseDouble(scan.nextLine());
                if(saldoConta <= 0){
                    throw new IllegalArgumentException("O saldo da conta deve ser um valor positivo e maior que zero!");
                }
            }catch (NumberFormatException e){
                System.out.println("Entrada inválida! Erro: Informe um saldo no formato XX.XX");
            }catch (IllegalArgumentException e){
                System.out.println("Entrada inválida! Erro: " + e.getMessage());
            }
        }while (saldoConta <= 0);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\nSua agência é " + agencia + ", conta " + numeroConta +
                " e seu saldo R$ " + saldoConta + " ja está disponível para saque!");
        scan.close();
        System.out.println("Fim!");
    }
}

