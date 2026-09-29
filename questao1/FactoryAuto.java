package questao1;

public class FactoryAuto extends absCriadorApolice {

    private String segurado;
    private double valorFipe;

    public FactoryAuto(String segurado, double valorFipe) {
        this.segurado = segurado;
        this.valorFipe = valorFipe;
    }

    @Override
    public absApolice criarApolice() {
        return new ApoliceAuto(segurado, valorFipe);
    }
}
