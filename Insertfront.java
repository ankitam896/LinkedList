
public class Insertfront {
   class Node{
     int data;
     Node next;
     public Node(int data){
       this.data = data;
       this.next = null;
     }
   }
   public Node front;
   public Node end;
   public void addVal(int data){
     Node node = new Node(data);
     if(front == null){
       front = node;
       end = node;
     }
     else
    end.next = node;
    end = node;
    
   }
   public void Display(){
     Node temp=front;
     while(temp!=null){
       System.out.print(temp.data +"->");
       temp=temp.next;
     }
     System.out.print("END");
   }
   public static void main(String args[]){
     Insertfront list = new Insertfront();
     list.addVal(7);
     list.addVal(9);
     list.addVal(0);
     list.addVal(20);
    
     
     list.Display(); 
   }
}
