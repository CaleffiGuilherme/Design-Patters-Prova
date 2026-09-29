package questao1;

public abstract class absCriadorApolice {
    
    public abstract absApolice criarApolice();

    public absApolice processarContratacao() {
        absApolice apolice = criarApolice();
        apolice.emitir();
        return apolice;
    }

}
