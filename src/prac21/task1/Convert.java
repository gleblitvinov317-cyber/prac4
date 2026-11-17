package prac21.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert {
    public static <T> List<T> converter(T[] array){
        if(array == null){
            throw new IllegalArgumentException("Массив не может быть null");
        }
        return new ArrayList<>(Arrays.asList(array));
    }
}
