import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App app = new App ();
        int l = app.length();
        Scanner inp = new Scanner (System.in);
        do {
            Passey pass = new Passey(l);
            System.out.println(pass);
            System.out.println("Want to generate another? y/n");
            System.out.println("Change length? Type \'l\'");
            char response = inp.next().charAt(0);
            System.out.println("------------------------------");
            if (response == 'n' || response == 'N')
                break;
            else if (response == 'l')
                l = app.length();
        } while (true);
        inp.close();
    }
    private int length () {
        Scanner input = new Scanner (System.in);
        System.out.print("Password length: ");
        int l = input.nextInt();
        return l;
    }
}