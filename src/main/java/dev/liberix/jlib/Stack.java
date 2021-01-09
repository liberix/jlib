package dev.liberix.jlib;

public interface Stack<T> {
    void push(T item);

    T peek();

    T pop();

    int size();

    boolean isEmpty();
}
