package OOP.Bai6;

import java.util.Date;

public class Hoadon {
    private int mahoadon, maphong, dongia, sogiothue,songaythue;
    private Date ngayhoadon;

    public Hoadon() {
    }

    public Hoadon(int mahoadon, int maphong, int dongia, int sogiothue, int songaythue, Date ngayhoadon) {
        this.mahoadon = mahoadon;
        this.maphong = maphong;
        this.dongia = dongia;
        this.sogiothue = sogiothue;
        this.songaythue = songaythue;
        this.ngayhoadon = ngayhoadon;
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public int getMaphong() {
        return maphong;
    }

    public void setMaphong(int maphong) {
        this.maphong = maphong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSogiothue() {
        return sogiothue;
    }

    public void setSogiothue(int sogiothue) {
        this.sogiothue = sogiothue;
    }

    public int getSongaythue() {
        return songaythue;
    }

    public void setSongaythue(int songaythue) {
        this.songaythue = songaythue;
    }

    public Date getNgayhoadon() {
        return ngayhoadon;
    }

    public void setNgayhoadon(Date ngayhoadon) {
        this.ngayhoadon = ngayhoadon;
    }
}
