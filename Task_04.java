package Generics;

import java.util.*;

class Main {

    // Sort list
    public static void sortList(List<? extends Number> list) {
        Collections.sort(list, new Comparator<Number>() {
            public int compare(Number a, Number b) {
                return Double.compare(a.doubleValue(), b.doubleValue());
            }
        });
    }

    //calculate sum
    public static double getSum(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum = sum + n.doubleValue();
        }

        return sum;
    }

    // Find maximum
    public static double getMax(List<? extends Number> list) {
        double max = list.get(0).doubleValue();

        for (Number n : list) {
            if (n.doubleValue() > max) {
                max = n.doubleValue();
            }
        }

        return max;
    }

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        list.add(10);
        list.add(5.5);
        list.add(20);
        list.add(3.2);
        list.add(15);

        sortList(list);
        double sum = getSum(list);
        double max = getMax(list);

        System.out.println("Sorted List: " + list);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum Value: " + max);
    }
}
