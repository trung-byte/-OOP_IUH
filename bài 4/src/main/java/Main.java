public class Main {
public static void main(String[] args) {
    Vehicle xe1 = new Vehicle("Nguyễn Thu Loan","Future Neo",100,35000000.00);
    Vehicle xe2 = new Vehicle("Lê Minh Tính","Ford Ranger",3000,250000000);
    Vehicle xe3 = new Vehicle("Nguyễn Minh Triết","Landscape",1500,1000000000);

    System.out.println(String.format("%-30s %-15s %-25s %-20s %-15s"
            ,"Tên chủ xe" , "Loại xe" , "Trị giá xe" , "Dung Tích xylanh" , "Thuế"));
    System.out.println(xe1);
    System.out.println(xe2);
    System.out.println(xe3);

    }
}
