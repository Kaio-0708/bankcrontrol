import java.net.StandardSocketOptions;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nome = leitura.nextLine();

        System.out.println("Seu tipo de conta é corrente ou poupança? ");
        String tipoDeConta = leitura.nextLine();

        System.out.println("Digite seu saldo inicial: ");
        double saldo = leitura.nextDouble();

        System.out.println("Dados iniciais do cliente: ");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + "R$" + saldo);
        System.out.println();

        String menu = """
                Operações
                
                ** Digite sua opção deseja **
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                """;

        int opcao =0;
        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            System.out.println();
        if( opcao ==1){
            System.out.println("O seu saldo atual é " + saldo);
        } else if (opcao == 2) {
            System.out.println("Informe o valor a receber: ");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("O seu novo saldo é " + saldo);
            if(valor > saldo){
                System.out.println("Não há saldo para realizar a transferência");
            }
        } else if (opcao == 3) {
            System.out.println("Informe o valor a transferir: ");
            double valor = leitura.nextDouble();
            saldo -= valor;
            System.out.println("O seu novo saldo é " + saldo);
        } else if(opcao !=4){
            System.out.println("Opção inválida");
        }
        }
    }
}