class Array7
{
	int i;
	int da[]={1,2,3,4,5,6,7};
	void disp()
	{
		System.out.println("Displaying Array Details:");
	for(i=0;i<7;i++)
		{
		System.out.println(da[i]);
		}
	}
	public static void main(String args[])
	{
		Array7 d=new Array7();
		d.disp();
	}
}
