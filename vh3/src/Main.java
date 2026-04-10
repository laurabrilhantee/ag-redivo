import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("João", 123, 1000);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ver dados");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(conta);
                    break;

                case 2:
                    System.out.print("Valor: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Valor: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}