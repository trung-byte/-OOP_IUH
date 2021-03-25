public class CD {
    private int MaCD;
    private String TuaCD;
    private int SoBH;
    private float GiaThanh;

    public CD() {
    }

    public CD(int maCD, String tuaCD, int soBH, float giaThanh) {
        MaCD = maCD;
        TuaCD = tuaCD;
        SoBH = soBH;
        GiaThanh = giaThanh;
    }

    public int getMaCD() {
        return MaCD;
    }

    public void setMaCD(int maCD) {
        MaCD = maCD;
    }

    public String getTuaCD() {
        return TuaCD;
    }

    public void setTuaCD(String tuaCD) {
        TuaCD = tuaCD;
    }

    public int getSoBH() {
        return SoBH;
    }

    public void setSoBH(int soBH) {
        SoBH = soBH;
    }

    public float getGiaThanh() {
        return GiaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        GiaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "CD{" +
                "MaCD=" + MaCD +
                ", TuaCD='" + TuaCD + '\'' +
                ", SoBH=" + SoBH +
                ", GiaThanh=" + GiaThanh +
                '}';
    }
    public void HienThiCD(){
        System.out.printf("%-10d %-20s %-15d %-20.1f \n",MaCD,TuaCD,SoBH,GiaThanh);
    }
}
