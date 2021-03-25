
public class ThongTin {
    private int MaSV;
    private String HoTen;
    private float DiemLT;
    private float DiemTH;

    public ThongTin() {
        this(0,"",0.0f,0.0f);
    }

    public ThongTin(int maSV, String hoTen, float diemLT, float diemTH) {
        MaSV = maSV;
        HoTen = hoTen;
        DiemLT = diemLT;
        DiemTH = diemTH;
    }

    public void setMaSV(int maSV) {
        if (maSV < 0 )
            this.MaSV = 0;
        else
            this.MaSV = maSV;

    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(float diemLT) {
        if (diemLT >= 0 && diemLT <= 10)
            this.DiemLT = diemLT;
        else
            this.DiemLT = 0;
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(float diemTH) {
        if (diemTH >= 0 && diemTH <= 10)
            this.DiemTH = diemTH;
        else
            this.DiemTH = 0;
    }

    public float getDiemTB() {
        return (DiemLT + DiemTH)/2;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-30s %10.2f %10.2f %10.2f", MaSV, HoTen,
                DiemLT, DiemTH, getDiemTB());
    }
}
