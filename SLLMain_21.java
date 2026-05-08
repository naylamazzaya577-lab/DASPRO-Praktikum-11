public class SLLMain_21 {
    public static void main(String[] args) {

        SingleLinkedList_21 sll = new SingleLinkedList_21();

        Mahasiswa_21 mhs1 = new Mahasiswa_21("22212202", "Cintia", "3C", 3.5);
        Mahasiswa_21 mhs2 = new Mahasiswa_21("23212201", "Bimo", "2B", 3.8);
        Mahasiswa_21 mhs3 = new Mahasiswa_21("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa_21 mhs4 = new Mahasiswa_21("21212203", "Dirga", "4D", 3.6);
        System.out.println("Index data Bimo : " + sll.indexOf("23212201"));

        sll.removeAfter("Alvaro");
        sll.print();
        sll.print();
        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);

        sll.print();
    }
}