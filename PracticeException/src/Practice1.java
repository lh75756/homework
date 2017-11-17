
/**        
 * Title: Practice1.java    
 * Description:先从键盘上输入一个十六进制数，再将其转化为十进制数，然后输出。如输入的不是一个有效的十六进制数，则抛出异常
 * @author 软工1503 李航       
 * @created 2017年11月16日 下午10:31:01 
 * githubAddress: 
 */
import java.util.*;

public class Practice1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("请输入一个字符串");
		  String s = sc.nextLine();
		  String regex="^[A-Fa-f0-9]+$";        //正则表达式
		  if(!(s.matches(regex)))               //若匹配正确，返回值为true                         
			  throw new Exception("输入的数据不是十六进制");
		  else
			  System.out.println(s+"转化为十进制为:"+Integer.parseInt(s,16));
	}
}
