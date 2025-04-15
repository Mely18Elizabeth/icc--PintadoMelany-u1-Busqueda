package Controllers;

import Models.Persona;
import Views.ShowConsole;


public class MetodoBusqueda {
    /*private ShowConsole showConsole = new ShowConsole();

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
    }*/

    private ShowConsole showConsole;
    private Persona[] personas;

    public MetodoBusqueda(Persona[] personas) {
        this.showConsole = new ShowConsole();
        this.personas = personas;

        int codeToFind = showConsole.getCode();
        showPersonByCode(codeToFind);
    }

    public int busquedaLineal(int[] arreglo, int valorBuscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscar) {
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(int code) {
        int indexPerson = findPersonByCode(code);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona encontrada:");
            showConsole.showMessage(personas[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona con código " + code + " no encontrada.");
        }
    }
}
