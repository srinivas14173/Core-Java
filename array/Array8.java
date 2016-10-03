class Array8
{
int i;
int arr[]=new int[10];
void add()
{
int j=100;
for(i=0;i<arr.length;i++)
{
arr[i]=j;
j++;
}
}
void show()
{
for(i=0;i<arr.length;i++)
{
System.out.println("The	"+i+"	Array    Elements    is	"+arr[i]);
}
}
public static void main(String[] args)
{
Array8 n=new Array8();
n.add();
n.show();
}
}