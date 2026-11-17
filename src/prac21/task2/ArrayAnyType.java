package prac21.task2;

import java.lang.reflect.Array;

public class ArrayAnyType {
    private final Object[] array;

    public ArrayAnyType(Object array) {
        if(array == null){
            throw new IllegalArgumentException("Объект не может быть null");
        }
        this.array = toArray(array);
    }
    public Object[] toArray(Object array){
        if(!array.getClass().isArray()){
            throw new IllegalArgumentException("На вход требуется массив");
        }
        int length = Array.getLength(array);
        Object[] endArray = new Object[length];
        for (int i = 0; i < length; i++){
            endArray[i] = Array.get(array, i);
        }
        return endArray;
    }
    public Object get(int index){
        if(index < 0 || index >= array.length){
            throw new IllegalArgumentException("Индекс вне списка");
        }
        return array[index];
    }
}
