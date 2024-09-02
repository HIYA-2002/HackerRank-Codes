public class FindDuplicate {
    public static void findDuplicate(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            //int count=0; //count no of ocurrences of an element
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]); 
                } 
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,6,5,10,4,3,0,6};
        findDuplicate(arr);
    }
}

