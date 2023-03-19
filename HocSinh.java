/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_2;

/**
 *
 * @author Admin
 */
public class HocSinh {
    private String HoTen;
    private String Lop;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    public void diemTrungBinh(){
        
    }

    public HocSinh() {
    }

    public HocSinh(String HoTen, String Lop, float diemToan, float diemLy, float diemHoa) {
        this.HoTen = HoTen;
        this.Lop = Lop;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getLop() {
        return Lop;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    
    }
