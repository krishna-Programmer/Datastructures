
public class  LinkedList<T>
{
Node<T> head;
int length;
Node<T> previous;
Node<T> current;
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
current=head;
while(current.next!=null)current=current.next;
current.next=new Node<T>(data);
}
++length;
}
public void remove(T data)
{
current=head;
previous=null;
int index=0;
boolean found=false;
while(current!=null){
++index;
if(current.data==data){found=true;break;};
previous=current;current=current.next;
}

if(found==true)
{
System.out.println("Element found at"+index);
if(current==head)head=current.next;
else previous.next=current.next;
--length;
}
else
{
System.out.println("Element not found");
}
}
public void print()
{
  current=head;
  while(current!=null){System.out.println(current.data);current=current.next;}
}
public void addBeforeHead(T data)
{
 Node<T> temp=head;
 head=new Node<T>(data);
 head.next=temp.next;
}
public void insertAfter(T data)
{
 
}
public void insertBefore(T data)
{

}
public void find(T data) 
{
current=head;
previous=null;
int index=0;
boolean found=false;
while(current!=null){
++index;
if(current.data==data){found=true;break;};
previous=current;current=current.next;
}

if(found==true)
{
System.out.println("Element found at"+index);
if(current==head)head=current.next;
else previous.next=current.next;
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