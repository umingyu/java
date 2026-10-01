import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phone;

    // 학번 getter, setter
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // 이름 getter, setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 전공 getter, setter
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    // 전화번호 getter, setter
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        // 3명의 학생 정보 입력
        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.print((i + 1) + "번째 학생 정보 입력 (학번 이름 전공 전화번호): ");

            String idStr = scanner.next();
            String name = scanner.next();
            String major = scanner.next();
            String phoneStr = scanner.next();

            // 문자열을 숫자로 변환하여 저장
            // Long.parseLong("01012345678")을 수행하면 앞의 0이 자동으로 탈락되어 1012345678로 저장됨
            students[i].setStudentId(Integer.parseInt(idStr));
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhone(Long.parseLong(phoneStr));
        }

        System.out.println("\n=== 입력된 학생 정보 ===");
        int k =0;
        // 3명의 학생 정보 출력
        for (Student student : students) {
            k++;
            // 숫자로 저장된 전화번호를 문자열로 변환 후 맨 앞 '0' 복구
            String phoneNum = "0" + Long.toString(student.getPhone());

            // 010-xxxx-xxxx 형태로 하이픈 삽입
            String formattedPhone = "";
            if (phoneNum.length() == 11) {
                formattedPhone = phoneNum.substring(0, 3) + "-" +
                        phoneNum.substring(3, 7) + "-" +
                        phoneNum.substring(7);
            } else {
                // 자리수가 11자리가 아닐 경우를 대비한 기본 문자열
                formattedPhone = phoneNum;
            }

            System.out.println(k+"번째 학생: " + student.getStudentId() +
                     student.getName()
                    + student.getMajor()
                     + formattedPhone);
        }

        scanner.close();
    }
}
