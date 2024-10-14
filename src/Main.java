import Example.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuLista();
    }

    public static void menuLista() {
        Lista lista = new Lista();
        Scanner entrada = new Scanner(System.in);
        int opc;


        System.out.print("1. Ver elementos agregados\n2. Ver tamaño de la lista\n3. Verificar si la lista esta vacia\n4. Buscar un elemento en la lista\n5. Eliminar un elemento de la lista\n6. Comparar Lista\n7. Salir\nSeleccione una Opción: ");
        opc = entrada.nextInt();

        switch (opc) {
            case 1:
                lista.imprimirLista();
                System.out.print("\n");
                break;
            case 2:
                lista.tamanioLista();
                System.out.print("\n");
                break;
            case 3:
                lista.estaVacia();
                System.out.print("\n");
                break;
            case 4:
                lista.buscarDato();
                System.out.print("\n");
                break;
            case 5:
                lista.eliminar();
                break;
            case 6:
                System.out.print("Comparar Listas\n");
                lista.comparar();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Opción Invalida");
        }
    }
}