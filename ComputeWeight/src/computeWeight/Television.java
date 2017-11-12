/**
 Author:软工1503 李航
 Description:定义Television类计算大货车和小货车装载电视的重量
 **/
package computeWeight;

public class Television implements ComputeWeight {
	private double tw=30.0;     //一台电视的重量
	private int t1Num=0;
	private int t2Num=0;
	Television(int a, int b){
		this.t1Num=a;           //大货车装载电视的数量
		this.t2Num=b;           //小货车装载电视的数量
		System.out.println("一台电视的重量为"+tw+"kg");
		System.out.println("大货车装载电视的数量为"+t1Num);
		System.out.println("小货车装载电视的数量为"+t2Num);
		System.out.println();
	}
	public double computeWeight() {
		return(t1Num*tw+t2Num*tw); 
	}
}
