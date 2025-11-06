
import java.util.Scanner;
import java.util.List;
public class Khachhang {
    private String ho;
    private String ten;
    private int Makh;
    private int SDT;
    private Hoadon = [];
    public Khachhang(){
        ho = "";
        ten = "";
        Makh = 0;
        SDT = 0;
        Danhsachhoadon = null;
    }
    public Khachhang(String ho, String ten, int Makh, int SDT){
        this.ho = ho;
        this.ten = ten;
        this.Makh = Makh;
        this.SDT = SDT;
    }
    public void nhap (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho: ");
        ho = sc.nextLine();
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap ma khach hang: ");
        Makh = sc.nextInt();
        System.out.print("Nhap so dien thoai: ");
        SDT = sc.nextInt();
        sc.close();
    }
    public void xuat(){
        System.out.println("Thong tin khach hang: ");
        System.out.println("Ho: "+ho);
        System.out.println("Ten: "+ten);
        System.out.println("Ma khach hang: "+Makh);
        System.out.println("So dien thoai: "+SDT);
    }
    public String getHo(){
        return ho;
    }
    public String getTen(){
        return ten;
    }
    public int getMaKH(){
        return Makh;
    }
    public int getSDT(){
        return SDT;
    }
    public List<Hoadon> getDanhsachhoadon(){
        return Danhsachhoadon;
    }
    public void setHo(String ho){
        this.ho = ho;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setMakh(int Makh){
        this.Makh = Makh;
    }
    public void setSDT(int SDT){
        this.SDT = SDT;
    }
    public void setDanhsachhoadon(List<Hoadon> Danhsachhoadon){
        this.Danhsachhoadon = Danhsachhoadon;
    }
}
 {
    
}
