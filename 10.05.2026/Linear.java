import java.util.Scanner;
class Linear
{
	public static void main(String args [])
	{
	
	int ar[] = {10 ,20, 30, 40, 50};
	int key = 30;
	int index = 0;
	Linear f1 = new Linear();
	int res = f1.linear(ar,index,key);
	System.out.println(res);
}


int linear (int ar1[],int i,int key)
{
	
	if(i>ar1.length-1)
	{
	return -1;
	}
	
	if(ar1[i]==key)
	{
		return i;
	}
	
	return linear(ar1,i+1,key);	
}

}	