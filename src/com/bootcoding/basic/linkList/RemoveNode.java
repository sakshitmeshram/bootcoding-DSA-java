package com.bootcoding.basic.linkList;

public class RemoveNode {
    public Node addData(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(6);
        Node n4=new Node(3);
        Node n5=new Node(4);
        Node n6=new Node(5);
        Node n7=new Node(6);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=null;
        return  head;
    }

    public Node nodeRemove(Node head ,int val){
        Node temp =head;
        while(temp!=null){
            if( temp.next.data==val){
                Node con=temp.next;


            }
        }
        return null;
    }
}
