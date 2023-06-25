/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;

/**
 *
 * @author OS
 */
public class SinhVienKinhTe extends SinhVien{
     private double nlkt, mkt;

    public SinhVienKinhTe() {
    }

    public SinhVienKinhTe(String maSV, String hoTen, int namSinh, boolean gioiTinh, double nlkt, double mkt) {
        super(maSV, hoTen, gioiTinh, namSinh);
        this.nlkt = nlkt;
        this.mkt = mkt;
    }

    public double getNlkt() {
        return nlkt;
    }
    public void setNlkt(double nlkt) {
        this.nlkt = nlkt;
    }
    public double getMkt() {
        return mkt;
    }
    public void setMkt(double mkt) {
        this.mkt = mkt;
    }

    @Override
    public double getDiemTB() {
        return (nlkt*2 + mkt) /3;
    }
    
    
}
