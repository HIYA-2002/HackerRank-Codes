// time complexity =O(n^2 )
public class FindUnique {
    public static void findUnique(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0; //inner most loop to make comparision between elemnts and skip duplicate elements
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                     count++;
                } 
            }
            if(count==1){
                    System.out.println(arr[i]);//returns ans
            } 
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,6,5,1,2,3,6};
        findUnique(arr);
    }
}
