import java.util.Scanner;

public class Main {
    static boolean achouNumero = false;
    static boolean achouMaiuscula = false;
    static boolean achouMinuscula = false;
    static boolean carespecial = false;
    static boolean senhacerta = true;

    public static void main(String[] args) {
        System.out.println("Digite sua senha: ");
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();
        char[] password = senha.toCharArray();
        char[] var4 = password;
        int var5 = password.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            char i = var4[var6];
            if (Character.isDigit(i)) {
                achouNumero = true;
            }

            if (Character.isUpperCase(i)) {
                achouMaiuscula = true;
            }

            if (Character.isLowerCase(i)) {
                achouMinuscula = true;
            }

            if (!Character.isDigit(i) && !Character.isLetter(i) && !Character.isWhitespace(i)) {
                carespecial = true;
            }
        }

        if (!achouNumero) {
            System.out.println("Insira ao meno 1 número.");
            senhacerta = false;
        }

        if (!achouMaiuscula) {
            System.out.println("Insira ao menos 1 letra maiuscula");
            senhacerta = false;
        }

        if (!achouMinuscula) {
            System.out.println("Insira ao menos 1 letra minúscula.");
            senhacerta = false;
        }

        if (!carespecial) {
            System.out.println("Insira ao menos 1 caractere especial.");
            senhacerta = false;
        }

        if (password.length < 6) {
            System.out.println("Digite uma senha com mais de 6 caracteres.");
            senhacerta = false;
        }

        if (senhacerta) {
            System.out.println("Senha inserida com sucesso!");
        }

    }
}
