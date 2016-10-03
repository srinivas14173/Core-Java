class Array9 //coord
{
	int i=0;
	int j=0;
	int coor[][]=new int[3][3];
	void Set()
	{
	coor[0][0]=1;
	coor[0][1]=0;
	coor[0][2]=0;
	coor[1][0]=0;
	coor[1][1]=1;
	coor[1][2]=0;
	coor[2][0]=0;
	coor[2][1]=0;
	coor[2][2]=1;
	}
	void Show()
	{
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(coor[i][j]      +"    ");
	}
	System.out.println();
	}
	}
public static void main(String args[])
	{
	Array9 c=new Array9();
	c.Set();
	c.Show();
	}
}