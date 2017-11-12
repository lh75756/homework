/**
 Author:软工1503 李航
 Description:创建一个姓名为"zhangsan"的研究生，统计他的年收入和学费，如果收入减去学费不足2000元
                                        则输出"provide a loan"
                                        https://github.com/lh75756/homework/commit/2ed0b069a7da18d7b487a3bdf8876c4b2aabeb3f
 **/
package graduate;

public class Graduate implements StudentManageInterface,TeacherManageInterface {
    private String name;
    private String sex;
    private int age;
    private double fee;        //每学期学费
    private double pay;        //月工资
    
    Graduate(String name){
    	this.name=name;
    	System.out.println("研究生的名字是："+name);
    }
	public double getFee() {
		return fee*2;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getPay() {
		return pay*12;
	}
    
	public void setPay(double pay) {
		this.pay = pay;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m;
		Graduate g1=new Graduate("zhangsan");
		g1.setFee(11500);
		g1.setPay(2000);
		System.out.println("zhangsan的一年学费为:"+g1.getFee());
		System.out.println("zhangsan的年收入为:"+g1.getPay());
		m=g1.getPay()-g1.getFee();
		System.out.println("年收入与学费的差值为："+m);
		if(m<2000)
			System.out.println("provide a loan");
		else
			System.out.println("don't provide a loan");
	}
}
