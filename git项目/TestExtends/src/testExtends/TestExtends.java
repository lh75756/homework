
package testExtends;
    /**        
     * Title: TestExtends.java    
     * Description:练习类的继承、构造方法的使用，并测试结果
     * @author 软工1503 李航       
     * @created 2017年10月14日 下午4:48:39
     * gitAddress:    
     */
public class TestExtends {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("LiMing",20,"大学");
		s1.show();
		System.out.println("");
		Undergraduate u1=new Undergraduate("WangXing",21,"大学","软件工程");
		u1.show();
		System.out.println();
		Graduate g1=new Graduate("ZhangLing",20,"研究生","软件工程");
		g1.show();
	    }
	}
class Student{
	static private String name;
	static private int age;
	static private String education;
	public Student(String a,int b,String c){
		this.name=a;
		this.age=b;
		this.education=c;
	}
    static public String getName() {
		return name;
	}
	static public int getAge() {
		return age;
	}
	static public String getEducation() {
		return education;
	}
	public void show()
	{
		System.out.println("学生的姓名为:"+name);
		System.out.println("学生的年龄为:"+age);
		System.out.println("学生的学历为:"+education);
	}
}
class Undergraduate extends Student{
	private String specialty;
	public Undergraduate(String a,int b,String c,String d){
		super(a,b,c);
		this.specialty=d;
	}
	public void show() {
		super.show();
		System.out.println("大学生的专业为:"+specialty);
	}
}
class Graduate extends Student{
	private String direction;
	public Graduate(String a,int b,String c,String e){
		super(a,b,c);
		this.direction=e;
	}
	public void show() {
        super.show();
		System.out.println("研究生的研究方向为:"+direction);
	}
}


