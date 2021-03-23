package OOP.Bai5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.System.*;

public class Hangthucpham {
    private String mahang;
    private String tenhang,Ghichu;
    private double donGia;
    private LocalDate nsx, hsd;
    private String ngay, thang, nam;

    public Hangthucpham(String mahang, String tenhang, double donGia, LocalDate nsx, LocalDate hsd) {
        if (mahang.isEmpty() == false) {
            this.mahang = mahang;
        }
        if (donGia >= 0) this.donGia = donGia;
        if (tenhang.isEmpty() == true) {
            this.tenhang = "xxx";
        } else this.tenhang = tenhang;

        ngay = String.valueOf(nsx.getDayOfMonth());
        thang = String.valueOf(nsx.getMonth());
        nam = String.valueOf(nsx.getYear());
        this.nsx = nsx;

        ngay = String.valueOf(hsd.getDayOfMonth());
        thang = String.valueOf(hsd.getMonth());
        nam = String.valueOf(hsd.getYear());
        if (hsd.isAfter(nsx)) {
            this.hsd = hsd;
        } else if (hsd == null) {
            this.hsd = nsx;
        }
    }

    public Hangthucpham() {
    }

    public String getMahang() {
        return mahang;
    }

    // ko cho phep sua mang hang
/*    public void setMahang(String mahang) {
        this.mahang = mahang;
    }*/


    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        if (tenhang.isEmpty() == true) {
            this.tenhang = "xxx";
        } else this.tenhang = tenhang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) this.donGia = donGia;
    }

    public LocalDate getNsx() {
        return nsx;
    }

    public void setNsx(LocalDate nsx) {
        this.nsx = nsx;
    }

    public LocalDate getHsd() {
        return hsd;
    }

    public void setHsd(LocalDate hsd) {
        this.hsd = hsd;
    }

    public String getGhichu() {
        if (LocalDate.now().isAfter(hsd)) {
            return "hang het hang";
        } else {
            return "";
        }
    }



    @Override
    public String toString() {
        String st = String.format("%-8s %-8s %20d %-15d %-15d %-15s",mahang,tenhang,donGia,nsx,hsd,getGhichu());
        return st;
    }

/*    @Override
    public String toString() {
        return "Hangthucpham{" +
                "mahang='" + mahang + '\'' +
                ", tenhang='" + tenhang + '\'' +
                ", Ghichu='" + getGhichu() + '\'' +
                ", donGia=" + donGia +
                ", nsx=" + nsx +
                ", hsd=" + hsd +
                ", ngay='" + ngay + '\'' +
                ", thang='" + thang + '\'' +
                ", nam='" + nam + '\'' +
                '}';
    }*/
    /*    public String Ngay(){
            LocalDate localDate1
                    = LocalDate.of( 2020,8,22);

            String ngay = String.valueOf(localDate1.getDayOfMonth());
            String thang = String.valueOf(localDate1.getMonth().getValue());
            String nam = String.valueOf(localDate1.getYear());
            String ngaythangnam = String.format("%s/%s/%s",ngay,thang,nam);
            System.out.println(ngaythangnam);
            return ngaythangnam;
        }*/


}
