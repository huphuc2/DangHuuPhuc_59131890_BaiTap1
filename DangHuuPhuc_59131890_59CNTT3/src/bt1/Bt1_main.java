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
public class Bt1_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLDS ql = new QLDS();
        LopHoc lh = new LopHoc();
        HocSinh hs1 = new HocSinh("Nguyen Van A",13,"Nha Trang","098736192","C1","Ve");
        HocSinh hs2 = new HocSinh("Nguyen Van B",13,"Nha Trang","098751123","C1","Boi Loi");
        HocSinh hs3 = new HocSinh("Nguyen Van C",14,"Nha Trang","098451245","C1","Co Vua");
        GiaoVien gv1 = new GiaoVien("Ha Van A",35,"Ho Chi Minh","09381727","Ve","My Thuat");
        GiaoVien gv2 = new GiaoVien("Ha Van B",26,"Ninh Hoa","093831147","Toan","Toan");
        GiaoVien gv3 = new GiaoVien("Ha Van C",32,"Phu Yen","0946112445","Van","Van");
        ql.them(hs1);
        ql.them(hs2);
        ql.them(hs3);
        ql.them(gv1);
        ql.them(gv2);
        ql.them(gv3);
        ql.xoa("gv2");
        ql.xoa("hs1");
        ql.inDS();
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        lh.themHocSinh(hs3);
        lh.themGVGD(gv1);
        lh.themGVGD(gv2);
        lh.themGVGD(gv3);
        lh.inDSHS();
        lh.inDSGVGD();
        
    }
    
}
