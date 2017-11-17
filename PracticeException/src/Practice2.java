
/**        
 * Title: Practice2.java    
 * Description:先编写一个方法，它将格式为“yyyy/mm/dd”形式的日期字符串为日期对象。若日期对象不符合以上规定，则抛出异常。
 * 再在main方法中队正常和异常输入的日期字符串分别进行验证，并输出转换后的日期对象
 * @author 软工1503 李航       
 * @created 2017年11月16日 下午10:59:14    
 * 
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Practice2 {
	/**
	 * 将日期对象转换为指定的日期字符串
	 * @param date 	传入的日期对象
	 * @param format 格式
	 * @return 日期字符串
	 */
	 static String formatDate(Date date,String format){
		 String string="";
		 SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
		 if(date!=null){
			 string=simpleDateFormat.format(date);
		 }
		 return string;
	 }
	 /**
	  * 将日期字符串转换为一个日期对象
	  * @param datestr 日期字符串
	  * @param format 格式
	  * @return Date
	  * @throws ParseException
	  */
    public static Date formatDate(String datestr,String format) throws ParseException{
    	 SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
    	
    	return  simpleDateFormat.parse(datestr);
    }
	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		System.out.println("系统当前时间为:");
		System.out.println(formatDate(date,"yyyy/MM/dd"));
		System.out.println("请输入一个日期字符串");
		Scanner s= new Scanner(System.in);
		String datestr=s.nextLine();
		Date date2=formatDate(datestr,"yyyy/MM/dd");
		System.out.println(date2);
	}
}
