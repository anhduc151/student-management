/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;

/**
 *
 * @author DEll
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class MangSinhVien {
    ArrayList<SinhVien> a = new ArrayList<>();
    public void docFile(String tenFile) {
        try {
            File f = new File("‪E:\\file.txt");
            if (f.exists()) {
                Scanner read = new Scanner(f);
                System.out.println("Doc thanh cong");
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ht = "";
                    int ns;
                    boolean gt;
                    double m1, m2, m3;
                    ma = line.next();
                    while (!line.hasNextBoolean()) {
                        ht = ht + line.next() + " ";
                    }
                    gt = line.nextBoolean();
                    ns = line.nextInt();
                    m1 = line.nextDouble();
                    m2 = line.nextDouble();
                    if (line.hasNext()) {
                        m3 = line.nextDouble();
                        a.add(new SinhVienCNTT(ma, ht, ns, gt, m1, m2, m3));
                    } else {
                        a.add(new SinhVienKinhTe(ma, ht, ns, gt, m1, m2));
                    }
                }
            } else {
                System.out.println("File khong ton tai");
            }
        } catch (Exception e) {
        }
    }
public void xuat(String nd) {
        System.out.println(nd);
        for (SinhVien sv : a) {
            System.out.println(sv);
        }
        System.out.println("");
    }
  public void sapXepGiamTheoDiem(){
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                double diem = o1.getDiemTB() - o2.getDiemTB();
                if(diem >= 0) return -1;
                return 1;
            }
        });
    }
public void output() {
        xuat("Danh sach doc tu file");
    sapXepGiamTheoDiem();
     xuat("Sau khi sap xep ")  ;    
    }

public static void main(String[] args) {
         MangSinhVien a = new MangSinhVien();
        a.docFile("‪E:\\file.txt");
        a.output();
    }
}


