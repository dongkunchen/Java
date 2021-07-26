package dongkun;


public class ArrayDemo {
    public static void main(String[] args){
        int[] arr = new int[3];//動態初始化
        int[] arr2 = {111,222,333};//靜態初始化
        for (int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }
        int max = arr2[0];
        for (int i = 0;i < arr2.length;i++){
            if(max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.println(max);
    }
}
