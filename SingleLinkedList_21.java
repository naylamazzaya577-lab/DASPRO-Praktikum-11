public class SingleLinkedList_21 {
    Node_21 head;
    Node_21 tail;

public boolean isEmpty() {
        return head == null;
    }
public void print() {
    if (!isEmpty()) {
        Node_21 tmp = head;
        System.out.println("Isi Linked List:");

        while (tmp != null) {
            tmp.data.tampilInformasi();
            tmp = tmp.next;
        }

        System.out.println("");
    } else {
        System.out.println("Linked list kosong");
    }
}
public void addFirst(Mahasiswa_21 input) {
    Node_21 ndInput = new Node_21(input, null);

    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        ndInput.next = head;
        head = ndInput;
    }
}
public void addLast(Mahasiswa_21 input) {
    Node_21 ndInput = new Node_21(input, null);

    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        tail.next = ndInput;
        tail = ndInput;
    }
}
public void insertAfter(String key, Mahasiswa_21 input) {
    Node_21 ndInput = new Node_21(input, null);
    Node_21 temp = head;

    do {
        if (temp.data.nama.equalsIgnoreCase(key)) {
            ndInput.next = temp.next;
            temp.next = ndInput;

            if (ndInput.next == null) {
                tail = ndInput;
            }
            break;
        }
        temp = temp.next;
    } while (temp != null);
}
public void insertAt(int index, Mahasiswa_21 input) {
    if (index < 0) {
        System.out.println("indeks tidak valid");
    } else if (index == 0) {
        addFirst(input);
    } else {
        Node_21 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node_21(input, temp.next);

        if (temp.next.next == null) {
            tail = temp.next;
        }
    }
}
// PRAKTIKUM 2
public double getData(int index) {
    Node_21 tmp = head;

    for (int i = 0; i < index; i++) {
        tmp = tmp.next;
    }

    return tmp.data.ipk;
}
public int indexOf(String key) {
    Node_21 tmp = head;
    int index = 0;

    while (tmp != null && !tmp.data.nim.equals(key)) {
        tmp = tmp.next;
        index++;
    }
    if (tmp == null) {
        return -1;
    } else {
        return index;
    }
}
public void removeAfter(String key) {
    Node_21 temp = head;

    while (temp != null) {
        if (temp.data.nama.equalsIgnoreCase(key)) {
            if (temp.next != null) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
            }
            break;
        }
        temp = temp.next;
    }
}
}