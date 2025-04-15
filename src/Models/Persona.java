package Models;

public class Persona {
    private String nombre;
    //private int edad;
    private int code;

    /*public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }*/

    public Persona(int code, String nombre){
        this.code= code;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    /*public int getEdad() {
        return edad;
    }*/

    public int getCode(){
        return code;
    }

    @Override
    public String toString() {
        return "Persona: " +
               "code= " + code +
               ", nombre= " + nombre;
    }
}
