package entrada;

import java.util.Scanner;

public class EntradaDeDados {
    static String nome;
    static String email;
    static Integer idade;

    public static void exemplo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = in.nextLine();
        System.out.print("Digite o e-mail: ");
        email = in.nextLine();
        System.out.print("Digite a idade: ");
        idade = in.nextInt();

        System.out.println();
        System.out.println(String.format("Nome: %s\nIdade: %d\nE-mail: %s\n",
                nome, idade, email));
        in.close();
    }
}
