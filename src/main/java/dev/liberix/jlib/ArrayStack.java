package dev.liberix.jlib;

public final class ArrayStack<T> implements Stack<T> {
    private T [] array;
    private int index;

    public ArrayStack () {
        // ugly cast
        this.array = (T[]) new Object[1];
        this.index = 0;
    }

    private void resize(int newSize) {
        // ugly cast
        T[] copy = (T[]) new Object[newSize];
        for (int i = 0; i < array.length; i++)
            copy[i] = array[i];
        array = copy;
    }

    @Override
    public void push(T item) {
        if (index == array.length) resize(array.length * 2);
        array[index++] = item;
    }

    @Override
    public T peek() {
        return array[index];
    }

    @Override
    public T pop() {
        T item = array[index--];
        array[index] = null;
        if (index > 0 && index == array.length / 4) resize(array.length/2);
        return item;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }
}
