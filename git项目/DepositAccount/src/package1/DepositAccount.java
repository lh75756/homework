
package package1;
    /**        
     * Title: DepositAccount.java    
     * Description: 模拟银行定期存款功能
     * @author 软工1503 李航       
     * @created 2017年10月11日 下午2:34:39 
     * gitAddress:
     */
import java.util.*;

public class DepositAccount {
	private String num;             //账户
	private String name;            //姓名
	private double balance;         //余额
	private static  double rate;    //年利率
	public  double yearInterest;    //年利息
	public  double monthInterest;   //月利息    
	public DepositAccount(String a,String b,double c,double d){
		this.num=a;
		this.name=b;
		this.balance=c;
		this.rate=d;
	}
	double setBalance(double p) {   //修改余额的set方法
		balance=balance+p;
		return  balance;
	}
	double getBalance() {           //获取余额的get方法
		return balance;
	}
	public void yearInterest() {     //计算年利息
		yearInterest=balance * rate;
		System.out.println("年利息为:"+yearInterest);
	}
	public void monthInterest() {    //计算月利息
		monthInterest=yearInterest/12;
		System.out.println("月利息为:"+String.format("%1.2f", monthInterest));
	}
	public void show() {            //展示当前用户信息
		System.out.println("账号为："+num);
		System.out.println("姓名为："+name);
		System.out.println("余额为："+balance);
		System.out.println("年利率为："+rate);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		DepositAccount saver=new DepositAccount("1234567890","ZhangSan",5000.0,0.023);
		System.out.println("当前账户信息为:");
		saver.show();
		saver.yearInterest();
		saver.monthInterest();
		System.out.println("请输入存款金额:");      //进行存款操作
		Scanner in =new Scanner(System.in);
		n=in.nextInt();
		if(n<100)                              //判断存款的有效性
			System.out.println("您输入的存款金额有误！");
		else
		{
			System.out.println("存款后账户信息为:");
			saver.setBalance(n);
			saver.show();                        //存款后展示客户信息
			saver.yearInterest();                //存款后的年利息
			saver.monthInterest();               //存款后的月利息
		}
	}	
}
