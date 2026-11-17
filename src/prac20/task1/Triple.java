package prac20.task1;

import java.io.Serializable;

public class Triple <T extends Comparable<T>,
        V extends Animal & Serializable,
        K>{
    private final T t;
    private final V v;
    private final K k;

    public Triple(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
    public void getClassNames(){
        System.out.println("Имя класса: " + getT().getClass().getName());
        System.out.println("Имя класса: " + getV().getClass().getName());
        System.out.println("Имя класса: " + getK().getClass().getName());
    }
}
