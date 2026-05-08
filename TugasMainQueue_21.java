import java.util.Scanner;

public class TugasMainQueue_21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QueueLinkedList_21 antrian = new QueueLinkedList_21();

        int pilih;

        do {

            System.out.println("\n=== MENU ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Belakang");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Jumlah Mahasiswa Mengantri");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa_21 mhs =
                            new Mahasiswa_21(nim, nama, kelas, ipk);

                    antrian.enqueue(mhs);

                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    antrian.peekFront();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:

                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }

                    break;

                case 7:

                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh");
                    } else {
                        System.out.println("Antrian tidak penuh");
                    }

                    break;

                case 8:
                    antrian.clear();
                    break;

                case 9:
                    System.out.println("Jumlah mahasiswa mengantri : "
                            + antrian.size);
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);
    }
}
