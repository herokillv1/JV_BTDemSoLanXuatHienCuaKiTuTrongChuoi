import java.util.Scanner;

public class BTDemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        int n = 0;
        while (n < array.length) {
            System.out.print("Nhập phần tử thứ " + n + ": ");
            array[n] = scanner.nextLine();
            n++;
        }

        System.out.println();
        System.out.println("Nhập vào kí tự cần kiểm tra : ");
        String X = scanner.nextLine();
        int count = 0;
        System.out.println();
        System.out.print("Mảng vừa tạo : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (X.equals(array[i])) {
                count++;
            }
        }
        System.out.println();
        System.out.print("Số lần xuất hiện của kí tự vùa nhập là : " + count);
    }
}
