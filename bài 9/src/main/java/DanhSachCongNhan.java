import java.util.Scanner;

public class DanhSachCongNhan {
    static Scanner sc = new Scanner(System.in);

    static void NhapCD(CongNhan cn) {
        System.out.print("Nhập mã CN: ");
        cn.setMaCN(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập họ CN : ");
        cn.setmHo(sc.nextLine());
        System.out.print("Nhập tên CN : ");
        cn.setmTen(sc.nextLine());
        System.out.print("Nhập số sản phẩm : ");
        cn.setmSoSP(sc.nextInt());
        sc.nextLine();
    }

    public static void main(String[] args) {
        CongNhan CN[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Bạn cần làm gì ?");
            System.out.println("1.Nhập thông tin CN \n" +
                    "2.Xuất danh sách Công nhân\n" + "3.Tổng số Công Nhân \n" +
                    "4.Sắp xếp giảm dần theo số sản phẩm\n" + "Nhập số khác để thoát");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lượng CN : ");
                    n = sc.nextInt();
                    CN = new CongNhan[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CN thứ " + (i + 1) + ": ");
                        CN[i] = new CongNhan();
                        NhapCD(CN[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-15s %-15s %-15s %-15s \n", "Mã CN", "Họ CN", "Tên CN", "Số sản phẩm");
                    for (int i = 0; i < n; i++) {
                        CN[i].HienThiCongNhan();
                    }
                    break;
                case 3:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += CN[i].getMaCN();
                    }
                    System.out.println("" +
                            "Tổng số lượng công nhân viên : " + tong);
                    break;
                case 4:
                    CongNhan temp = CN[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (CN[i].getmSoSP() < (CN[j].getmSoSP())) {
                                temp = CN[j];
                                CN[j] = CN[i];
                                CN[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        }while (flag) ;


            }


    }


