package questao1;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        absCriadorApolice[] pedidos = {
            // contratações válidas
            new FactoryAuto("Maria Souza", 60000),
            new FactoryResidencial("João Pereira", 400000),
            new FactoryVida("Ana Lima", 40),
        };

        for (absCriadorApolice criador : pedidos) {
                absApolice apolice = criador.processarContratacao();
                System.out.println(apolice.gerarResumo());
            System.out.println();
        }
    }
}
