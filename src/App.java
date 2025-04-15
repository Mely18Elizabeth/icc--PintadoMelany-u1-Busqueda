import Controllers.MetodoBusqueda;
import Models.Persona;

public class App {
    public static void main(String[] args) {
        /*MetodoBusqueda metodosBusqueda = new MetodoBusqueda();
        metodosBusqueda.busquedaLineal(new int[]{4, 8, 15, 16, 23, 42});*/

        Persona[] personas= new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Maria");
        personas[2] = new Persona(103, "Melisa");
        personas[3] = new Persona(104, "Pedro");
        personas[4] = new Persona(105, "Israel");
        personas[5] = new Persona(106, "Meto");
        personas[6] = new Persona(107, "Fernando");
        MetodoBusqueda mB=new MetodoBusqueda(personas);
    }
}
