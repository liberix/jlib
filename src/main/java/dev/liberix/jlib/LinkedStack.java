package dev.liberix.jlib;

// reversed linked list

public final class LinkedStack<T> implements Stack<T> {
    private Node pointer = null;
    private int size = 0;

    // inner class
    private class Node {
        T item;
        Node next;

        public Node(T item) {
            this.item = item;
            this.next = null;
        }
    }


    public final void push(T item) {
        Node node = new Node(item);
        node.next = pointer;
        pointer = node;
        size++;
    }

    public final T peek() {
        return pointer.item;
    }

    // throw an exception
    public final T pop() {
        T item = pointer.item;
        pointer = pointer.next;
        size--;
        return item;
    }

    public final int size() {
        return this.size;
    }

    public final boolean isEmpty() {
        return pointer == null;
    }
}
