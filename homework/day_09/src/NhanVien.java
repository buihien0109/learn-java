public class NhanVien {
    private int maNhanVien;
    private String hoTen;
    private int tuoi;
    private String soDienThoai;
    private String email;
    private int luongCoBan;

    public NhanVien(int maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, int luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.luongCoBan = luongCoBan;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    @Override
    public String toString() {
        return "maNhanVien=" + maNhanVien +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", luongCoBan=" + luongCoBan;
    }
}
