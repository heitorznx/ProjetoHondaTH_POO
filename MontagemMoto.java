public class MontagemMoto extends MontagemVeiculo {
    @Override
    protected void prepararChassi() {
        System.out.println("Preparando chassi de moto...");
    }

    @Override
    protected void adicionarMotor() {
        System.out.println("Adicionando motor 500cc...");
    }

    @Override
    protected void montarCarroceria() {
        System.out.println("Montando carenagem da moto...");
    }

    @Override
    protected void testarVeiculo() {
        System.out.println("Realizando teste de equilíbrio e frenagem (moto)...");
    }
}
