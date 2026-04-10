public class ContaBancaria {

    private String titular;
    private int numero;
    private double saldo;
    private boolean ativa;

    // Construtor padrão
    public ContaBancaria() {
        this.titular = "Desconhecido";
        this.numero = 0;
        this.saldo = 0.0;
        this.ativa = true;
    }

    // Construtor parametrizado
    public ContaBancaria(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.setSaldo(saldo);
        this.ativa = true;
    }

    // Métodos específicos
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido!");
        }
    }

    // Getters e Setters com validação
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return "Titular: " + titular +
               "\nNúmero: " + numero +
               "\nSaldo: R$ " + saldo +
               "\nAtiva: " + ativa;
    }
}