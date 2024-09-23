public class FindPivotUsingBinarySearch {
    public static int findPivot(int arr[],int n){
        int s=0;  //s=start
        int e=n-1;  //e=end
        int mid=s+(e-s)/2;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return e; //return s
    }
    public static void main(String[] args) {
        int arr[]={3,8,10,17,1};
        System.out.println(findPivot(arr, 5));
    }
}
