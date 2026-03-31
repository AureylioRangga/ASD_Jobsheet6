public class SortingMain07 {

    public static void main(String[] args) {
        int a[]= {20, 10, 2, 7, 12};

        Sorting07 dataurut1 = new Sorting07(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubblesort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[]= {30, 20, 2, 8, 14};

        Sorting07 dataurut2 = new Sorting07(b, b.length);

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASD)");
        dataurut2.tampil();
    }
}
