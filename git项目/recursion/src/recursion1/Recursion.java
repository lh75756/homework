
package recursion1;
import java.util.*;
/**        
 * Title: Recursion.java    
 * Description: 一个整数，大于0，不用循环和本地变量，按照n,2n,4n,8n的顺序递增。
 * 当值大于5000时，把值按照指定顺序输出。
 * 例如，输入1237
 * 输出为：1237,2474,4948,9896,9896,4948,2474,1237
 * Solution:采用递归的方法
 * @author 软工1503 李航       
 * @created 2017年9月22日 下午1:57:49    
 */
public class Recursion {    //定义计算按顺序递增的数值的类
	static class Deal{
		public int deal(int n) {
			if(n>5000)
			{
				System.out.println(n);  
				System.out.println(n);
				return n;
			}
			else
			{
				System.out.println(n); 
				n=n*2;                //对数值按照2,4,8倍进行递增
				return deal(n);
			}
		}
	}
   static class Show{          
	   public int show(int a,int b) {  //按照递减的顺序对数值进行输出
			a=a/2;
			System.out.println(a);
			if(a==b)                   //当递减到与原始的输入值相等时，运算结束
				return 0;
			else
				return show(a,b);    
	   }
	}
	public static void main(String[] args) {
		int n,m;
		System.out.println("请输入一个大于0小于5000的整数:");
		Scanner in =new Scanner(System.in);
		n=in.nextInt();
		if(n>=5000)                    //判断输入数据的合理性
			System.out.println("数据输入错误");
		else
		{
			Deal d1=new Deal();
			m=d1.deal(n);
			Show s1=new Show();
			s1.show(m,n);    //传递两个参数，m为递增(超过5000以后)的最大值，n为初始的输入值ֵ
		}
	}
}
