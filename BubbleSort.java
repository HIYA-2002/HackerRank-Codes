public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int didSwap=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={34,26,20,56,43,15};
        bubbleSort(arr);
    }
}
