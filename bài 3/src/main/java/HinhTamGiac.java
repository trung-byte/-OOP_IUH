public class HinhTamGiac {
    int ma , mb , mc ;
public  static double Pi = 3.14;
public HinhTamGiac() {
        }

public HinhTamGiac(int ma, int mb, int mc) {
        this.ma = ma;
        this.mb = mb;
        this.mc = mc;
        }

public int getMa() {
        return ma;
        }

public void setMa(int ma) {
        this.ma = ma;
        }

public int getMb() {
        return mb;
        }

public void setMb(int mb) {
        this.mb = mb;
        }

public int getMc() {
        return mc;
        }

public void setMc(int mc) {
        this.mc = mc;
        }

public double chuVi(){
        if(isTriangle())
        return ma + mb + mc;
        return 0;
        }

public  double dienTich(){
        if(isTriangle()){
        double p = (ma + mb + mc)/2;
        return ((int)(Math.sqrt(p*(p - ma) * (p - mb) * (p - mc))));}
        return 0;
        }
public String triangleInfo(){
        String answer = "Day la tam giac thuong";
        if(isTriangle()){
        if((ma == mb && ma != mc) || (mb == mc && mb != ma) ){
        answer = "Day la tam giac can!";
        }
        if(ma == mb && ma == mc){
        answer = ("Day la tam giac deu!");
        }
        if((Math.pow(ma,2) + Math.pow(mb , 2) == Math.pow(mc ,2))
        || Math.pow(ma,2) == Math.pow(mb , 2) + Math.pow(mc ,2)
        || Math.pow(ma,2) + Math.pow(mc, 2) == Math.pow(mb ,2)
        ){
        answer = ("Day la tam giac vuong!");
        }
        }
        if(isTriangle() == false)
        answer = ("Day ko phai la 1 tam giac!");
        return answer;
        }
public boolean isTriangle(){
        boolean result = true;
        if(ma >= mb + mc || mb >= ma + mc || mc >= ma + mb){
        result = false;
        }
        return result;
        }

public String toString(){
        System.out.println(String.format("%-10s %-10s %-10s %-30s %-10s %-10s",
        ma , mb ,mc , triangleInfo(), chuVi(), dienTich()));
        return null;
        }
}