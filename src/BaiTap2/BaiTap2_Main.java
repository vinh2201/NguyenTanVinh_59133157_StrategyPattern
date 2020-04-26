/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author potte
 */
public class BaiTap2_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hangHoa1 = new HangHoa("Bánh kẹo", 46000, "Bánh Richeese Nabati");
        HangHoa hangHoa2 = new HangHoa("Văn phòng phẩm", 20000, "Vở 200 trang Campus");
        
        GioHang gh1 = new GioHang();
        gh1.themHH(hangHoa1);
        gh1.themHH(hangHoa2);
        gh1.setHinhThucTT(new ThanhToanCOD());
        gh1.inDSHH();
        System.out.println("Số tiền mà khách phải trả theo hình thức thanh toán COD: "+gh1.getThanhToan(gh1.getTienHang())+"\n");
        
        GioHang gh2 = new GioHang();
        gh2.themHH(hangHoa1);
        gh2.themHH(hangHoa2);
        gh2.setHinhThucTT(new ThanhToanOnline());
        gh2.inDSHH();
        System.out.println("Số tiền mà khách phải trả theo hình thức thanh toán online: "+gh2.getThanhToan(gh2.getTienHang())+"\n");
    
    }
    
}
