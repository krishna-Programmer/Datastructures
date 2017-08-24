import java.util.Scanner;
public class  LinkedList<T>
{
Node<T> head;
Node<T> previousNode;
Node<T> currentNode;
int length;
private static class Node<T>
{
Node<T> next;
T data;
Node(T data)
{
this.data=data;
}
}
public void add(T data)
{
if(head==null)head=new Node<T>(data);
else
{
currentNode=getLast();
currentNode.next=new Node<T>(data);
}
++length;
}
public void remove(T data)
{
if(find(data)!=-1)
{
if(currentNode==head)head=currentNode.next;
else previousNode.next=currentNode.next;
--length;
}
else
{
System.out.println("Element not found");
}
}
public void print()
{
  currentNode=head;
  while(currentNode!=null){System.out.println(currentNode.data);currentNode=currentNode.next;}
}
public void addBeforeHead(T data)
{
 Node<T> temp=head;
 head=new Node<T>(data);
 head.next=temp.next;
}
public void addAfter(T data)
{
 if(find(data)!=-1)
{
  Node<T> newNode=new Node<T>(data);
  newNode.next=currentNode.next;
  currentNode.next=newNode;
}
else
{
 System.out.println("Element not found");
}
}
public void addBefore(T data)
{
 if(find(data)!=-1)
{
  Node<T> newNode=new Node<T>(data);
  newNode.next=currentNode;
  previousNode.next=newNode;
}
else
{
 System.out.println("Element not found");
}

}
public int find(T data) 
{
currentNode=head;
previousNode=null;
int index=0;
boolean found=false;
while(currentNode!=null){
++index;
if(currentNode.data==data){found=true;break;};
previousNode=currentNode;currentNode=currentNode.next;
}
if(found==true)
{
if(currentNode==head)head=currentNode.next;
else previousNode.next=currentNode.next;
--length;
return index;
}
else return -1;
}
public Node<T> getLast()
{
currentNode=head;
while(currentNode.next!=null)currentNode=currentNode.next;
return currentNode;
}

}