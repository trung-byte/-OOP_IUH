public class Vehicle {
    private String ChuXe;
    private String LoaiXe;
    private double TriGiaXe;
    private double DungTichXylanh;

   public Vehicle() {

   }

    public Vehicle(String chuXe, String loaiXe, double triGiaXe, double dungTichXylanh) {
        this.ChuXe = chuXe;
        this.LoaiXe = loaiXe;
        this.TriGiaXe = triGiaXe;
        this.DungTichXylanh = dungTichXylanh;
    }

    public String getChuXe() {
        return ChuXe;
    }

    public void setChuXe(String chuXe) {
        ChuXe = chuXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        LoaiXe = loaiXe;
    }

    public double getTriGiaXe() {
        return TriGiaXe;
    }

    public void setTriGiaXe(double triGiaXe) {
        TriGiaXe = triGiaXe;
    }

    public double getDungTichXylanh() {
        return DungTichXylanh;
    }

    public void setDungTichXylanh(double dungTichXylanh) {
        DungTichXylanh = dungTichXylanh;
    }

    public double thue() {
       double t = 0;
       if (DungTichXylanh < 100 ) {
           t = TriGiaXe * 1 / 100;
       }
       if (DungTichXylanh >= 100 && DungTichXylanh <= 200) {
           t = TriGiaXe * 3 / 100;
       }
       if (DungTichXylanh > 200) {
           t = TriGiaXe * 5/100;
       }
        return t;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-15s %-30s %-15s %-15s "
                ,ChuXe , LoaiXe , TriGiaXe , DungTichXylanh , thue());
    }
}


