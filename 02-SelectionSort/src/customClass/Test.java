package customClass;

import generic.SelectGenerics;

public class Test {
    public static <E extends Comparable<E>> void sort(E[] arr){

        // arr[0...i) 是有序的；arr[i...n) 是无序的
        for(int i = 0; i < arr.length; i ++){

            // 选择 arr[i...n) 中的最小值
            int minIndex = i;
            for(int j = i; j < arr.length; j ++){
                if(arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }

            E temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
    public static void main(String[] args){

        Student[] students = {new Student("A",99),
                new Student("B",81),
                new Student("C",100)};
        Test.sort(students);
        for(Student e: students)
            System.out.print(e + " ");
        System.out.println();
    }
}
