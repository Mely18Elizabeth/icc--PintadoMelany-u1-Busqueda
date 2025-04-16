package Controllers;

import Models.Persona;
import Views.ShowConsole;

public class MetodoBusquedaBinaria {

    private Persona[] personas;
    private ShowConsole pantalla;

    public MetodoBusquedaBinaria(Persona[] personas){
        this.personas=personas;
        this.pantalla= new ShowConsole();
       // System.out.println("Clase MBB creada");
        pantalla.showMessage("Metodos de Busqueda Binario");
     }
      public int findPersonByCode(int code){
        int bajo=0;
        int alto=personas.length-1;
        while (bajo<=alto) {
            int central = bajo + (alto-bajo)/2;

            if (personas[central].getCode()==code) {
                return central;
            }if (personas[central].getCode()<code) {
                bajo=central+1;
            }else{
                alto=central -1;
            }
        }
        return-1;
      }

      public void showPersonByCode(){
        int codeToFind=pantalla.getCode();
        int indexPerson= findPersonByCode(codeToFind);
        if (indexPerson==-1) {
            pantalla.showMessage("no hay con ese codigo");
        }else{
            pantalla.showMessage("persona con codigo: "+codeToFind+" encontrada");
            pantalla.showMessage(personas[indexPerson].toString());
        }
      }

      private void ordenarPorNombre() {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - 1 - i; j++) {
                if (personas[j].getNombre().compareTo(personas[j + 1].getNombre()) > 0) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

      private int findPersonName(String nombre){
        ordenarPorNombre();

        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            String nombreCentral = personas[central].getNombre();
            int comparacion = nombreCentral.compareTo(nombre);

            if (comparacion == 0) {
                return central;
            }
            if (comparacion < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }

        return -1;
      }

      public void showPersonByName(){
        String nombreToFind = pantalla.getNombre();
        int indexPerson = findPersonName(nombreToFind);
        if (indexPerson == -1) {
            pantalla.showMessage("no hay persona con ese nombre");
        } else {
            pantalla.showMessage("persona con nombre: " + nombreToFind + " encontrada");
            pantalla.showMessage(personas[indexPerson].toString());
        }
      }


}
