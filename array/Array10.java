class Array10
{
	int i;
	String names[]={"srinu","Nanni","Chinna","arub","Kala"};
	void Show()
	{
	System.out.println("My Favourite Names Are Below: ");
	{
	i=0;
	for(;i<5;i++)
	{
	System.out.println("	"+names[i]);
	}
	}
	}
public static void main(String args[])
	{
	Array10 s=new Array10();
	s.Show();
	}
}
	