public class MergeSort {
    private static void merge(int arr[],int startIndex,int endIndex){
        int size=endIndex-startIndex+1;
        int mid=(startIndex+endIndex)/2;
        int ans[]=new int[size];
        int i=startIndex;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=endIndex){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<=endIndex){
            ans[k]=arr[j];
            k++;
            j++;
        }
        for(int index=0;index<ans.length;index++){
            arr[startIndex+index]=ans[index];
        }

    }
    public static void mergeSort(int arr[],int startIndex,int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int mid=(startIndex+endIndex)/2;
        mergeSort(arr, startIndex, mid);
        mergeSort(arr, mid+1, endIndex);
        merge(arr, startIndex, endIndex);
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        mergeSort(arr, 0, 5);
        for(int i=0;i<6;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
