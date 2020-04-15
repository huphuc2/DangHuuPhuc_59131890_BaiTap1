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
public abstract class GiaoVien extends CaNhan {
    private String monDay,toBoMon;
    GiaoVien(String hoten, int tuoi, String DiaChi, String sdt,String monDay,String toBoMon) {
        super(hoten,tuoi,DiaChi,sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay(){
        return monDay;
    }
    public String setmonDay(String monDay){
        this.monDay = monDay;
        return monDay;
    }
    public String gettoBomon(){
        return toBoMon;
    }
    public String settoBoMon(String toBoMon){
        this.toBoMon = toBoMon;
        return toBoMon;
    }
    @Override
    public String HienThiTT() {
        return "Mon Day: "+monDay+"\n"+
               "To Bo Mon: "+toBoMon+"\n";
               
    }
}
