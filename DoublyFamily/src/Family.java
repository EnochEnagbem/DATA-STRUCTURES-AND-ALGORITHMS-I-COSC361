import java.util.NoSuchElementException;

public class Family {
        private ListNode head;//Hold first node in the list
        private ListNode tail;//Hold last node in the list
        private int length;//Hold the length of the list

        //Family Constructor
        public Family(){
            this.head = null;//Set the head to null
            this.tail = null;//Set the tail to null
            this.length = 0;//Set the length to zero
        }

// List node class
    public class ListNode{
        private String data;//Hold the data part of the node
        private ListNode next;//Reference the next node
        private ListNode previous;//Reference the previous node

        //List node constructor
        public ListNode(String data){
            this.data = data;//Initialize the data field
        }
    }

    //Check if list is empty
    public boolean isEmpty(){
        return length == 0;//return true
    }

    /**
     * A method to get the length of the list
     * @return length
     * */
    public int length(){
        return length;//Return the length of the list
    }


    //A method to display all the element in the list from the head to tail
    public void displayForward(){
            int i = 1;
        if(head == null){//Check if the list is empty
            return;
        }

        ListNode temp = head;//Create a new node and assign it as the head
        while (temp != null){
            //Display a particular element in the list starting from the head
            System.out.println((i) +". "+ temp.data);
            temp = temp.next;//Move to the next element
            i++;//add one to the length of the list
        }

        System.out.println("NULL");//Mark the end of the list
    }

    //A method to display the element from the tail to the head
    public void displayBackward(){
        int i = length();
        if(tail == null){
            return;
        }
        ListNode temp = tail;//Create a new node and assign it as the tail

        while (temp!= null){
            //Display a particular element in the list starting from the tail
            System.out.println((i) +". "+temp.data);
            temp = temp.previous;//Move to the previous element
            i--;
        }
        System.out.println("NULL");
    }


    /**
     * A method to insert element at the front of the list
     * @param value to be inserted at the front of the list
     * */
    public void insertFirst(String value){
        ListNode newNode = new ListNode(value);//Create a node
        if(isEmpty()){//Check if the list is empty
            tail = newNode;//Set the new node as the last element
        }
        else {
            head.previous= newNode;//Set the head previous as the new node
        }

        newNode.next = head;//Set the new node next as the previous head
        head = newNode;//Set the new node as the head
        length++;//add 1 to the length of the list

    }

    /**
     * A method to insert at the end of the list
     * @param value to be inserted at the end of the list
     * */
    public void insertLast(String value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){//Check if the list is empty
            head = newNode;//Set the new node as the head
        }
        else {
            tail.next = newNode;//Set the tail next element as the new node
        }
        newNode.previous = tail;//Set the new node previous as the tail
        tail = newNode;//Set the new node as the tail
        length++;//Add 1 to the length of the
    }

    /**
     * @param data to be inserted in the list
     * @param position the position to insert the element
     *
     * */
    public void insertAfter(String data,int position){
        if(head == null){//Check if the list is empty
            return;
        }
        ListNode temp = head;//Create a node and set it as the head
        int i  = 1;

        while(i < position){//Loop the list through till we get to the position we want
            temp = temp.next;
            i++;
        }

        if(temp.previous == null){
            insertFirst(data);//Insert at the front
        }
        else{

            ListNode newNode = new ListNode(data);//Create a new node
            newNode.previous = temp.previous;
            newNode.next = temp;
            temp.previous.next = newNode ;

            length++;


        }



    }


    //A method to delete the first element in the list
    public ListNode deleteFirst(){
            if(isEmpty()){//Check if the list is empty
                throw new NoSuchElementException();
            }
            ListNode current = head;
            if(head == tail){
                tail = null;
            }else
                {
                head.next.previous = null;
        }
            head = head.next;
            current.next = null;
            length--;
            return current;

    }

    //A method to delete the last element in the list
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode current = tail;
        if(tail == head){
            head = null;
        }
        else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        current.previous = null;
        length--;
        return  current;
    }

    /**
     * A method to delete ad a particular location
     * @param position to indicate the position
     * */
    public void deleteAt(int position){
            if(head == null){
                return;
            }

            ListNode temp = head;
            int i = 1;
            while(i < position){
                temp = temp.next;
                i++;
            }
            if(temp.next == null){
                temp.previous.next = null;
            }
            else if(temp.previous == null){
                temp = temp.next;
                temp.previous = null;
                head = temp;
            }
            else{
                temp.previous.next = temp.next;
                temp.next.previous = temp.previous;
            }
            length--;
    }

    public static void main(String []args) {
        Family list = new Family();

        list.insertFirst("Mr.Kpozah");//Insert at the beginning of the list
        list.insertLast("Mr.Kuwornu");//Insert at the end of the list
        list.insertLast("Mr.Kumanyenu");//Insert at the end of the list
        list.insertLast("Mr.Wuasia");//Insert at the end of the list
        list.insertLast("Mr.Kumanyenu");//Insert at the end of the list
        list.insertLast("Enagbem");//Insert at the end of the list
        list.displayForward();//Display all the element in the list from first to last
        list.displayBackward();//Display all the element in the list from last to first
        list.deleteLast();//delete element at the of end of the list
        list.displayForward();//Display all the element in the list from first to last
        //Display the length of the list
        System.out.println("The length of the list is " + list.length());



    }


}
