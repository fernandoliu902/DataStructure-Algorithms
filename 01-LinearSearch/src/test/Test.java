package test;

import CustomClass.Student;
import Performance.ArrayGenerator;
import generic.LinearGeneric;
import linaer.LinearSearch;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,55,33,16,9,10,15};
        int target = 16;
        LinearSearch ls = new LinearSearch();
        int ans = ls.search(arr, target);
        System.out.println(ans);

        /////////////////////////////////////////
        //重写Student类中的equals方法
        Student[] students = {new Student("A"),new Student("B"),new Student("C")};
        Student b = new Student("B");
        System.out.println(LinearGeneric.search(students, b));

        ///////////////////////////////////
        //性能测试
        Integer[] arr1 = ArrayGenerator.generateOrderedArray(1000000);
        long start = System.nanoTime();
        for (int k = 0; k < 100; k++)
            System.out.println(LinearGeneric.search(arr1,1000000));
        long end = System.nanoTime();
        double time = (end - start)/1000000000.0;
        System.out.println("n = " + 1000000 +  ", 100 runs : " + time + "s" );
    }
}
