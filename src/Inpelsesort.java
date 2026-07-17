import java.util.Arrays;

public class Inpelsesort {

    public static void main(String[] args) {

        int[] arr = {4,8,8,4,2,0,4,6,1,5 , 70};
        sort(arr , 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }


    public static void  sort(int[] arr , int s , int e ){
        if(e - s == 1 ){
            return  ;
        }

        int mid = (s+e)/ 2 ;
        sort(arr,s,mid);
        sort(arr,mid,e);

         marge(arr,s, mid,e);

    }
    public static void marge(int[] arr , int s , int mid , int e ){
        int i = s ;
        int j = mid;
        int k= 0;
        int [] ans = new int[ e - s ] ;



        while (i < mid && j < e){
            if(arr[i] < arr[j]){
                ans[k] = arr[i] ;
                i++;

            }else {
                ans[k] =arr[j];
                j++;
            }
            k++;
        }

        while (i < mid){
            ans[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            ans[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0 ; l < ans.length;l++){
            arr[l+s ] = ans[l];
        }

    }
}
