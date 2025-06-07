package Practise;

public class Ses2 {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void append(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }else{
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = n;
        }
    }

    public void print(){
        Node cur = head;
        System.out.print("Null -> ");
        while(cur != null){
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println(" Null ");
    }

    public Node middle(){
        if(head == null){
            System.out.println("List is Empty");
            return null;
        }
        Node s = head, f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public Node reverse(Node head){
        Node prev = null;
        Node cur = head;
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public boolean isPalindrome(Node head){
        if(head == null || head.next == null) return true;

        // Find middle
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);
        Node reverseHead = secondHalf;

        // Compare halves
        Node firstHalf = head;
        boolean isPalin = true;
        while(secondHalf != null){
            if(firstHalf.val != secondHalf.val){
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Restore the second half (optional but good practice)
        reverse(reverseHead);

        return isPalin;
    }
    public Node rotate(Node head, int k){
        if(k == 0 || head == null || head.next == null){
            return head;
        }
        Node cur = head;
        Node prev = null;
        while(cur.next != null){
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        cur.next = head;
        head = cur;
        head = rotate(head, k - 1);
        return head;
        
    }
    
    public static void main(String[] args) {
        Ses2 list = new Ses2();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        
        System.out.print("Original List: ");
        list.print();

        System.out.println("Middle Node: " + list.middle().val);

        // Check if palindrome
        boolean result = list.isPalindrome(list.head);
        System.out.println("Is Palindrome? " + result);

        System.out.print("List after palindrome check (restored): ");
        list.print();
        list.head = list.reverse(list.head);
        list.print();
        System.out.println("Middle Node after Reversing  := " + list.middle().val);
        
        list.head = list.rotate(list.head,1);
        list.print();
    }
}
