class twodimensional_array
{
   public static void main(String args[])
   {
	   int a[][]={1,2,3,4,5,6};
	   int b[][]={4,5,6,7,8,9},sum=0;
	   int i,n=3;
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<n;j++)
		   {
		   sum=a[i][j]+b[i][j];
		   System.out.println(" "+sum);
		   }
	   }
   }
}