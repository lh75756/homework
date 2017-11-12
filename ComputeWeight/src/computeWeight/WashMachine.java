/**
 Author:软工1503 李航
 Description:定义WashMachine类计算大货车和小货车装载洗衣机的重量
 **/
package computeWeight;

public class WashMachine implements ComputeWeight{
	private double wmw=30.0;    //一台洗衣机的重量
	private int t1Num=0;
	private int t2Num=0;
	WashMachine(int a, int b){
		this.t1Num=a;           //大货车装载洗衣机的数量
		this.t2Num=b;           //小货车装载洗衣机的数量
		System.out.println("一台洗衣机的重量为"+wmw+"kg");
		System.out.println("大货车装载洗衣机的数量为"+t1Num);
		System.out.println("小货车装载洗衣机的数量为"+t2Num);
		System.out.println();
	}
	public double computeWeight() {
		return(t1Num*wmw+t2Num*wmw); 
	}
}
