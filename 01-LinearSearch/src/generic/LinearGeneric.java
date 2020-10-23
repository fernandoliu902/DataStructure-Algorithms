package generic;

public class LinearGeneric {
    public static <E> int search(E[] arr, E target){
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
    //泛型的使用 可以使方法就收多种数据类型
    //但是只能接受类对象 不能接受基本数据类型 所以要重新封装 例如下面Integer
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,55,33,16,9,10,15};
        Integer target = 16;
        LinearGeneric lg = new LinearGeneric();
        int ans = lg.search(arr, target);
        System.out.println(ans);
    }
}
