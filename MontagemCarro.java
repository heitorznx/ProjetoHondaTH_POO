public class MontagemCarro extends MontagemVeiculo {
    @Override
    protected void prepararChassi() {
        System.out.println("Preparando chassi de carro...");
    }

    @Override
    protected void adicionarMotor() {
        System.out.println("Adicionando motor 2.0 flex...");
    }

    @Override
    protected void montarCarroceria() {
        System.out.println("Montando carroceria de sedan...");
    }

    @Override
    protected void testarVeiculo() {
        System.out.println("Realizando teste de freios e estabilidade (carro)...");
    }
}
