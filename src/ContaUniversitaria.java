public class ContaUniversitaria extends Conta {
    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite, int agencia) {
        super(numero, dono, saldo, limite, agencia);
    }

    @Override
    public double calcularTaxas() {
        return 0f;
    }

    @Override
    public void setLimite(double limite) {
        if (limite <= 500 && limite >= 0)
            super.limite = limite;
    }
}
