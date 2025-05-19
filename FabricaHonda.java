public class FabricaHonda {
    public static void main(String[] args) {
        MontagemVeiculo carro = new MontagemCarro();
        MontagemVeiculo moto = new MontagemMoto();

        carro.montar();
        moto.montar();
    }
}
