/**
 Author:软工1503 李航
 Description:定义Car类计算大货车和小货车装载货物的总重量(其中使用到了数组和上转型对象)
 **/
package computeWeight;

public class Car {
	ComputeWeight [] comw=new ComputeWeight[3];
	Car() {
		comw[0] = new Television(2,1);         //上转型对象
		comw[1] = new Computer(3,1);
		comw[2] = new WashMachine(2,1);
	}
	public double sum() {
		double sum=0;
		sum=comw[0].computeWeight()+comw[1].computeWeight()+comw[2].computeWeight();
		System.out.println("大货车和小货车装载的货物的总重量为"+sum+"kg");
		return sum;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.sum();
	}

}
