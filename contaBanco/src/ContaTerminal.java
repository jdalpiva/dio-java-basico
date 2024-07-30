import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário 

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Favor entrar com o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Favor entrar com a agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Favor, entre o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Favor, entrar com o seu saldo: ");
        float saldo = scanner.nextFloat();

        System.out.printf("%nOla %s, obrigado pro criar uma conta em nosso banco, sua agência é: %s, conta: %d e seu saldo: R$%.2f", nomeCliente, agencia, numero, saldo);
    }
}
