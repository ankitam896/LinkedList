

public class insert {
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
   public int size;
   public insert(){
    this.size =0;
   }
   public void addVal(int data){
     Node node = new Node(data);
     if(front == null){
       front = node;
       end = node;
     }
     else
    end.next = node;
    end = node;

    size++;
    
   }
       public void InsertLast(int data){
     if(end == null){
       addVal(data);
       return;
     }
     Node node = new Node(data);
     end.next = node;
     end = node;
     size++;
   }     

   public void Insertpos(int data,int index){
    if(index == 0){
        addVal(data);
        return;
    }
    if(index==size){
        InsertLast(data);
        return;
    }
    Node temp = front;
    for(int i=0;i<index-1;i++){
        temp = temp.next;
    }
     Node node = new Node(data);
    node.next = temp.next;
    temp.next = node;

    size++;
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
     insert list = new insert();
     list.addVal(7);
     list.addVal(9);
     list.addVal(0);
     list.addVal(20);
     list.InsertLast(17);
     list.Insertpos(13, 3);
     list.Display(); 
   }

   }
