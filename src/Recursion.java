import java.util.ArrayList;

public class Recursion {

    public static void main(String[] args) {

//        System.out.println(reverseNum(12345));
        int[] arr = {1,2,3,4,5,6,7,8,9,4};
//       System.out.println(isSorted(arr,0));
        //System.out.println(linarSearch(arr,15,0));
        ArrayList<Integer> ans = lsraeh(arr,4,0,new ArrayList<>());
        System.out.println(ans);



    }
    public  static int sumofDigits(int num){
        if(num == 0){
            return 0;
        }


        return num%10 + sumofDigits(num / 10) ;

    }

    public static int reverseNum(int num) {
        if (num < 10) {
            return num;
        }

        int div = 1;
        while (num / div >= 10) {
            div *= 10;
        }

        return (num % 10) * div + reverseNum(num / 10);
    }
    public static  boolean isSorted(int[] arr, int index){
        if(index==arr.length-1){
            return  true ;
        }
        return  arr[index] < arr[index+1] && isSorted(arr ,index +1);

    }
    public static  int  linarSearch(int[] arr,int target, int index){
        if(arr[index]==arr.length-1){
            return   -1;
        }

        if(arr[index]==target){
            return index;
        }
        return   linarSearch(arr ,target,index +1);

    }


    public  static ArrayList<Integer> lsraeh(int[] arr , int targat , int index , ArrayList<Integer> list ){
        if(index==arr.length){
            return list;
        }
        if(arr[index] == targat){
            list.add(index);
        }
        return lsraeh(arr,targat,index+1,list);

    }


}

