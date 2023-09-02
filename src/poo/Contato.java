package poo;

import java.time.LocalDate;

public class Contato {
    public String nome;
    public String telefone;
    public String endereco;
    public String email;
    private Integer idade;
    public LocalDate dataNascimento;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-Mail: " + email);
        System.out.println("Idade: " + idade);
        System.out.println();
    }

    public void setIdade() {
        idade = LocalDate.now().getYear()
                - dataNascimento.getYear();
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", email=" + email
                + ", idade=" + idade + ", dataNascimento=" + dataNascimento + "]";
    }

}
