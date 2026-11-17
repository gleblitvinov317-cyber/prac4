package prac21.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution <T, V, K>{
    private final T t;
    private final V v;
    private final K k;

    public Solution(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public ArrayList<T> newArrayList(T[] array){
        if (array == null){
            throw new IllegalArgumentException("Переданный массив не должен быть равен нулю");
        }
        return new ArrayList<T>(Arrays.asList(array));
    }
    public HashSet<T> hashSet(T[] array){
        if (array == null){
            throw new IllegalArgumentException("Переданный массив не должен быть равен нулю");
        }
        return new HashSet<T>(Arrays.asList(array));
    }
    public HashMap<K, V> newHashMap(K[] keys, V[] values){
        HashMap<K, V> result = new HashMap<>();
        if(keys == null){
            throw new IllegalArgumentException("Массив ключей это null");
        }
        if(values == null){
            throw new IllegalArgumentException("Массив значений это null");
        }
        if(values.length != keys.length){
            throw new IllegalArgumentException("Длины массивов должны быть одинаковы");
        }
        for (int i = 0; i < keys.length; i++){
            result.put(keys[i], values[i]);
        }
        return result;
    }

}
