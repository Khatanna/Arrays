package arrays;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Vector {

    //Ordenamiento por el metodo burbuja
    public void Bubblesort(int Array[]) {
        for (int i = 1; i < Array.length; ++i) {
            for (int j = 0; j < Array.length - i; j++) {
                if (Array[j] > Array[j + 1]) {
                    int aux = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = aux;
                }
            }
        }
    }

    //Ordenamiento por el meotodo burbuja biireccional
    public void CocktailSort(int Array[]) {
        int izq = 0;
        int der = Array.length - 1;
        int ultimo = Array.length - 1;

        do {
            for (int i = izq; i < der; ++i) {
                if (Array[i] > Array[i + 1]) {
                    int aux = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = aux;
                    ultimo = i;
                }
            }

            der = ultimo;

            for (int j = der; j > izq; --j) {
                if (Array[j - 1] > Array[j]) {
                    int aux = Array[j];
                    Array[j] = Array[j - 1];
                    Array[j - 1] = aux;
                    ultimo = j;
                }
            }

            izq = ultimo;
        } while (izq < der);
    }

    //Ordenamiento por Inserción
    public void InsertionSort(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            int pos = i;
            int aux = Array[i];

            while ((pos > 0) && (Array[pos - 1] > aux)) {
                Array[pos] = Array[pos - 1];
                pos--;
            }
            Array[pos] = aux;
        }
    }

    //Ordenamiento por seleción
    public void SelectionSort(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            int min = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] < Array[min]) {
                    min = j;
                }
            }
            int aux = Array[i];
            Array[i] = Array[min];
            Array[min] = aux;
        }
    }

    //Ordenamiento Shell
    public void Shell(int Array[]) {
        int salto = Array.length / 2;

        while (salto > 0) {
            for (int i = salto; i < Array.length; i++) {
                int j = i - salto;
                while (j >= 0) {
                    int k = j + salto;
                    if (Array[j] <= Array[k]) {
                        j--;
                    } else {
                        int aux = Array[j];
                        Array[j] = Array[k];
                        Array[k] = aux;
                        j -= salto;
                    }
                }
            }
            salto /= 2;
        }
    }

    //Ordenamiento QuickSort
    public void QuickSort(int Array[], int primero, int ultimo) {
        int i = primero, j = ultimo, central = (i + j) / 2;
        int pivote = Array[central];

        do {
            while (Array[i] < pivote) {
                i++;
            }
            while (Array[j] > pivote) {
                j--;
            }

            if (i <= j) {
                int aux = Array[i];
                Array[i] = Array[j];
                Array[j] = aux;
                i++;
                j--;
            }

        } while (i <= j);

        if (primero < j) {
            QuickSort(Array, primero, j);
        }
        if (i < ultimo) {
            QuickSort(Array, i, ultimo);
        }
    }

    //busqueda secuencial con bandera
    public void BusquedaSecuencial(int Array[], int buscar, JTextField Txt_mostrar) {
        boolean encontrado = false;

        for (int i = 0; i < Array.length; ++i) {
            if (encontrado = Array[i] == buscar) {
                Txt_mostrar.setText("Elemento encontrado en la posicion: " + i);
                break;
            }
        }
        if (!encontrado) {
            Txt_mostrar.setText("El elemento: " + buscar + " no se encontro");
        }
    }

    //Busqueda binaria(dicotomica)
    public void BusquedaBinaria(int Array[], int buscar, JTextField Txt_mostrar) {       
        int centro, primero, ultimo, valorCentro;
        boolean encontrado = false;
        primero = 0;
        ultimo = Array.length - 1;

        while (primero <= ultimo) {
            centro = (primero + ultimo) / 2;
            valorCentro = Array[centro];
            if (encontrado = buscar == valorCentro) {
                Txt_mostrar.setText("Elemento encontrado en la posicion: " + centro);
                break;
            } else if (buscar < valorCentro) {
                ultimo = centro - 1;
            } else {
                primero = centro + 1;
            }
        }
        
        if(!encontrado){
            Txt_mostrar.setText("El elemento: " + buscar + " no se encontro");
        }
    }

    public void Generar(int Array[]) {
        for (int i = 0; i < Array.length; ++i) {
            Array[i] = (int) (Math.random() * 50 + 1);
        }
    }

    public void Mostrar(int Array[], JTable Tbl_mostrar) {
        DefaultTableModel Tbl = (DefaultTableModel) Tbl_mostrar.getModel();

        Tbl.setRowCount(1);
        Tbl.setColumnCount(Array.length);

        for (int i = 0; i < Array.length; i++) {
            Tbl_mostrar.setValueAt(Array[i], 0, i);
        }
    }
}
