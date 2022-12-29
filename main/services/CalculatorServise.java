package main.services;
import java.util.ArrayList;
import java.util.Objects;

public class CalculatorServise<T extends Number> {
    private T[] array1;
    private T[] array2;

    public CalculatorServise(T[] array1, T[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }
    public Integer[] MultiplyArrays() {
        Integer[] res = new Integer[array1.length];

        for (int i = 0; i < array1.length; i++) {
            res[i] = (int) Math.round (array1[i].doubleValue() * array2[i].doubleValue()) ;
        }

        return res;
    }
}
