
public class  LinkedList<T>
{
Node<T> head;
int length;
Node<T> previousNode;
Node<T> currentNodeNode;
Node<T> nexttNode;
int index;
private static class Node<T>
{
Node<T> nexttNode;
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
currentNodeNode=head;
while(currentNodeNode.nexttNode!=null)currentNodeNode=currentNodeNode.nexttNode;
currentNodeNode.nexttNode=new Node<T>(data);
}
++length;
}
public void remove(T data)
{
currentNodeNode=head;
previousNode=null;
int index=0;
boolean found=false;
while(currentNodeNode!=null){
++index;
if(currentNodeNode.data==data){found=true;break;};
previousNode=currentNodeNode;currentNodeNode=currentNodeNode.nexttNode;
}

if(found==true)
{
System.out.println("Element found at"+index);
if(currentNodeNode==head)head=currentNodeNode.nexttNode;
else previousNode.nexttNode=currentNodeNode.nexttNode;
--length;
}
else
{
System.out.println("Element not found");
}
}
public void print()
{
  currentNodeNode=head;
  while(currentNodeNode!=null){System.out.println(currentNodeNode.data);currentNodeNode=currentNodeNode.nexttNode;}
}
public void addBeforeHead(T data)
{
 Node<T> temp=head;
 head=new Node<T>(data);
 head.nexttNode=temp.nexttNode;
}
public void insertAfter(T data)
{
 find(T data);

 currentNodeNode.nexttNode=new Node<T>(data);
 currentNodeNode.nexttNode.nexttNode=currentNodeNode;
}
public void insertBefore(T data)
{


}
public void find(T data) 
{
currentNodeNode=head;
previousNode=null;
int index=0;
boolean found=false;
while(currentNodeNode!=null){
++index;
if(currentNodeNode.data==data){found=true;break;};
previousNode=currentNodeNode;currentNodeNode=currentNodeNode.nexttNode;
}

if(found==true)
{
System.out.println("Element found at"+index);
if(currentNodeNode==head)head=currentNodeNode.nexttNode;
else previousNode.nexttNode=currentNodeNode.nexttNode;
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