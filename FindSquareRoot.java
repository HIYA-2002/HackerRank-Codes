import java.util.Scanner;
public class FindSquareRoot {
    public static int SqrtInteger(int n){
        int s=0;
        int e=n;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            int square=mid*mid;
            if(square==n){
                return mid;
            }
            else if(square<n){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
    public static int findSqRt(int x){
        return SqrtInteger(x);
    }
    public static double morePrecision(int n,int precision,int tempSolution){
        double factor=1;
        double ans=tempSolution;
        for(int i=0;i<precision;i++){
            factor=factor/10;
            for(double j=ans;j*j<n;j=j+factor){
                ans=j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tempSolution=SqrtInteger(n);
        System.out.println(morePrecision(n, 2, tempSolution));
        sc.close();
    }
}
