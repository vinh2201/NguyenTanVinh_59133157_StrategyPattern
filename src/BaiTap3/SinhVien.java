/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.Date;

/**
 *
 * @author potte
 */
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB; 
    
    public SinhVien() {
    }
    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {  
        
        
        this.hoTen = hoTen;       
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }
    
    public String gethoTen() {
        return hoTen;
    }
    
    public Date getngaySinh() {
        return ngaySinh;
    }
    
    public float getdiemTB() {
        return diemTB;
    }
    
    public String inTT() {
        return "Họ và tên sinh viên: " + hoTen + "\n" + "Ngày sinh: " + ngaySinh + "\n" + "Điểm trung bình: " + diemTB;
    }
}
