public class FirstAndLastPosition {
    public static int firstOccurenece(int arr[],int key){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=low+(high-low)/2;
        int ans=-1;
        while(low<=high){
            if(arr[mid]==key){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>key){
                return high=mid-1;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            mid=low+(high-low)/2;
        }
        return ans;
    }
    public static int lastOccurenece(int arr[],int key){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=low+(high-low)/2;
        int ans=-1;
        while(low<=high){
            if(arr[mid]==key){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>key){
                return high=mid-1;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            mid=low+(high-low)/2;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[]={3,6,8,8,8,15,21,25};
        int key=8;
        
        firstOccurenece(arr, key);
        int index1=firstOccurenece(arr, key);
        if(index1==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index:"+ index1);
        }
        lastOccurenece(arr, key);
        int index2=lastOccurenece(arr, key);
        if(index2==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index:"+ index2);
        }
    
    }
}
