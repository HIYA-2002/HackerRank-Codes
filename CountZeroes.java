public class CountZeroes {
    public static int countZeroes(int n){
        if(n<10){
            if(n==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(n % 10==0){
            return countZeroes( n/10)+1;
        }else{
            return countZeroes(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(countZeroes(10300020));
    }
}
