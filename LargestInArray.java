public class LargestInArray {
    public static int findlargest(int arr[]){
        if(arr.length==1){
            return arr[0];
        }
        int Max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        return Max;
    }
    public static void main(String[] args) {
        int arr[]={29,67,39,84,56};
        System.out.println(findlargest(arr));
    }
}
