package Array;
import java.io.IOException; 
import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.BufferedReader; 


public class Array_3 {
	    public static double sum=0;
		public static double[] Darray=new double[100];
public static void main(String[] Sarry)
	{ 
	 int fnum=fjudge_2();
	 int count=fjudge_1(fnum);
	 double fina=func(fnum,count);
	 System.out.print("��˵�õ����֮���Ϊ��"+fina);
    }

	static int fjudge_1(int fnum)
	{
		    System.out.println("��������������鳤�ȣ�");
			Scanner scan=new Scanner(System.in);
			int count=scan.nextInt();
			int fcount=count+fnum;
			if((count>99||count<0)&&(fcount>99))
			{
				System.out.print("WARING: ���������ֵ�����⣬����������(������<100��������");
				fjudge_1(fnum);
			};
			return count;
	}
	
	static int fjudge_2()
	{
		System.out.println("���������뿪ʼ������λ�ã�");
		Scanner scan=new Scanner(System.in);
		int fnum=scan.nextInt();
		if(fnum>100||fnum<0)
		{
			System.out.print("WARING: ���������ֵ�����⣬����������(������<100��������");
			fjudge_2();
		};
		return fnum;
	}
		
	static double func(int fnum,int count)
	{
		try
		{
			String buf=null;
			BufferedReader in=new BufferedReader(new FileReader("C:/Users/��è/Array/src/Array/�����.csv") );
			int icount=100;
			for(int i=0;i<icount;i++)
			{
				buf=in.readLine();
				String[] temp=buf.split(",");
				Darray[i]=Double.parseDouble(temp[0]);
			}
			for(int i=fnum;i<count;i++)
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


