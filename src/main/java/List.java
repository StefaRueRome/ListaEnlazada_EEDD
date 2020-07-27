/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefany Rueda
 */
public class List {

    public ListNode head;
    public ListNode tail;
    public int size;

    public List() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insert(int position, Object object) {
        //verificacion si la posicion ingresada se encuentra en el rango
        if (position >= 0 && position <= size) {
            ListNode newNode = new ListNode();
            newNode.setObject(object);

            ListNode aux = head;
            //Recorrido de la lista para llegar al nodo anterior de la posision en a que se va a insertar el nuevo nodo.
            for (int i = 0; i < (position - 1); i++) {
                aux = aux.getNext();
            }
            ListNode nNext = aux.getNext();
            //se inserta el nuevo nodo en la posicion indicada
            aux.setNext(newNode);
            //se une el nuevo nodo con el resto de la lista
            newNode.setNext(nNext);
            size++;
        }
    }

    public void removeTail(int position) {
        ListNode aux = head;
        for (int i = 0; i < position - 1; i++) {
            aux = aux.getNext();
        }
        //se guarda el nodo siguiente al nodo a eliminar
        ListNode nNext = aux.getNext();
        //se elimina la referencia del nodo apuntando el nodo siguiente.
        aux.setNext(nNext.getNext());
        size--;
    }

    public Object get(int index) {
        int cont = 0;
        ListNode temp = head;
        while (cont < index) {
            temp = temp.getNext();
            cont++;
        }
        return temp.getObject();
    }

    public List(Object object) {
        head = new ListNode(object);
        tail = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Object object) { //agrega al inicio
        if (head == null) {
            head = new ListNode(object);
            tail = head;
        } else {
            ListNode nodeTemp = head;
            ListNode newNode = new ListNode(object);
            newNode.linkNext(nodeTemp);
            head = newNode;
        }
        size++;
    }

    public void toList() {
        if (!isEmpty()) {
            ListNode aux = head;
            int i = 0;
            // se recorre la lista hasta el final.
            while (aux != null) {
                System.out.print(i + ".[ " + aux.getObject() + " ]" + " ->  ");
                aux = aux.getNext();

                i++;
            }
        }
    }

    public int size() {
        return size;
    }

}
