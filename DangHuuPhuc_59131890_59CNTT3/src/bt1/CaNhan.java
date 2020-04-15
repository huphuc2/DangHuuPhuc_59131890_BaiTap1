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

    private String hoten,diaChi,sdt;
    int tuoi;
    CaNhan(String hoten,int tuoi,String diaChi,String sdt){
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    public abstract String HienThiTT();
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
}
