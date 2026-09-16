import java.util.Scanner;

class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int sum=0;
        int ln = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.",sum);
        System.out.println("\n정수를 입력하세요: ");
        int ln1 = sc.nextInt();
        sum = ln+ln1;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.",sum);
        System.out.println("\n정수를 입력하세요: ");
        int ln2 = sc.nextInt();
        sum +=ln2;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.",sum);
        System.out.println("\n정수를 입력하세요: ");
        int ln3 = sc.nextInt();
        sum +=ln3;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.",sum);
        System.out.println("\n정수를 입력하세요: ");
        int ln4 = sc.nextInt();
        sum +=ln4;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.",sum);
    }
}
