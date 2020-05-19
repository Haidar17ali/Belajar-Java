package com.tutorial;

import java.lang.StringBuilder;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {

        String nama = "muhaimin";
        int umur = 24;

        System.out.println("nama saya adalah " + nama + ", umur saya adalah "+ umur);

        //cara lainnya dengan format string
        System.out.printf("Nama saya adalah %s, umur saya adalah %d\n",nama,umur);
        //confersion    : f = float pointing, c= char, d = integer, s = string, b = bool

        //struktur format : %[argumen_index$][flags][width][.precision]conversion

        //[argumen_index$]
        System.out.println("\n[argumen_index$]");

        //muhaimin, wahai muhaimin, kemana saja dikau muhaimin?
        System.out.printf("%1$s, wahai %1$s kemana saja dikau %1$s?\n",nama);

        System.out.printf("\numur %1$s berapa?\n%1$s menjawab : umur saya %2$d,\nwah masih umur %2$d",nama,umur);

        //[flags]
        System.out.printf("\n[Flags]\n");
        int angka = 5;
        int angka2 = 8;
        int hasil = angka - angka2;
        System.out.printf("%d - %d = %+d",angka,angka2,hasil);

        //[width]
        System.out.printf("\n[Width]\n");
        int angka3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",angka3);
        System.out.printf("%5d\n",angka3);
        System.out.printf("%-10d\n",angka3);//kalo dikasih - maka akan menjadi rata kiri
        System.out.printf("%+5d\n",angka3); //flags akan mengambil slot di dalam format
        System.out.printf("%+-6d\n",angka3);//flags bisa digabungkan
        System.out.printf("%10d\n",angka3);
        System.out.printf("% 10d\n",angka3);
        System.out.printf("%010d\n",angka3);//flags='0', kita tambahkan leading di depan
        System.out.printf("%+010d\n",angka3);
        int angka4 = 1000000000;
        System.out.printf("%-,15d\n",angka4);//flags = ',' menambahkan delimeter per seribu

        System.out.println("\nFLOATING POINT");
        float f1 = 1.55f;
        System.out.printf("%f\n",f1);
        System.out.printf("%+9f\n",f1);//floating pnt akan mengambil width 6 decimal

        //[.precision]
        System.out.printf("\n[.precision]\n");
        float f2 = 1.4354f;
        System.out.printf("%.1f\n",f2);
        System.out.printf("%.2f\n",f2);
        System.out.printf("%8.2f\n",f2);//gabung dg width
        System.out.printf("%+08.2f\n",f2);//gabung dg width dan flags

        //contoh
        String nama2 = "kosim";
        float IPK = 3.788758954f;
        System.out.printf("\n IPK %1$s berapa? \nIPK %1$s dapet %2$+5.2f\n",nama2,IPK);
        //kesimpulan
        //save format ini dlm var str
        String infoBiasa = "nama : "+ nama2 +" IPK : " + IPK;
        System.out.println("biasa -> "+infoBiasa);

        String infoFormat = String.format("Nama : %1$s IPK : %2$+5.2f",nama2,IPK);
        System.out.println("String -> "+infoFormat);

        //save format ini ke dalam strbuilder
        StringBuilder builderInfo = new StringBuilder();
        Formatter formatBuilder = new Formatter(builderInfo);
        formatBuilder.format("Nama : %1$s IPK : %2$+5.2f",nama2,IPK);
        System.out.println("String Builder -> "+formatBuilder);








    }
}
