import java.util.*;

 class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series upto"+n+" terms is:");
        if(n==1)
            System.out.println("0");
        else{
            int a=0;
            int b=1;
            System.out.print("0 1");
            for(int i=3;i<=n;i++){
                int next=a+b;
                System.out.print(" "+next);
                a=b;
                b=next;
            }
        }
    }
}
