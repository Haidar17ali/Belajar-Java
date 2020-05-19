package crud;

//import java library
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

//import crud library

public class Operasi {
    public static void editData()throws IOException {
        //ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

//        membuatdatabase sementara
        File tempDb = new File("tmdb");
        FileWriter fileOutput = new FileWriter(tempDb);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        //tampilkan data
        System.out.println("List Data");
        tampilkanData();

        //ambil input user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomer data yang akan diupdate: ");
        int updateNo= terminalInput.nextInt();

        //tampilkan data yang ingin dihapus
        String data = bufferInput.readLine();
        int entrycount = 0;
        while (data != null){
            entrycount++;

            StringTokenizer st = new StringTokenizer(data,",");

            //tampilkan entrycount == updateNo
            if (entrycount==updateNo){
                System.out.println("\nData yang akan update adalah:");
                System.out.println("-----------------------------");
                System.out.println("Referensi : " + st.nextToken());
                System.out.println("Tahun     : " + st.nextToken());
                System.out.println("Penulis   : " + st.nextToken());
                System.out.println("Penerbit  : " + st.nextToken());
                System.out.println("Judul     : " + st.nextToken());

                //update data

                //mengambil input user
                String fieldData[]= {"tahun","penulis","penerbit","judul"};
                String temp[] = new String[4];

                //refresh token
                st = new StringTokenizer(data,",");
                String originalData = st.nextToken();
                for (int i =0; i<fieldData.length; i++) {
                    boolean isUpdate = Utility.getYOrN("Apakah anda ingin merubah " +fieldData[i] +"?");

                    originalData = st.nextToken();
                    if (isUpdate){

                        if (fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("Masukkan tahun terbit, Format tahun = (YYYY): ");
                            temp[i] = Utility.ambilTahun();
                        }else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("Masukkan " + fieldData[i] +" yang baru : ");
                            temp[i]= terminalInput.nextLine();
                        }
                    }else {
                        temp[i] = originalData;
                    }
                }
                //tampilkan data baru ke layar
                st = new StringTokenizer(data,",");
                st.nextToken();
                System.out.println("\nData baru yang akan diupdate adalah:");
                System.out.println("-------------------------------------");
                System.out.println("Tahun     : " + st.nextToken() +" --> "+ temp[0]);
                System.out.println("Penulis   : " + st.nextToken() +" --> "+ temp[1]);
                System.out.println("Penerbit  : " + st.nextToken() +" --> "+ temp[2]);
                System.out.println("Judul     : " + st.nextToken() +" --> "+ temp[3]);

                boolean isUpdate = Utility.getYOrN("Apakah anda yakin ingin mengupdate data ini?");

                if (isUpdate){

                    //cek data baru
                    boolean isExist = Utility.cekBukuDatabase(temp,false);
                    if (isExist){
                        System.err.println("Data buku sudah ada!");
                    }else {
                        //format data baru kedatabase
                        String tahun= temp[0];
                        String penulis = temp[1];
                        String penerbit = temp[2];
                        String judul = temp[3];

                        //kita bikin pk
                        long noEntry = Utility.ambilEntryPertahun(penulis,tahun) + 1;
                        String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
                        String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+noEntry;

                        //tulis ke data base
                        bufferOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+","+judul);
                    }
                }else {
                    //copy data
                    bufferOutput.write(data);
                }
            }else {
                //copy data
                bufferOutput.write(data);
            }
            bufferOutput.newLine();

