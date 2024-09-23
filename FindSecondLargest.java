public class FindSecondLargest {
        public static int getSecondOrderElements(int n, int []a) {
            // Write your code here.
            if(n==0 || n==1){
                return -1;
            }
            int largest=Integer.MIN_VALUE;
            int secondLargest=Integer.MIN_VALUE;
            for(int i=1;i<n;i++){
                if(a[i]>largest){
                    secondLargest=largest;
                    largest=a[i];
                }
                else if(a[i]>secondLargest && a[i]<largest){
                    secondLargest=a[i];
                }
            }
            return secondLargest;
        }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
	    
        System.out.println(getSecondOrderElements(6, arr));
    }
}
