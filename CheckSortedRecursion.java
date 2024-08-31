public class CheckSortedBetter {
    public static boolean checkSorteedBetter(int arr[],int startIndex){
        if(startIndex>=arr.length-1){
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }
        boolean smallAns=checkSorteedBetter(arr, startIndex+1);
        return smallAns;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,3};
        System.out.println(checkSorteedBetter(arr, 0));
    }
}
