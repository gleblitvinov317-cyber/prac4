package prac20.task2;

public class Calculator{
    public static <T extends Number, U extends Number> double sum(T a, U b){
        helper(a, b);
        return a.doubleValue()+b.doubleValue();
    }
    public static <T extends Number, U extends Number> double subtraction(T a, U b){
        helper(a, b);
        return a.doubleValue()-b.doubleValue();
    }
    public static <T extends Number, U extends Number> double multiply(T a, U b){
        helper(a, b);
        return a.doubleValue()*b.doubleValue();
    }
    public static <T extends Number, U extends Number> double divide(T a, U b){
        helper(a, b);
        if(b.doubleValue() == 0){
            throw  new ArithmeticException("Делить на ноль нельзя");
        }
        return a.doubleValue()/b.doubleValue();
    }
    public static void helper(Number a, Number b){
        if(a == null) throw new IllegalArgumentException("Первое число null");
        if(b == null) throw new IllegalArgumentException("Второе число null");
    }
}
