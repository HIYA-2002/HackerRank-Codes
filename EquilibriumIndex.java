public class EquilibriumIndex {
    public static int arrayequilibriumIndex(int[] arr){
        int leftSum=0;
        int rightSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            rightSum=rightSum+arr[i];
        }
        for(int i=0;i<n;i++){
            rightSum=rightSum-arr[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,-1};
        System.out.println(arrayequilibriumIndex(arr));
    }
}
