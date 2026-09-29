package questao1;

public class FactoryResidencial extends absCriadorApolice {

    private String segurado;
    private double valorImovel;

    public FactoryResidencial(String segurado, double valorImovel) {
        this.segurado = segurado;
        this.valorImovel = valorImovel;
    }

    @Override
    public absApolice criarApolice() {
        return new ApoliceResidencial(segurado, valorImovel);
    }
}
