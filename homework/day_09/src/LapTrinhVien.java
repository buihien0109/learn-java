public class LapTrinhVien extends NhanVien{
    private int soGioOvertime;

    public LapTrinhVien(int maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, int luongCoBan, int soGioOvertime) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.soGioOvertime = soGioOvertime;
    }

    public int tinhLuong() {
        return getLuongCoBan() + soGioOvertime * 200000;
    }

    public int getSoGioOvertime() {
        return soGioOvertime;
    }

    public void setSoGioOvertime(int soGioOvertime) {
        this.soGioOvertime = soGioOvertime;
    }

    @Override
    public String toString() {
        return super.toString() + ", soGioOvertime=" + soGioOvertime + ", LUONG=" + tinhLuong();
    }
}
