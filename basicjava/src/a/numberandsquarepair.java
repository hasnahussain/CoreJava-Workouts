package a;

public class numberandsquarepair {
	public static void main(String[] args) 
	{
		int [] ar= {2,4,8,3,9,7,12};
		int temp=0;
		for(int i=0;i<ar.length;i++)
		{
			temp=ar[i]*ar[i];
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]==temp)
			{
				System.out.println(ar[i]+" : "+temp);
			}
		}
			
		}
		
	}

}
