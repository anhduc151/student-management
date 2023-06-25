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
public  abstract class SinhVien {
     private String maSV, hoTen;
    private boolean gioiTinh;
    private int namSinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, boolean gioiTinh, int namSinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return  maSV + "  " + hoTen + "  " + gioiTinh + "  " + namSinh + " " +
                getDiemTB() + " " + getHocLuc();
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }          
    
    public abstract double getDiemTB();
    public String getHocLuc(){
        if(getDiemTB() < 3.5) return "Kem";
        if(getDiemTB() < 5) return "Yeu";
        if(getDiemTB()< 6.5) return "Trung Binh";
        if(getDiemTB() < 8) return "Kha";
        if(getDiemTB() < 9) return "Gioi";
        return "Xuat Sac";
    }
    
    
}
