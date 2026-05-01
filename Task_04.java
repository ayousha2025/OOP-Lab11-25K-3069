// Assuming you have a List of objects of different types such as Integer and Double, write a program in
// Java using generics that:
// 1. Sorts the list in ascending order based on the values of the objects.
// 2. Calculates the sum of all the objects in the list.
// 3. Finds the maximum value of all the objects in the list.
// 4. Prints out the sorted list, sum of all the objects, and maximum value of all the objects.
// You&#39;ll need to use Java&#39;s Comparable and Wildcard generics to accomplish this.

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
