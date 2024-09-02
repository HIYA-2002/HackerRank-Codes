// Time complexity=O(n)
public class findUniqueInArray {
    public static int findUnique(int[]arr){
        int XOR=0;
        for(int i=0;i<arr.length;i++){
            XOR^=arr[i];
        }
        return XOR;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,3,6,1,6};
        System.err.println(findUnique(arr));
    }
}
