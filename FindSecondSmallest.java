public class FindSecondSmallest {
    public static int getElement(int arr[],int n){
        if(n==0||n==1){
            return -1;
        }
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest && arr[i]<secondSmallest){
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 6, 7, 5};
	    
        System.out.println(getElement(arr, 5));
    }
}
