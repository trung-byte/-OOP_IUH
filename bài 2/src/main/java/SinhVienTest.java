
import java.util.Scanner;
public class SinhVienTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThongTin sv1 = new ThongTin(1,"lê thị ánh nguyệt", 6.5f, 8.5f);
        ThongTin sv2 = new ThongTin(2,"ngô thị mị châu", 7.5f, 8.0f);

        ThongTin sv3 = new ThongTin();
        System.out.println("Nhập mã số của sinh viên sv3: ");
        int masv = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập họ và tên của sinh viên sv3: ");
        String hoten = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết của sinh viên sv3: ");
        float diemlt = sc.nextFloat();
        System.out.println("Nhập điểm thực hành của sinh viên sv3: ");
        float diemth = sc.nextFloat();

        sv3.setMaSV(masv);
        sv3.setHoTen(hoten);
        sv3.setDiemLT(diemlt);
        sv3.setDiemTH(diemth);


        System.out.println(String.format("%-5s %-30s %10s %10s %10s", "MaSV",
                "HoTen", "DiemLT", "DiemTH", "DiemTB"));
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        sc.close();
    }
}
