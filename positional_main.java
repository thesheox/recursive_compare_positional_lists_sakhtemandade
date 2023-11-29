

class positional_main
{
    public static void main(String[] args){
        PositionalSinglyLinkedList<Integer> p1=new PositionalSinglyLinkedList<Integer>();
        for(int i=1;i<4;i++){
            p1.addLast(i);
        }

        PositionalSinglyLinkedList<Integer> p2=new PositionalSinglyLinkedList<Integer>();
        for(int i=1;i<6;i++){
            p2.addLast(i);
        }


    System.out.println(p1.a_in_b(p1, p2));
    
    }
     
}