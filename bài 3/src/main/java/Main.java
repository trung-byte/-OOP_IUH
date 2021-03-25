import java.util.Scanner;

public class Main {
        static Scanner sc = new Scanner(System.in);
        public static boolean hopLe(int n){
            boolean result = true;
            if(n <= 0){
                result = false;
            }
            while(!result){
                System.out.print("Canh nhap ko hop le moi nhap lai :");
                n = sc.nextInt();
                return hopLe(n);
            }
            return result;
        }

        public static void main(String[] args){
            HinhTamGiac tamgiac1 = new HinhTamGiac();
            Scanner sc = new Scanner(System.in);

            System.out.print("Moi nhap canh MA = ");
            int n1 = sc.nextInt();
            hopLe(n1);
            tamgiac1.setMa(n1);
            System.out.print("Moi nhap canh MB = ");
            int n2 = sc.nextInt();
            hopLe(n2);
            tamgiac1.setMb(n2);
            System.out.print("Moi nhap canh MC = ");
            int n3 = sc.nextInt();
            hopLe(n3);
            tamgiac1.setMc(n3);
            System.out.println(String.format("%-10s %-10s %-10s %-30s %-10s %-10s" ,
                    "Canh MA", "Canh MB" , "Canh MC","Loai Tam Giac", "Chu vi" , "Dien tich"));
            tamgiac1.toString();
        }
}

