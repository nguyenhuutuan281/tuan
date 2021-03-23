package OOP.Bai5;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ngay {
    public static void main(String[] args) {
/*        LocalDate d1 = LocalDate.now();

        LocalDate dateFormat = LocalDate.parse("20-03-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy"));*/
        LocalDate localDate1
                = LocalDate.of(2020,8,22);
        String ngay = String.valueOf(localDate1.getDayOfMonth());
        String thang = String.valueOf(localDate1.getMonth().getValue());
        String nam = String.valueOf(localDate1.getYear());
/*        String ngaythangnam = String.format("%s/%s/%s",ngay,thang,nam);
        System.out.println(ngaythangnam);*/
        String formattedDate = localDate1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(formattedDate);

    }
}
