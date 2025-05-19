// Classe Abstrata
public abstract class MontagemVeiculo {
    // Método Template
    public final void montar() {
        prepararChassi();
        adicionarMotor();
        montarCarroceria();
        testarVeiculo();
        System.out.println("Montagem finalizada!\n");
    }

    protected abstract void prepararChassi();
    protected abstract void adicionarMotor();
    protected abstract void montarCarroceria();
    protected abstract void testarVeiculo();
}
