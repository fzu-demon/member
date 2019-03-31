import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class test 
{
	public static void main(String args[])
	{
		Random rand = new Random();
		Scanner ans = new Scanner(System.in);
		int a = rand.nextInt(100);
		int b = rand.nextInt(100);
		int c = rand.nextInt(4);
		int res = 0;
		switch(c)
		{
		case 0:
			res = a + b;
			System.out.println(a + "+" + b +"=" );
			break;
		case 1:
			res = a - b;
			System.out.println(a + "-" + b +"=");
			break;
		case 2:
			res = a * b;
			System.out.println(a + "*" + b +"="); 	
			break;
		case 3:
			res = a / b;
			System.out.println("结果为整数： "+ a + "/" + b +"=");
			break;
		}
		int answer =ans.nextInt();
		if (res == answer)
			System.out.println("恭喜你答对了！");
		else
			System.out.println("很遗憾，你答错了。正确答案是"+res);
	}
	
}
