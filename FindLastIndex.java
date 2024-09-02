public class FindLastIndex {
    public static int findLastIndex(int arr[],int x,int lastIndex){
        if(arr.length==0){
            return -1;
        }
        if(arr[lastIndex]==x){
            return lastIndex;
        }
        int smallAns=findLastIndex(arr, x,lastIndex-1);
        return smallAns;
    }
    public static int findLastIndex(int arr[],int x){
        return findLastIndex(arr, x,4);
    }
    public static void main(String[] args) {
        int arr[]={9,8,10,8,5};
        int x=8;
        System.out.println(findLastIndex(arr,x));
    }
}
  