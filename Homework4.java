import java.util.Scanner;

class Homework4 {
    int gcd(int a, int b) {
        if (b == 0) {
            System.out.println(a);
            return 1;
        }
        if (a > b) return gcd(b,a%b);
        else if (a < b) return gcd(a,b%a);
        else return 1;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        Homework4 hw = new Homework4();
        System.out.println("입력하시오 :");
        int a = sc.nextInt();
        System.out.println("입력하시오 :");
        int b = sc.nextInt();
        hw.gcd(a,b);
        while (a != 0 && b != 0){
            if (a > b){
                a = a%b;
            }

            else if (a < b) {
                b = b%a;
            }
            else break;
        }
        System.out.println(a +" "+ b);
    }
}
