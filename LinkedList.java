
public class  LinkedList<T>
{
Node<T> head;
int length;
Node<T> previousNode;
Node<T> currentNode;
Node<T> nextNode;
int index;
private static class Node<T>
{
Node<T> next;
T data;
Node(T data)
{
this.data=data;
}
}
public LinkedList()
{

}
public void add(T data)
{
if(head==null)head=new Node<T>(data);
else
{
currentNode=head;
while(currentNode.next!=null)currentNode=currentNode.next;
currentNode.next=new Node<T>(data);
}
++length;
}
public void remove(T data)
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
System.out.println("Element found at"+index);
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
public void insertAfter(T data)
{
 find(T data);

 currentNode.next=new Node<T>(data);
 currentNode.next.next=currentNode;
}
public void insertBefore(T data)
{


}
public void find(T data) 
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
System.out.println("Element found at"+index);
if(currentNode==head)head=currentNode.next;
else previousNode.next=currentNode.next;
--length;
}
else
{
System.out.println("Element not found");
} 
}
public static void main(String args[])
{
LinkedList<Integer> l=new LinkedList<>();

l.add(10);
l.add(20);
l.add(30);
l.add(40);
l.add(50);
l.print();
l.remove(10);
l.print();
System.out.println("length:"+l.length);



}
}