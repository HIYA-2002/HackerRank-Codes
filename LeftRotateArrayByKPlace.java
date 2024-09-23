public class LeftRotateArrayByKPlace {
    public static void rotateArray(int arr[],int k){
        int n=arr.length;
        if(n==0){
            return;
        }
        k=k%n;
        if(k>n){
            return;
        }
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i]=arr[i+k];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-n+k];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        rotateArray(arr, 4);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
