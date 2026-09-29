package questao1;

import java.util.List;

// PRODUTO CONCRETO - RF01
public class ApoliceAuto extends absApolice {

    private double valorFipe;

    public ApoliceAuto(String segurado, double valorFipe) {
        super(segurado);
        this.valorFipe = valorFipe;
    }

    @Override
    public double calcular() {
        double premioAnual = valorFipe * 0.08;
        
        return premioAnual / 12;
    }

    @Override
    public List<String> listarDocumentos() {
        return List.of("CNH", "CRLV");
    }

    @Override
    protected String getPrefixo() {
        return "AUTO-";
    }

    @Override
    protected String getTipoPremio() {
        return "mensal";
    }
}
