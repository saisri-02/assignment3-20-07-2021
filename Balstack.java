import java.util.*;
public class Balstack
{
static Stack<Integer> s=new Stack<Integer>();
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int n=sc.nextInt();
System.out.println("Enter array elements : ");
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
insert(a,n);
}
public static void insert(int a[],int n)
{
int c=0,count=0;
for(int i=0;i<n;i++)
{
s.push(a[i]);
int m=s.get(i);
if(m%2==0)
{
c+=1;
}
if(m%2==1)
{
count+=1;
}
}
System.out.println("no. of even elements : "+c);
System.out.println("no. of odd elements : "+count);
if(c==count)
{
System.out.println("Stack is balanced");
}
else
{
System.out.println("Stack is not balanced");
}
}
}

output:

Enter array size : 
6
Enter array elements : 
1 2 3 4 5 6
no. of even elements : 3
no. of odd elements : 3
Stack is balanced