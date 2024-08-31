public class CheckNumRecursion {
    public static boolean checkNum(int[] arr,int startIndex,int x){
        int n=arr.length;
        if(n==startIndex){
            return false;
        }
        if (arr[startIndex]==x){
            return true;
        }
        return checkNum(arr,startIndex+1,x);
    }       

    public static void main(String[] args) {
        int arr[]={ 3,8,9,5,4};
        int x=9;
        System.out.println(checkNum(arr,0,x));
    }
}
