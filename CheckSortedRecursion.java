public class CheckSortedRecursion {
    public static boolean checkSorted(int arr[],int startIndex){
        if(startIndex>=arr.length-1){
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }
        boolean smallAns=checkSorted(arr, startIndex+1);
        return smallAns;
    }
    public static void main(String[] args) {
        int arr[]={2,8,6,9};
        System.out.println(checkSorted(arr, 0));
    }
}
