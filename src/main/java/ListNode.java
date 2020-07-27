/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefany Rueda
 */
public class ListNode {

    private Object object;
    public ListNode next;

    public ListNode(Object object) {
        this.object = object;
        this.next = null;
    }

    public ListNode() {
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void linkNext(ListNode n) {
        next = n;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{"
                + "object=" + object
                + ", next=" + next
                + '}';
    }

}
