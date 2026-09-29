package questao1;

public class FactoryVida extends absCriadorApolice {

    private String segurado;
    private int idade;
    private double capitalSegurado;
    private boolean fumante;
    private boolean temAtestadoMedico;

    public FactoryVida(String segurado, double capitalSegurado) {
        this.segurado = segurado;
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    public absApolice criarApolice() {
        return new ApoliceVida(segurado, capitalSegurado);
    }
}
