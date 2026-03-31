public class DataDosen07 {
    TugasDosen07[] dataDosen = new TugasDosen07[10];
    int idx;

    void tambah(TugasDosen07 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Kapasitas penuh, maksimal 10 dosen.");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak ada data.");
            return;
        }
        System.out.println("========= Daftar Dosen =========");
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("--------------------------");
        }
    }

    void sortingASC() {
        for (int i = idx - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    TugasDosen07 temp    = dataDosen[j];
                    dataDosen[j]     = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Urut ASC selesai (Bubble Sort).");
    }

    void sortingDSC() {
        for (int i = idx - 1; i > 0; i--) {
            int idxMin = 0;
            for (int j = 1; j <= i; j++) {
                if (dataDosen[j].usia < dataDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            TugasDosen07 temp    = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i]      = temp;
        }
        System.out.println("Urut DSC selesai (Selection Sort).");
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            TugasDosen07 temp = dataDosen[i];

            int lo  = 0;
            int hi  = i - 1;
            int pos = i;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (dataDosen[mid].usia > temp.usia) {
                    pos = mid;
                    hi  = mid - 1;
                } else {
                    lo  = mid + 1;
                }
            }

            for (int j = i; j > pos; j--) {
                dataDosen[j] = dataDosen[j - 1];
            }
            dataDosen[pos] = temp;
        }
        System.out.println("Urut ASC selesai (Insertion Sort).");
    }
}