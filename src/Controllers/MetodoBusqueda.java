package Controllers;

import Views.ShowConsole;


public class MetodoBusqueda {
    private ShowConsole showConsole = new ShowConsole();

    public int busquedaLineal(int[] arreglo) {
        int buscado = showConsole.Numero("Introduce el número a buscar:");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == buscado) {
                showConsole.Resultado("Número encontrado en la posición: " + i);
                return i;
            }
        }
        showConsole.Resultado("Número no encontrado.");
        return -1;
    }
}
