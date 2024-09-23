import java.util.StringJoiner;

public class SingleLinkedList<E> {
    private int size = 0;
    private SingleLinkedList<E>.Node head = null;

    public SingleLinkedList() {
    }

    public void add(E element) {
        SingleLinkedList<E>.Node node = new Node(this, element);
        ++this.size;
        if (this.size == 1) {
            this.head = node;
        } else {
            Node cur;
            for(cur = this.head; cur.next != null; cur = cur.next) {
            }

            cur.next = node;
        }
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        for(SingleLinkedList<E>.Node cur = this.head; cur != null; cur = cur.next) {
            E element = cur.getElement();
            joiner.add(String.valueOf(element));
        }

        return joiner.toString();
    }

    public E get(int index) {
        if (index < this.size && index >= 0) {
            SingleLinkedList<E>.Node cur = this.head;

            for(int i = 0; i < index; ++i) {
                cur = cur.next;
            }

            return cur.element;
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public void addByIndex(int index, E element) {
        if (index < this.size && index >= 0) {
            SingleLinkedList<E>.Node cur = this.head;
            SingleLinkedList<E>.Node node = new Node(this, element);
            if (index == 0) {
                this.head = node;
                node.next = cur;
            } else {
                for(int i = 0; i < index - 1; ++i) {
                    cur = cur.next;
                }

                SingleLinkedList<E>.Node cur1 = this.head;

                for(int i = 0; i < index; ++i) {
                    cur1 = cur1.next;
                }

                cur.next = node;
                node.next = cur1;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public SingleLinkedList<E>.Node getHead() {
        return this.head;
    }

    private class Node {
        E element;
        SingleLinkedList<E>.Node next;

        public Node(final SingleLinkedList var1, Object element) {
            this.element = (E) element;
        }

        public E getElement() {
            return this.element;
        }
    }
}
