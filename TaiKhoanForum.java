import java.util.*;

public class TaiKhoanForum {
    private String tenDangNhap;
    private String password;
    private String ngayTao;
    private int soBaiDaDang;

    public TaiKhoanForum(String tenDangNhap, String password, String ngayTao, int soBaiDaDang){
        this.tenDangNhap = tenDangNhap;
        this.password = password;
        this.ngayTao = ngayTao;
        this.soBaiDaDang = soBaiDaDang;
    }

    public boolean doiMatKhau(String old_pw, String new_pw){
        if(old_pw == this.password){
            this.password = new_pw;
            return true;
        }else{
            return false;
        }
    }

    public String loaiThanhVien(){
        int n = this.soBaiDaDang;
        if(n >= 50){
            return "Thanh vien VIP";
        }else if(50 > n && n >= 30){
            return "Thanh vien nang dong";
        }else if(30 > n && n >=5){
            return "Thanh vien co dong gop";
        }else{
            return "Thanh vien moi";
        }
    }

    public String toString(){
        String loaiThanhVien = loaiThanhVien();
        return "(" + this.tenDangNhap + ", " + this.ngayTao + ", " + loaiThanhVien + ")";
    }

    public static void main (String args[]){
        TaiKhoanForum memberA = new TaiKhoanForum("memberA", "123456", "2/8/2024", 6);
        // PT1
        boolean result = memberA.doiMatKhau("123456", "111333");
        System.out.println("Change password result: " + result);
        // PT2
        String loaiThanhVienMemberA = memberA.loaiThanhVien();
        System.out.println(loaiThanhVienMemberA);
        // PT3
        String infoMemberA = memberA.toString();
        System.out.println(infoMemberA);
    }
}