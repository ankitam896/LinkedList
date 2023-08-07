public class deletepos {
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
    public deletepos(){
        this.size = 0;
    }
    public void addVal(int data){
    Node node = new Node(data);
    if(front == null){
        front = node;
        end = node;
    }
    end.next = node;
    end = node;

    size++;
    } 
    public int delete (){
    int data = front.data;
     front = front.next;
    if(front == null){
        end=null;
    }
    return data;
   }

    public int deleteLast(){
    if(size<=1){
        return delete();
    }
    Node secondLast = get(size -2);
    int data = end.data;
    end = secondLast;
    end.next = null;
    size--; 
    return data;
    }

    //reference node
    public Node get(int index){
        Node node = front;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public int deletePos(int index){
        if(index==0){
            return delete();
        }
        if (index==size -1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int data = prev.next.data;
        prev.next=prev.next.next;
        return data;
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
     deletepos list = new deletepos();
     list.addVal(7);
     list.addVal(9);
     list.addVal(0);
     list.addVal(20);
      list.deletePos(2);
     list.Display();
   }
    
}
