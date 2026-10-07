import java.util.Scanner;

class Homework3 {
    public static void main(String[] args){
        int arr[] = new int[100];
        int max = 0;
        int min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("몇 개의 수를 입력할 예정인가요? ");
        int input = sc.nextInt();
        System.out.printf("수를 입력하세요: ");

        for (int i = 0; i<input;i++){
            int input1 = sc.nextInt();
            arr[i] = input1;
        }
        for (int i = 0; i < input; i++) {
            if(i == 0) {
                max = arr[i];
                min = arr[i];
            }
            if(max < arr[i]) max = arr[i];
            else if (min>arr[i]) min = arr[i];
        }
        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+min);
    }
}
