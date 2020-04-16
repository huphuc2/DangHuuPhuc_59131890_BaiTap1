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
public abstract class CaNhan {
    public String hoten,diaChi,sdt;
    public int tuoi;
    CaNhan(String hoten,int tuoi,String diaChi,String sdt){
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getHoTen(){
        return hoten;
    }
    public String setHoTen(String hoten){
        this.hoten = hoten;
        return hoten;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public String setDiaChi(String diaChi){
        this.diaChi = diaChi;
        return diaChi;
    }
    public String HienThiTT(){
        return "Ho va Ten: "+hoten+
                "Tuoi: "+tuoi+
                "Dia Chi: "+diaChi+
                "So dien thoai: "+sdt;                
    }
}
