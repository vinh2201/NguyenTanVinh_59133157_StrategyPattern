/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author potte
 */
public class BaiTap3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat ns = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien sv1 = new SinhVien("Nguyễn Tấn Vĩnh", ns.parse("15/04/1999"), 5.8f);
        SinhVien sv2 = new SinhVien("Phạm Lê Anh Thảo", ns.parse("05/12/1999"), 7.5f);
        SinhVien sv3 = new SinhVien("Đỗ Thành Trung", ns.parse("21/09/1999"), 7.2f);
        SinhVien sv4 = new SinhVien("Nguyễn Trần Quang", ns.parse("11/05/1999"), 6.8f);
        SinhVien sv5 = new SinhVien("Đặng Ngọc Thu Thảo", ns.parse("18/07/1999"), 7.5f);
        
        QLSV dssv = new QLSV();
        dssv.themSV(sv1);
        dssv.themSV(sv2);
        dssv.themSV(sv3);
        dssv.themSV(sv4);
        dssv.themSV(sv5);
        
        dssv.setSoSanh(new SoSanhTheoTen());
        dssv.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo tên: " + "\n");
        dssv.inDS();
        
        dssv.setSoSanh(new SoSanhTheoDiem());
        dssv.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo điểm: " + "\n");
        dssv.inDS();
    }
    
}
