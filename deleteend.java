public class deleteend {
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
    public deleteend(){
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

    public void Display(){
     Node temp=front;
     while(temp!=null){
       System.out.print(temp.data +"->");
       temp=temp.next;
     }
     System.out.print("END");
   }
   public static void main(String args[]){
     deleteend list = new deleteend();
     list.addVal(7);
     list.addVal(9);
     list.addVal(0);
     list.addVal(20);
     System.out.println(list.deleteLast());
     list.Display();
   }
    
}
