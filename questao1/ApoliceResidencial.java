package questao1;

import java.util.List;

// PRODUTO CONCRETO - RF02
public class ApoliceResidencial extends absApolice {

    private double valorImovel;
    private boolean altoPadrao;
    private boolean temEscrituraOuContrato;

    public ApoliceResidencial(String segurado, double valorImovel) {
        super(segurado);
        this.valorImovel = valorImovel;
    }

    // prêmio mensal = 1,5% do valor do imóvel ao ano / 12 (+25% se alto padrão)
    @Override
    public double calcular() {
        double premioAnual = valorImovel * 1.5;
        return premioAnual / 12;
    }

    @Override
    public List<String> listarDocumentos() {
        return List.of("Escritura ou Contrato de locação");
    }

    @Override
    protected String getPrefixo() {
        return "RES-";
    }

    @Override
    protected String getTipoPremio() {
        return "mensal";
    }
}
