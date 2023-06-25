
package qlsv;


public class SinhVienCNTT extends SinhVien {
    private double html, css, java;

    public SinhVienCNTT() {
    }

    public SinhVienCNTT(String maSV, String hoTen, int namSinh, boolean gioiTinh, double css, double hmtl, double java) {
        super(maSV, hoTen, gioiTinh, namSinh);
        this.css = css;
        this.html = hmtl;
        this.java = java;
    }

    public double getHtml() {
        return html;
    }
    public void setHtml(double html) {
        this.html = html;
    }
    public double getCss() {
        return css;
    }
    public void setCss(double css) {
        this.css = css;
    }
    public double getJava() {
        return java;
    }
    public void setJava(double java) {
        this.java = java;
    }
    
    
    
    @Override
    public double getDiemTB() {
        return (java*2+css+html)/4;
    }
}
