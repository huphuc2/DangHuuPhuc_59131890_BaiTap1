/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;
import java.util.ArrayList;
/**
 *
 * @author huuph
 */
public class LopHoc {
    ArrayList<HocSinh> hs1 = new ArrayList();
    ArrayList<GiaoVien> gv1 = new ArrayList();
    public int themHocSinh(HocSinh hs){
        hs1.add(hs);
        return 0;
        
    }
    public int themGVGD(GiaoVien gv){
        gv1.add(gv);
        return 0;
    }
    public int inDSHS(){
        System.out.println("Danh Sach HS: ");
        for(int i=0;i<hs1.size();i++){
            System.out.println(hs1.get(i).HienThiTT());
        }
        return 0;
        
    }
    public int inDSGVGD(){
        System.out.println("Danh Sach GV: ");
        for(int i=0;i<gv1.size();i++){
            System.out.println(gv1.get(i).HienThiTT());
        }
        return 0;
        
    }
}
