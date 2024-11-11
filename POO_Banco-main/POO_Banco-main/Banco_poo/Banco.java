package Banco_poo;

public class Banco {

    public static void main(String[] args) {
        Conta c1 = new ContaNormal();
        c1.setNumero("2855-9");
        c1.setSaldo(900);

        ContaDebEspecial c2 = new ContaDebEspecial();
        c2.setNumero("1554-8");
        c2.setSaldo(2000);
        c2.setLimite(10000);

        System.out.println("A conta número " + c1.getNumero() + " possui saldo de R$" + c1.getSaldo());
        c1.creditar(500);
        System.out.println("Após o crédito de R$ 500,00, a conta número " + c1.getNumero() + " passou a ter saldo R$" + c1.getSaldo());

        c1.debitar(250);
        System.out.println("Após o débito de R$ 250,00, a conta número " + c1.getNumero() + " passou a ter saldo " + c1.getSaldo());

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("A conta número " + c2.getNumero() + " possui saldo R$" + c2.getSaldo());
        c2.debitar(400);
        System.out.println("Após o débito de R$ 400,00, a conta número " + c2.getNumero() + " possui saldo R$" + c2.getSaldo());

        System.out.println("A conta número " + c2.getNumero() + " possui saldo R$" + c2.getSaldo() + " e Limite de R$" + c2.getLimite());

        c2.setLimite(15000);
        System.out.println("A conta número " + c2.getNumero() + " possui saldo R$" + c2.getSaldo() + " e novo Limite de R$" + c2.getLimite());

        System.out.println("--------------------------------------------------------------------------------------------");

        Banco banco = new Banco();
        banco.transferir(c1, c2, 500);

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Após a transferência, a conta número " + c1.getNumero() + " possui saldo R$" + c1.getSaldo());
        System.out.println("Após a transferência, a conta número " + c2.getNumero() + " possui saldo R$" + c2.getSaldo());
    }

    public void transferir(Conta origem, Conta destino, double valor) {
        if (origem.getSaldo() >= valor) {
            origem.debitar(valor);
            destino.creditar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }
}
