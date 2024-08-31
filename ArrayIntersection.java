public class ArrayIntersection {
    public static void arrayIntersection(int arr1[],int arr2[]){     
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={1,7,5,2,9,4};
        int arr2[]={2,6,12,8,4,7};
        arrayIntersection(arr1,arr2);
    }
}
