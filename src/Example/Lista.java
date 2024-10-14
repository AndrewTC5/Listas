package Example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    Scanner sc = new Scanner(System.in);
    //Crear lista "lista1" con List y ArrayList
    List<String> lista1 = new ArrayList<>();

    public void registrarElemento(){
        //Agregar elementos a la lista "lista1"
        lista1.add("Rojo");
        lista1.add("Amarillo");
        lista1.add("Purpura");
    }

    public void imprimirLista() {
        //Imprimir
        for (String dato : lista1) {
            System.out.println(dato);
        }
    }

    public void tamanioLista() {
        System.out.println("El tamaño de la lista es de: " + lista1.size() + " elementos");
    }

    public void estaVacia() {
        if (lista1.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("La lista tiene Datos");
        }
    }

    public void buscarDato() {
        System.out.print("Ingrese el dato que quiere buscar: ");
        String dato = sc.next();

        if (lista1.contains(dato)) {
            System.out.println("El elemento " + dato + " si se encuentra en la lista");
        } else {
            System.out.println("El elemento " + dato + " no existe en la lista");
        }
    }

    public void eliminar() {
        System.out.print("¿Que desea eliminar?\n1.Un Elemento\n2.Toda la Lista\n");
        byte opc = sc.nextByte();

        switch (opc) {
            case 1:
                System.out.print("Ingrese la palabra que desea eliminar: ");
                String dato = sc.next();
                lista1.remove(dato);
                if (lista1.remove(dato)) {
                    System.out.println("El elemento " + dato + " ha sido eliminado de la lista");
                } else {
                    System.out.println("El elemento " + dato + " no existe en la lista");
                }
                break;
            case 2:
                lista1.clear();
                if (lista1.isEmpty()) {
                    System.out.println("La lista YA esta vacia");
                }
                break;
            default:
                System.out.println("Ingrese una opción Valida");
        }
    }


    public void comparar(){
        List<String>lista2 = new ArrayList<>();
        List<String> lista3 = new ArrayList<>();
        lista2.add("Rojo");
        lista3.add("Rojo");

        if (lista2.equals(lista3)) {
            System.out.println("Las listas son iguales");
        } else {
            System.out.println("Las listas no iguales");
        }
    }
}