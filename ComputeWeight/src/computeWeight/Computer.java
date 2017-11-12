/**
 Author:软工1503 李航
 Description:定义Computer类计算大货车和小货车装载计算机的重量
 **/
package computeWeight;

public class Computer implements ComputeWeight{
	private double cw=35.0;     //一台计算机的重量
	private int t1Num=0;
	private int t2Num=0;
	Computer(int a, int b){
		this.t1Num=a;           //大货车装载计算机的数量
		this.t2Num=b;           //小货车装载计算机的数量
		System.out.println("一台计算机的重量为"+cw+"kg");
		System.out.println("大货车装载计算机的数量为"+t1Num);
		System.out.println("小货车装载计算机的数量为"+t2Num);
		System.out.println();
	}
	public double computeWeight() {
		return(t1Num*cw+t2Num*cw); 
	}

}
