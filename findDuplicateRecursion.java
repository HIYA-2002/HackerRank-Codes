public class findDuplicateRecursion {
    public static int findDuplicate(int[]arr){
        int sumOfNminusTwoNaturalNumbers=0;
        for(int i=0;i<(arr.length-1);i++){
            sumOfNminusTwoNaturalNumbers+=i;
        }
        int sumOfElements=0;
        for(int i=0;i<(arr.length);i++){
            sumOfElements+=arr[i];
        }
        return(sumOfElements-sumOfNminusTwoNaturalNumbers);
    }
    public static void main(String[] args) {
        int arr[]={2,1,0,4,2,0};
        System.out.println(findDuplicate(arr));
    }
}
