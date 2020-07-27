/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefany Rueda
 */
public class Main {

    public static void main(String[] args) {
        List list = new List();

        list.add("Juan");
        list.add("pedro");
        list.add("03");
        list.add("martha");
        list.add("16");
        //Insertar un elemeto en la lista.
        System.out.println("-------------Insertar un elemento en la lista-------------\t");
        System.out.println("---Lista sin el elemento agregado---\t");
        list.toList();
        list.insert(2, "julian");
        System.out.println("\n---Lista con el elemento agregado---\t");
        list.toList();
        //Como obtener el primer elemento y el último.
        System.out.println("\n-------------Obtener el primer y último elemento--------------\t");
        System.out.println("Primer elemento: " + list.get(0));
        System.out.println("Último elemento: " + list.get(list.size() - 1));
        //Eliminar el elemento de la cola
        System.out.println("\n-------------Eliminar un elemento de la cola-------------");
        list.removeTail(4);
        System.out.println("---Lista despues de eliminar el elemento indicado---\t");
        list.toList();
    }

}
