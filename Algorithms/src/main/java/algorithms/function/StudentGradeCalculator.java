package algorithms.function;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin học sinh
        System.out.println("Nhập họ và tên của học sinh:");
        String fullName = scanner.nextLine();

        System.out.println("Nhập điểm toán:");
        double mathScore = scanner.nextDouble();

        System.out.println("Nhập điểm văn:");
        double literatureScore = scanner.nextDouble();

        // Tính điểm trung bình
        double averageScore = (mathScore + literatureScore) / 2;

        // Xuất kết quả
        System.out.println("\nThông tin học sinh:");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Điểm toán: " + mathScore);
        System.out.println("Điểm văn: " + literatureScore);
        System.out.println("Điểm trung bình: " + averageScore);

        // Đóng scanner
        scanner.close();
    }
}
