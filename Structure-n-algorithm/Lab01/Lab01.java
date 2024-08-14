import java.util.Scanner;
public class Lab01 {
    public static void main(String[] args)
    {
        double sum = 0;
        int n = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tính trung bình năm số nhập");
        
        // Nhập 5 số nguyên
        System.out.print("Vui lòng nhập số thứ nhất: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Vui lòng nhập số thứ hai: ");
        int n2 = scanner.nextInt();
        
        System.out.print("Vui lòng nhập số thứ ba: ");
        int n3 = scanner.nextInt();
        
        System.out.print("Vui lòng nhập số thứ tư: ");
        int n4 = scanner.nextInt();
        
        System.out.print("Vui lòng nhập số thứ năm: ");
        int n5 = scanner.nextInt();
        
        // Tính tổng và trung bình
        sum+=((double)(n1+n2+n3+n4+n5)/n);

        // Xuất kết quả)
        System.out.println("Trung bình của năm số nhập là: " + sum);
        
        scanner.close();
    }
}
