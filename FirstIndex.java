public class FirstIndex {
    public static int findFirstIndex(int arr[],int x,int startIndex){
        if(arr.length==startIndex){
            return -1;
        }
        if(arr[startIndex]==x){
            return startIndex;
        }
        int smallAns=findFirstIndex(arr, x,startIndex+1);
        return smallAns;
    }
    public static int findFirstIndex(int arr[],int x){
        return findFirstIndex(arr, x,0);
    }
    public static void main(String[] args) {
        int arr[]={9,8,10,8,5};
        int x=8;
        System.out.println(findFirstIndex(arr,x));
    }
}
