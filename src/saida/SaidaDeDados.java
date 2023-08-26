package saida;

public class SaidaDeDados {

    static String nome = "Luis Alberto";
    static Double media = 9.5;
    static Integer idade = 35;

    public static void estiloC() {
        System.out.printf("Saida de dados no estilo C.\n\n");

        System.out.printf("Palmeiras %d X %d OutroTime\n\n", 4, 0);

        System.out.printf("Nome: %s\nIdade: %d\nMédia: %.3f\n", nome, idade, media);
    }

    public static void estiloJava() {
        System.out.println("Primeira Linha.");
        System.out.println("Segunda Linha.");
        System.out.println();

        System.out.print("Nome: ");
        System.out.println(nome);
        System.out.print("Idade: ");
        System.out.println(idade);
        System.out.print("Média: ");
        System.out.println(media);
        System.out.println();

        String saida = String.format("Nome: %s\nIdade: %d\nMédia: %.3f\n", nome, idade, media);

        System.out.println(saida);

    }
}
