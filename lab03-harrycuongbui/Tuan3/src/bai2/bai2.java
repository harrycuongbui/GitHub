package bai2;

public class bai2 {
	
     //Hàm main
  public static void main(String[] args) {
	  PS phanSo1=new PS(14,5);    // tạo phân số có tử = 14 và mẫu = 5
	  PS phanSo2=new PS(1,7); // tạo phân số có tử = 1 và mẫu = 7
	  
	  phanSo1.congPhanSo(phanSo2);
      phanSo1.truPhanSo(phanSo2);
      phanSo1.nhanPhanSo(phanSo2);
      phanSo1.chiaPhanSo(phanSo2);
}
	
}
//Lớp PS
 class PS {
    private int tu, mau;
 
    public PS(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }
     
     public int getTu() {
        return tu;
    }
 
    public void setTu(int tu) {
        this.tu = tu;
    }
 
    public int getMau() {
        return mau;
    }
 
    public void setMau(int mau) {
        this.mau = mau;
    }
 //Tìm USCNL của tử và mẫu của 1 phân số
    public int timUSCLN(int a, int b) {
        if (b == 0) return a;
        return timUSCLN(b, a % b);
    }
    
     //Tối giản 1 phân số
    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
    //cộng 2 phân số
    public void congPhanSo(PS ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PS phanSoTong = new PS(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
     //Trừ 2 phân số
    public void truPhanSo(PS ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PS phanSoHieu = new PS(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
     //nhân 2 phân số
    public void nhanPhanSo(PS ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PS phanSoTich = new PS(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
     //chia 2 phân số
    public void chiaPhanSo(PS ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PS phanSoThuong = new PS(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
     
}