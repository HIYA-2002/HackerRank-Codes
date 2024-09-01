public class ArraySortedAndRotated {
    public static boolean checkSortedAndRotated(int arr[]){
        int n=arr.length;
        int countOutOfOrder=0; // Variable to keep track of the number of times a pair is out of order.
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){  // The next element of the last item is the first item, hence the modulo operation.
                countOutOfOrder++;
            }
        }
        return countOutOfOrder<=1; // The array is non-decreasing if there is at most one out-of-order pair.
    }
    public static void main(String[] args) {
        int arr[]={2,3,8,9,1};
        System.out.println(checkSortedAndRotated(arr));
    }
}
