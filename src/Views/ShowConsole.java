package Views;
import java.util.Scanner;


public class ShowConsole {

    private Scanner scanner = new Scanner(System.in);

    /*public int Numero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public void Resultado(String mensaje) {
        System.out.println(mensaje);
    }*/

    public void showMenu(){
        System.out.println("Ingrese codigo: ");
    }

    public int getCode(){
        System.out.println("Ingrese codigo: ");
        int codigo=scanner.nextInt();
        System.out.println("Codigo ingresado: "+ codigo);
        return codigo;
    }

    public String getNombre(){
        System.out.println("Ingrese nombre: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println("Nombre ingresado: " + nombre);
        return nombre;
    }
    


    public void showMessage(String mesagge){
        System.out.println(mesagge);
    }

}
