import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        Account account = new Account(name);
        account.checkNameToEmboss();

    }

}