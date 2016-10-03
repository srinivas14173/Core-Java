class Array4
{
public static void main(String args[])
{
int a[]=new int[12];
a[0]=Integer.parseInt(args[0]);
a[1]=Integer.parseInt(args[1]);
a[2]=Integer.parseInt(args[2]);
a[3]=Integer.parseInt(args[3]);
a[4]=Integer.parseInt(args[4]);
a[5]=Integer.parseInt(args[5]);
a[6]=Integer.parseInt(args[6]);
a[7]=Integer.parseInt(args[7]);
a[8]=a[0]+a[1];
a[9]=a[2]-a[3];
a[10]=a[4]*a[5];
a[11]=a[6]/a[7];
System.out.println("First Nuber A is:	"+a[0]);
System.out.println("Second Number B is:	"+a[1]);
System.out.println("Third Number C is:	"+a[2]);
System.out.println("Fourth Number D is:	"+a[3]);
System.out.println("Fifth Number E is:	"+a[4]);
System.out.println("Sixth Number F is:	"+a[5]);
System.out.println("Seventh Number  G is:	"+a[6]);
System.out.println("Eighth Number H is:	"+a[7]);
System.out.println("\nAddition Of (A,B) Two Numbers is:"+a[8]);
System.out.println("Substraction Of (C,D) Two Numbers is:"+a[9]);
System.out.println("Multiplication Of (E,F) Two Numbers is:"+a[10]);
System.out.println("Divsion Of (G,H) Two Numbers is:"+a[11]);
}
}

