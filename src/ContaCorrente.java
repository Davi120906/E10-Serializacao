public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente dono, double saldo, double limite, int agencia) {
        super(numero, dono, saldo, limite, agencia);
    }


    @Override
    public double calcularTaxas() {
        return this.getDono().calcularTaxas();
    }

    @Override
    public void setLimite(double limite) {
        if (limite >= -100)
            super.limite = limite;
    }
}
