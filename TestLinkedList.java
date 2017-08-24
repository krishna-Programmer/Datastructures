import java.util.Scanner;
class TestLinkedList
{
public static void main(String args[])
{
LinkedList<Integer> l=new LinkedList<>();
System.out.println("select");
String options[][]={ {"1","print"},{"2","add"},{"3","addBefore"},{"4","addAfter"},{"5","addBeforeHead"},{"6","remove"},{"7","exit"}};
System.out.println("select option --->");
for(String s[]:options)
{
System.out.println(s[0]+" for "+s[1]);
}
Scanner scanner=new Scanner(System.in);
while(true)
{
int optionvalue=scanner.nextInt();
if(optionvalue==7)break;
switch(optionvalue)
{
case 1:l.print();
break;
case 2:l.add(10);l.add(20);l.add(30);l.add(40);l.add(50);

break;
case 3:l.addBefore(10);
break;
case 4:l.addAfter(30);break;
case 5:l.addBeforeHead(60);break;
case 6:
l.remove(20);break;
}
}

}
}