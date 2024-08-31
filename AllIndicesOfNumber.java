public class AllIndicesOfNumber {
    public static int[] allIndicesOfNum(int arr[],int x,int startIndex){
        if(arr.length==startIndex){
            int output[]=new int[0];
            return output;
        }
        int smallOutput[]=allIndicesOfNum(arr, x, startIndex+1);
        if(arr[startIndex]==x){
            int output[]=new int[smallOutput.length +1];
            output[0]=startIndex;
            for(int i=0;i<smallOutput.length;i++){
                output[i+1]=smallOutput[i];
            }
            return output;
        }
        else{
            return smallOutput;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,5,5,6};
        System.out.println(allIndicesOfNum(arr,5,0));
    }
}
