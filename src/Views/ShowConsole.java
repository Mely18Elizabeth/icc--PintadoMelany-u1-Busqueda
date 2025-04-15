package Views;
import java.util.Scanner;


public class ShowConsole {

    private Scanner scanner = new Scanner(System.in);

    public int Numero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public void Resultado(String mensaje) {
        System.out.println(mensaje);
    }

}
