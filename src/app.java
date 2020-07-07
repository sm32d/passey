import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Password length: ");
        int l = input.nextInt();
        do {
            Passey pass = new Passey(l);
            System.out.println(pass);
            System.out.println("Want to generate another? y/n");
            char response = input.next().charAt(0);
            if (response == 'n' || response == 'N')
                break;
        } while (true);
        input.close();
    }
}