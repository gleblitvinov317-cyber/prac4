package prac20.task2;

public class MinMax <T extends Comparable<T>> {
    private final T[] array;

    public MinMax(T[] array) {
        if (array == null){
            throw new IllegalArgumentException("Переданный массив null");
        }
        this.array = array;
    }

    public T min(){
        if(array.length == 0){
            throw new IllegalArgumentException("Невозможно найти минимум потому, что массив пустой");
        }
        T min = array[0];
        for(int i = 1; i < array.length; i++) {
            T tek = array[i];
            if(tek.compareTo(min) < 0){
                min = tek;
            }
        }
        return min;
    }
    public T max(){
        if(array.length == 0){
            throw new IllegalArgumentException("Невозможно найти максимум потому, что массив пустой");
        }
        T max = array[0];
        for(int i = 1; i < array.length; i++) {
            T tek = array[i];
            if(tek.compareTo(max) > 0){
                max = tek;
            }
        }
        return max;
    }
}
