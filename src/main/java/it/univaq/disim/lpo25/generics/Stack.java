package it.univaq.disim.lpo25.generics;

@SuppressWarnings("unchecked")
public class Stack<T> {
    private T[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Costruttore
    public Stack() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Aggiunge un elemento in cima allo stack
    public void push(T item) {
        if (size == elements.length) {
            resize(2 * elements.length);
        }
        elements[size++] = item;
    }

    // Rimuove e restituisce l'elemento in cima allo stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack vuoto");
        }
        T item = elements[--size];
        elements[size] = null; // evita memory leak
        return item;
    }

    // Restituisce l'elemento in cima allo stack senza rimuoverlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack vuoto");
        }
        return elements[size - 1];
    }

    // Verifica se lo stack è vuoto
    public boolean isEmpty() {
        return size == 0;
    }

    // Restituisce il numero di elementi nello stack
    public int size() {
        return size;
    }

    // Ridimensiona l'array interno
    private void resize(int newCapacity) {
        T[] newArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }
}