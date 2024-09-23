public class BinarySearchRecursive {
    public static int binarySearch(int arr[],int key,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low+(high-low)/2);
        if(arr[mid]==key){
            return mid;
        }
        else if(key>arr[mid]){
            return binarySearch(arr, key, mid+1, high);
        }
        else{
            return binarySearch(arr, key, low, mid-1);
        }
    }    
    public static void main(String[] args) {
        int arr[]={2,5,8,12,15};
        int key=12;
        int index=binarySearch(arr, key, 0, 4);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index:"+ index);
        }
    }
}
