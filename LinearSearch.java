public class LinearSearch {
     /*public static int[] takeInput(){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[ ] arr=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter element at"+ i +" th index");
                arr[i]=sc.nextInt();
            }
            return arr;

        }*/
    public static int FindElement(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
            
        }
        return -1;

    }
    public static void main(String[ ]args){
        int arr[]={2,13,4,1,3,6,28};
        int num=4;
        System.out.println(num+" is found at index"+FindElement(arr,num));
       
    }
        
}
