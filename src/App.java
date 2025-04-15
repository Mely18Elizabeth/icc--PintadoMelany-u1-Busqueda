import Controllers.MetodoBusqueda;

public class App {
    public static void main(String[] args) {
        MetodoBusqueda metodosBusqueda = new MetodoBusqueda();
        metodosBusqueda.busquedaLineal(new int[]{4, 8, 15, 16, 23, 42});
    }
}