            data = bufferInput.readLine();
        }
        //tulis data ke tmdb
        bufferOutput.flush();
        //hapus data original
        database.delete();
        //rename tm ke database
        tempDb.renameTo(database);

    }

    public static void hapusData()throws IOException{
        //kita ambil database original

        File database = new File("database.txt");
        FileReader fileinput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileinput);

        //buat database sementara

        File tempDB = new File("tmDb.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        //tampilan data
        System.out.println("List Buku");
        tampilkanData();
        //kita ambil user input data
        Scanner terminaInput=new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang akan di hapus:");
        int hapusNo = terminaInput.nextInt();
        //looping untuk membaca tiap data baris dan skip data yg akan di delete

        int barisData = 0;
        boolean isFound = false;

        String data = bufferInput.readLine();

        while (data != null){
            barisData++;
            boolean isDelete =false;

            StringTokenizer st =new StringTokenizer(data,",");
            //tampilkan data yang ingin dihapus
            if(hapusNo == barisData){
                System.out.println("\nData yang akan anda hapus adalah:");
                System.out.println("----------------------------------");
                System.out.println("Referensi        : " + st.nextToken());
                System.out.println("Tahun            : " + st.nextToken());
                System.out.println("Penulis          : " + st.nextToken());
                System.out.println("Penerbit         : " + st.nextToken());
                System.out.println("Judul            : " + st.nextToken());

                isDelete = Utility.getYOrN("Apakah anda yakin akan menghapus data ini?");
                isFound = true;
            }

            if (isDelete){
                //Skip data dari ori ke sementara
                System.out.println("Data telah dihapus!");
            }else {
                //pindahkan data dari ori ke sementara
                bufferOutput.write(data);
                bufferOutput.newLine();
            }

            data = bufferInput.readLine();
        }
        if (!isFound){
            System.err.println("data tidak ditemukan!");
        }
        //menulis data ke file
        bufferOutput.flush();
        //delete ori database
        database.delete();
        // rename file sementara
        tempDB.renameTo(database);

    }

    public static void tampilkanData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        }catch (Exception e){
            System.err.println("database tidak ditemukan");
            System.err.println("silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        String data = bufferInput.readLine();
        System.out.println("\n| No |\tTahun |\tPenulis               |\tPenerbit              |\tJudul Buku");
        System.out.println("-------------------------------------------------------------------------------");
        int no = 1;
        while (data != null) {
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            stringToken.nextToken();
            System.out.printf("| %2d ", no++);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s  ", stringToken.nextToken());
            System.out.printf("|\t%s  ", stringToken.nextToken());
            System.out.println("\n");
            data = bufferInput.readLine();
        }
        System.out.println("-------------------------------------------------------------------------------");
    }

    public static void cariData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;
        //membaca database ada / tidak
        try {
            File file = new File("database.txt");
        }catch (Exception e){
            System.err.println("database tidak ditemukan");
            System.err.println("silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }
        //ambil keyword user

        Scanner terminalInput =new Scanner(System.in);
        System.out.print("Masukkan keyword....");
        String cariString = terminalInput.nextLine();
        String keywords[] = cariString.split("\\s+");

        //cek keyword database
        System.out.println("\n| No |\tTahun |\tPenulis               |\tPenerbit              |\tJudul Buku");
        System.out.println("-------------------------------------------------------------------------------");
        Utility.cekBukuDatabase(keywords,true);
        System.out.println("-------------------------------------------------------------------------------");

    }

    public static void tambahData() throws IOException{

        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        //mengambil input user
        Scanner terminalInput = new Scanner(System.in);

        String penulis,judul,penerbit,tahun;

        System.out.print("Masukkan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukkan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("Masukkan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukkan tahun terbit, Format tahun = (YYYY): ");
        tahun = Utility.ambilTahun();

        //cek buku di database
        String keywords[] = {tahun+","+ penulis+","+penerbit+","+judul};
        boolean isExist = Utility.cekBukuDatabase(keywords,false);

        //menulis buku di database
        if (!isExist){
            long noEntry = Utility.ambilEntryPertahun(penulis,tahun) + 1;
            String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
            String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+noEntry;
            System.out.println("Data yang akan anda masukkan :");
            System.out.println("----------------------------------");
            System.out.println("Primary key   : " + primaryKey);
            System.out.println("Tahun terbit  : " + tahun);
            System.out.println("Nama penulis  : " + penulis);
            System.out.println("Judul buku    : " + judul);
            System.out.println("Nama penerbit : " + penerbit);

            boolean isTambah = Utility.getYOrN("Apakah anda ingin menambahkan data tersebut?");

            if (isTambah){
                bufferOutput.write(primaryKey+","+tahun+","+penulis+","+penerbit+","+judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }

        }else {
            System.out.println("Buku yang akan anda tambahkan sudah ada di database!, dengan data:");
            System.out.println("\n| No |\tTahun |\tPenulis               |\tPenerbit              |\tJudul Buku");
            System.out.println("-------------------------------------------------------------------------------");
            Utility.cekBukuDatabase(keywords,true);
            System.out.println("-------------------------------------------------------------------------------");
        }

        bufferOutput.close();

    }
}
