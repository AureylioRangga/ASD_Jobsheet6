import java.util.Scanner;

public class MahasiswaBerprestasi07 {

    Mahasiswa07[] listMhs = new Mahasiswa07[5];
    int idx;

    // Konstruktor default
    void tambah(Mahasiswa07 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa07 m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------");
        }
    }
    
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa07 tmp = listMhs[j];
                    listMhs[j]     = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }


    // Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa07 tmp      = listMhs[idxMin];
            listMhs[idxMin]    = listMhs[i];
            listMhs[i]         = tmp;
        }
    }


    // Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa07 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    // Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
    void insertionSortDesc() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa07 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) { 
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    void tambahDariKeyboard() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listMhs.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // konsumsi newline
            listMhs[i] = new Mahasiswa07(nim, nama, kelas, ipk);
            System.out.println("------------------------- -");
        }
        sc.close();
    }
}