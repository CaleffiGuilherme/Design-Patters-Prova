package questao1;

import java.time.LocalDate;
import java.util.List;

public abstract class absApolice {

    public absApolice(String segurado) {
        this.segurado = segurado;
    }

    private static int contador = 0;

    protected String numero;
    protected String segurado;
    protected LocalDate dataemissao;

    public abstract double calcular();
    public abstract List<String> listarDocumentos();

    protected abstract String getPrefixo();
    protected abstract String getTipoPremio();

    public void emitir(){
        contador++;
        numero = getPrefixo() + String.format("%04d", contador);
        dataemissao = LocalDate.now();
    }

    public String gerarResumo() {
        String texto = "---------- RESUMO DA APÓLICE ----------\n";
        texto += "Número: " + numero + "\n";
        texto += "Segurado: " + segurado + "\n";
        texto += "Data de emissão: " + dataemissao + "\n";
        texto += "Prêmio (" + getTipoPremio() + "): R$ " + String.format("%.2f", calcular()) + "\n";
        texto += "Documentos exigidos: " + listarDocumentos() + "\n";
        texto += "---------------------------------------";
        return texto;
    }
}