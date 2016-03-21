package Array;
import java.io.IOException; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.BufferedReader; 

public class CopyOfArray {
	public static double sum=0;
	public static double[] Darray=new double[100];
	public static void main(String[] Sarry)
	{
		try
		{
			String buf=null;
			BufferedReader in=new BufferedReader(new FileReader("C:/Users/ÀêÃ¨/Array/src/Array/Êý×é±í.csv") );
			int count=100;
			for(int i=0;i<count;i++)
			{
				buf=in.readLine();
				String[] temp=buf.split(",");
				Darray[i]=Double.parseDouble(temp[0]);
			}
		
		
		for(int i=0;i<100;i++)
		{
			sum=sum+Darray[i];
		}
		in.close();
		System.out.println("sum="+sum);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
