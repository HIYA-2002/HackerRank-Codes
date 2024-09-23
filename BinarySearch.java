public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int n=arr.length;
        int low=0;int high=n-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                return low=mid+1;
            }
            else{
                return high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,8,12,15};
        int key=12;
        int index=binarySearch(arr, key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index:"+ index);
        }
    }
    
}
