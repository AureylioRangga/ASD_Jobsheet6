import java.util.Scanner;

public class DosenMain07 {

    public static void main(String[] args) {

        Scanner sc   = new Scanner(System.in);
        DataDosen07 dd = new DataDosen07();
        int pilihan;

        do {
            System.out.println();
            System.out.println("=== Menu Data Dosen ===");
            System.out.println("1. Tambah Dosen");
            System.out.println("2. Tampil Dosen");
            System.out.println("3. Sort ASC - Bubble Sort");
            System.out.println("4. Sort DSC - Selection Sort");
            System.out.println("5. Sort ASC - Insertion Sort");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Kode  : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("JK (L/P): ");
                    String jkStr = sc.nextLine();
                    boolean jk = jkStr.equalsIgnoreCase("L");
                    System.out.print("Usia  : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    TugasDosen07 dsn = new TugasDosen07(kode, nama, jk, usia);
                    dd.tambah(dsn);
                    System.out.println("Data tersimpan.");
                    break;

                case 2:
                    dd.tampil();
                    break;

                case 3:
                    dd.sortingASC();
                    dd.tampil();
                    break;

                case 4:
                    dd.sortingDSC();
                    dd.tampil();
                    break;

                case 5:
                    dd.insertionSort();
                    dd.tampil();
                    break;

                case 0:
                    System.out.println("Keluar.");
                    break;

                default:
                    System.out.println("Pilihan salah.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}