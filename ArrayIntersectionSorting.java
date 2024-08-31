import java.util.Arrays;
public class ArrayIntersectionSorting {
    public static void intersection(int[]arr1,int[]arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n=arr1.length;
        int m=arr2.length;

        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i+=1;
                j+=1;
            }else if(arr1[i] < arr2[j]){
                i+=1;
            }else{
                j+=1;
            }
        }
    }
    public static void main(String[] args) {
        int arr1[]={2,4,3,8,5};
        int arr2[]={1,4,5,9,6,7,8};
        intersection(arr1, arr2);
    }
}
