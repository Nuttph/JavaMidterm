import java.util.Scanner;
public class KenSeries {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++){
            System.out.println(i);
        }
    }

    public static void num(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.print("result = "+sum);
    }

    public static void num2(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n3 = sn.nextInt();

        if(n3%2 == 0){
            System.out.print(n3+" is a Even number.");
        }else{
            System.out.print(n3+" is a Odd number.");
        }
    }
}

