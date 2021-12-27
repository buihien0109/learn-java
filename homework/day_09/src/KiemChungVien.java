public class KiemChungVien extends NhanVien{
    private int soLoiPhatHien;

    public KiemChungVien(int maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, int luongCoBan, int soLoiPhatHien) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public int tinhLuong() {
        return getLuongCoBan() + soLoiPhatHien * 50000;
    }

    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }

    public void setSoLoiPhatHien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }

    @Override
    public String toString() {
        return super.toString() + ", soLoiPhatHien=" + soLoiPhatHien + ", LUONG=" + tinhLuong();
    }
}
