/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author potte
 */
public class BaiTap1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context ctxt=new context();
        ctxt.setTinhtoan(new Cong());
        System.out.println("Kết quả của phép tính: 75 + 12 " + ctxt.tinh(75, 12));
        ctxt.setTinhtoan(new Tru());
        System.out.println("Kết quả của phép tính: 54 - 78 = " + ctxt.tinh(54, 78));
    }
    
}