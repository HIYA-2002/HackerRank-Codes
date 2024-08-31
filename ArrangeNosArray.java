public class ArrangeNosArray {
    public static int[] arrange(int[] arr,int n){
        int start=0;
        int end=n-1;
        int number=1;
        while(start<=end){
            if(number%2==1){
                arr[start]=number;
                number+=1;
                start+=1;
            }
            else{
                arr[end]=number;
                number=number+1;
                end-=1;
            }
            
        }
       return arr;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        System.out.println(arrange(arr, 0));
    }
}
