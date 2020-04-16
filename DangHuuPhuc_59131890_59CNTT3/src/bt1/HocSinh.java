/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author huuph
 */
public class HocSinh extends CaNhan{
    private String lop,nangKhieu;
    HocSinh(String hoten, int tuoi, String DiaChi, String sdt,String lop,String nangKhieu) {
        super(hoten,tuoi,DiaChi,sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    @Override
    public String HienThiTT(){
        return "Ho va Ten: "+hoten+"\n"+
                "Tuoi: "+tuoi+"\n"+
                "Dia Chi: "+diaChi+"\n"+
                "So dien thoai: "+sdt+"\n"+
                "Lớp: "+lop+"\n"+
                "Nang Khieu: "+nangKhieu+"\n";
    }
    
}
