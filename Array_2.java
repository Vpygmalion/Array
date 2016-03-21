package Array;
import java.io.IOException; 
import java.util.Scanner; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.BufferedReader; 


public class Array_2 {
	 
	public static double sum=0;
	public static double[] Darray=new double[100];
	public static void main(String[] Sarry)
	 	{ 
		 int count=func_1();
	 	 double fina=func(count);
	 		System.out.print("您说得的最后之后和为："+fina);
	 	  }

static int func_1()
{
	System.out.println("请输入任意的数组长度：");
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		if(count>100||count<0){
			System.out.print("输入的有数值有问题，请重新输入");
		func_1();
		};
		return count;
}
static double func(double count)
{
	try
	{
		String buf=null;
		BufferedReader in=new BufferedReader(new FileReader("C:/Users/狸猫/Array/src/Array/数组表.csv") );
		int icount=100;
		for(int i=0;i<icount;i++)
		{
			buf=in.readLine();
			String[] temp=buf.split(",");
			Darray[i]=Double.parseDouble(temp[0]);
		}
		for(int i=0;i<count;i++)
		{
			sum+=Darray[i];
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
	return sum;
	
}


}
