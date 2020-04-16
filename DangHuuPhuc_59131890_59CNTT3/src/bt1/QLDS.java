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
public class QLDS implements IQuanLyDS{
    ArrayList<CaNhan> lop1 = new ArrayList();
    @Override
    public int them(CaNhan p) {
        lop1.add(p);       
        return 0;
    }

    @Override
    public int xoa(String ten) { 
        lop1.remove(ten);            
        return 0;
    }

    @Override
    public void inDS() {  
        for(int i=0;i<lop1.size();i++){
            System.out.print(lop1.get(i).HienThiTT());
        }
    }
    
}
