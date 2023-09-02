package expressoes;

public class ExpressoesLogicas {
    public static void executar() {
        // Expressoes logicas utilizam operandos logicos e operadores logicos
        // E OU NAO XOU
        // && || ! ^

        System.out.println("Tabela Verdade\n");
        System.out.println("Tabela E");
        System.out.printf("V E V = %s\n", (true && true ? "V" : "F"));
        System.out.printf("V E F = %s\n", (true && false ? "V" : "F"));
        System.out.printf("F E V = %s\n", (false && true ? "V" : "F"));
        System.out.printf("F E F = %s\n\n", (false && false ? "V" : "F"));

        System.out.println("Tabela OU");
        System.out.printf("V OU V = %s\n", (true || true ? "V" : "F"));
        System.out.printf("V OU F = %s\n", (true || false ? "V" : "F"));
        System.out.printf("F OU V = %s\n", (false || true ? "V" : "F"));
        System.out.printf("F OU F = %s\n\n", (false || false ? "V" : "F"));

        System.out.println("Tabela XOU");
        System.out.printf("V XOU V = %s\n", (true ^ true ? "V" : "F"));
        System.out.printf("V XOU F = %s\n", (true ^ false ? "V" : "F"));
        System.out.printf("F XOU V = %s\n", (false ^ true ? "V" : "F"));
        System.out.printf("F XOU F = %s\n\n", (false ^ false ? "V" : "F"));

        System.out.println("Tabela NAO");
        System.out.printf("NAO V = %s\n", ( !true ? "V" : "F"));
        System.out.printf("NAO F = %s\n\n", ( !false ? "V" : "F"));

    }
}
