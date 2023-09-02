import java.time.LocalDate;
import java.util.Random;

import entrada.EntradaDeDados;
import expressoes.ExpressoesAritmeticas;
import expressoes.ExpressoesLogicas;
import poo.Contato;
import utils.MatematicaUtils;

public class App {
    public static void main(String[] args) throws Exception {
        var contato1 = new Contato();
        contato1.nome = "Luis";
        contato1.endereco = "Rua 1, 500 - Centro";
        contato1.telefone = "99999-9999";
        contato1.email = "luis@gmail.com";
        contato1.dataNascimento = LocalDate.of(1980, 10, 20);
        contato1.setIdade();
        contato1.exibirDados();
    }
}
