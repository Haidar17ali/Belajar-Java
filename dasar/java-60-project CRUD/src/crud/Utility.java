package crud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {

    static long ambilEntryPertahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while (data != null){
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis =penulis.replaceAll("\\s+","");

            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                entry = dataScanner.nextInt();
            }
            data = bufferInput.readLine();
        }
        return entry;
    }

    static boolean cekBukuDatabase(String keywords[],boolean isDisplay) throws IOException{

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput =new BufferedReader(fileInput);

        String data =bufferInput.readLine();
        boolean isExist = false;
        int jmlData = 1;
        while (data != null){
            //cek keywords didalam baris
            isExist = true;

            for (String keyword: keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());

            }

            //jika keywords cocok tampilkan
            if (isExist){
                if(isDisplay) {
                    StringTokenizer stringToken = new StringTokenizer(data, ",");
                    stringToken.nextToken();
                    System.out.printf("| %2d ", jmlData++);
                    System.out.printf("|\t%4s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s  ", stringToken.nextToken());
                    System.out.printf("|\t%s  ", stringToken.nextToken());
                    System.out.println("\n");
                }else {
                    break;
                }
            }
            data = bufferInput.readLine();
        }
        return isExist;
    }

    protected static String ambilTahun()throws IOException{
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahun = terminalInput.nextLine();

        while (!tahunValid) {
            try {
                Year.parse(tahun);
                tahunValid = true;
            } catch (Exception e) {
                System.err.println("Format tahun yang anda masukkan salah, Format tahun = (YYYY)");
                System.out.print("Silahkan masukkan tahun terbit lagi : ");
                tahunValid = false;
                tahun = terminalInput.nextLine();
            }
        }
        return tahun;
    }

    public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.print("\033\143");
            }
        }catch (Exception e){
            System.err.println("tidak bisa clear screen!");
        }
    }

    public static boolean getYOrN(String  message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n\n"+ message +" (y/n)? ");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("pilihan anda bukan y atau n");
            System.out.print("\n\n"+ message +"(y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }
}
