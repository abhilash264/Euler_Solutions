public class tset993920
	{
		public static void main(String args[])
			{
				System.out.println(xyz());
			}
	public static int xyz()	
			{
				int k=0;
				//int p=1;
			   for(int i=999;i>=100;i--)
				{
				   for(int j=i-1;j>=100;j--)
					{
					   int p=1;
					   p=i*j;
					   int m=1;
					   int count=0;
					   while(m<=p)
						{
						   if(p%m==0)
							{
								count+=1;
							}
						   m+=1;
						}
					if(count==2)
						{
						   k=p;
						   return k;
						}
					}
				}	
			
		return -1;
		}
	}	