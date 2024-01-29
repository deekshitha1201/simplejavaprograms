package simpleprograms.com;

public class oddnumberspatern {
	public static void main(String[] args) {
		int n=4;
		int i1=1;
		for(int i=0;i<=n;i++)
		{
			int i2=i1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(i2+" ");
				i2+=2;
			}
			System.out.println();
			i1+=2;
		}
	}

}
