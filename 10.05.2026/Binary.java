import java.util.Scanner;
class Binary
{
	public static void main(String args [])
	{
	
	int ar[] = { 5 ,10, 15, 20, 25, 30};
	int key = 20;
	
	int left = 0;
	int right = ar.length-1;
	Binary f1 = new Binary();
	int res = f1.binary(ar,key,left,right);
	System.out.println(res);
}


int binary (int ar1[],int key,int left, int right)
{
	if(left>right)
	{
		return -1;
	}
	
	int mid = (left+right)/2;
	if(ar1[mid]==key)
	{
		return mid;
	}
	if(ar1[mid]<key)
	{
		return binary(ar1,key,mid+1,right);
	}
	return binary(ar1,key,left,mid-1);
	
	
}

}	