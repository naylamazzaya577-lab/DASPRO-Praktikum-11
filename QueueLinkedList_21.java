public class QueueLinkedList_21 {
    TNodeMahasiswa_21 front;
    TNodeMahasiswa_21 rear;
    int size;
public QueueLinkedList_21() {
        front = rear = null;
        size = 0;
    }
public boolean isEmpty() {
        return front == null;
    }
public void enqueue(Mahasiswa_21 data) {

    TNodeMahasiswa_21 newNode = new TNodeMahasiswa_21(data, null);

    if (isEmpty()) {
        front = rear = newNode;
    } else {
        rear.next = newNode;
        rear = newNode;
    }

    size++;
    System.out.println(data.nama + " berhasil masuk antrian");
}
public void dequeue() {

    if (isEmpty()) {
        System.out.println("Antrian kosong");
    } else {
        System.out.println("Memanggil antrian:");
        front.data.tampilInformasi();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }
}
public void print() {

    if (isEmpty()) {
        System.out.println("Antrian kosong");
    } else {

        TNodeMahasiswa_21 temp = front;

        System.out.println("Isi Antrian:");

        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
        }

        System.out.println("Jumlah Antrian : " + size);
    }
}
public void peekFront() {
    if (!isEmpty()) {
        System.out.println("Antrian terdepan:");
        front.data.tampilInformasi();
    } else {
        System.out.println("Antrian kosong");
    }
}
public void peekRear() {
    if (!isEmpty()) {
        System.out.println("Antrian paling belakang:");
        rear.data.tampilInformasi();
    } else {
        System.out.println("Antrian kosong");
    }
}
public boolean isFull() {
    return false;
}
public void clear() {

    front = rear = null;
    size = 0;

    System.out.println("Antrian berhasil dikosongkan");
}
}

