package questao1;

import java.util.ArrayList;
import java.util.List;

public class ApoliceVida extends  absApolice {

    private double capitalSegurado;
    private String cpf;
    private String documento;


    public ApoliceVida(String segurado, double capitalSegurado) {
        super(segurado);
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    public double calcular() {
        double premio =  (capitalSegurado * 0.03) / 12;
        return premio;
    }

    @Override
    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>();
        docs.add("Documento de identidade");
        docs.add("CPF");
        return docs;
    }

    @Override
    protected String getPrefixo() {
        return "VID-";
    }

    @Override
    protected String getTipoPremio() {
        return "mensal";
    }

    
}
