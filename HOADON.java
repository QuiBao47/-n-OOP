
import java.util.List;
import java.util.Date;
public class Hoadon {
    private String MaHD;
    private String MaNV;
    private String MaKH;
    private Date Ngay;
    private int Tongtien;  
    private Khachhang khachhang;
    private List<Chitiethoadon> Danhsachchitiet;
    public Hoadon(){
        MaHD = "";
        MaNV = "";
        MaKH = "";
        Ngay = null;
        Tongtien = 0;
        khachhang = null;
    }
    public Hoadon(String MaHD, String MaNV, String MaKH, Date Ngay, int Tongtien, Khachhang khachhang){
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.Ngay = Ngay;
        this.Tongtien = Tongtien;
        this.khachhang = khachhang;
    }
}
 {
    
}
