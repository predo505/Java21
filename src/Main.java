import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String senha;
        String senhaCorreta = "Java21";

        do {
            System.out.println("Insira sua senha: ");
            senha = scanner.nextLine();

            if (!senhaCorreta.equals(senha)) {
                System.out.println("Acesso negado.");
            }
        } while (!senhaCorreta.equals(senha));

        System.out.println("Acesso permitido.");
        scanner.close();
    }
}