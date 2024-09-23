public class LastIndex {
    public static int lastIndex(int arr[],int x,int startIndex){
        if(arr.length==startIndex){
            return -1;
        }
        int smallAns=lastIndex(arr, x, startIndex+1);
        if(smallAns!=-1){
            return smallAns;
        }
        if(arr[startIndex]==x){
            return startIndex;
        }
        else{
            return -1;
        }
    }
    public static int lastIndex(int arr[],int x){
        return lastIndex(arr, x,0);
    }
    public static void main(String[] args) {
        int arr[]={5,8,7,5,8,5};
        System.out.println(lastIndex(arr, 8));
    }

}
