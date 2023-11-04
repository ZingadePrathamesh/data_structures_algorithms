public class SinglyLinkedList<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;

    SinglyLinkedList(){
        this.head =null;
        this.size = 0;
    }

    private static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Value added successfully!");
        size++;
    }

    public void addLast(T data){
        Node<T>  newNode = new Node<>(data);
        if(isEmpty()){head = newNode;}
        else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
        }
        size++;
    }

    public void addAtIndex(int index, T value) {
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        else if(index == size){addLast(value);}
        else if(index == 0 ){addFirst(value);}
        else{
            Node<T> newNode = new Node<>(value);
            Node<T> current = head;
            for(int i =0; i< index-1; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public void removeAtIndex(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Invalid Index!");
        } else if (index ==0) {
            removeFirst();
        } else{
            Node<T> current = head;
            for (int  i =0; i < index -1; i++){
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public void removeFirst(){
        head = head.next;
        size--;
    }

    public void removeLast(){removeAtIndex(size-1);}

    public T getFirst(){
        return head.data;
    }

    public T getLast(){return getAtIndex(size -1);}

    public T getAtIndex(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Invalid Index!");
        } else if (index == 0) {
            return getFirst();
        } else{
            Node<T> current = head;
            for (int i = 0; i< index; i++ ){
                current = current.next;
            }
            return current.data;
        }
    }

    public boolean contains(T value){
        Node<T> current = head;
        while(current != null){
            if(current.data.equals(value)) return true;
            current = current.next;
        }
        return false;
    }

    public void display(){
        Node<T> current = head;
        int i = 0;
        while(current != null){
            System.out.printf("Value at %d is %s\n",i, current.data );
            current = current.next;
            i++;
        }
    }


}