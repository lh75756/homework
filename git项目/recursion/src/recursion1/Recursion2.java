
package recursion1;
import java.util.*;
/**        
 * Title: Recursion2.java    
 * Description:编程输出6*6数字旋转方阵
 * Solution:采用分治算法和递归进行求解
 * @author 软工1503 李航       
 * @created 2017年9月22日 下午3:47:32    
 */
public class Recursion2 {
    public static int N ; 
    int [][] result = new int[N][N];  
	public static void main(String[] args) {
		System.out.println("请输入矩阵的阶数:");   //控制输出N*N的矩阵
	    Scanner in=new Scanner(System.in);
	    N=in.nextInt();
		Recursion2 r2 = new Recursion2();  
	    r2.creatMatrix(1, 0, N);
	    System.out.println("输出的矩阵为:");
	    r2.showResult();  
	    }  
	    //生成旋转矩阵
	    public void creatMatrix(int number, int begin, int size){
	    /**三个参数的含义：number表示矩阵的第一个元素的值
            begin为矩阵的下标
            size为矩阵阶数 **/
	        if(size == 1){          //一阶矩阵，等于1
	            result[begin][begin] = number;  
	            return;  
	        }             
	        if(size == 0){         //0阶矩阵
	            return;  
	        }  
	      //生成第一列的五个数字
	        int i = begin;  
	        int j = begin;  
	        for(int k = 0; k < size - 1; k++){  
	            result[i][j] = number;  
	            number++;  
	            i++;  
	        }        
	        //生成最后一行的五个数字
	        for(int k = 0; k < size - 1; k++){  
	            result[i][j] = number;  
	            number++;  
	            j++;  
	        } 	          
	       //生成最后一列的五个数字
	        for(int k = 0; k < size - 1; k++){  
	            result[i][j] = number;  
	            number++;  
	            i--;  
	        }            
	       //生成第一行的五个数字 
	        for(int k = 0; k < size - 1; k++){  
	            result[i][j] = number;  
	            number++;  
	            j--;  
	        }            
	        //递归调用
	        creatMatrix(number, begin + 1, size - 2);  
	    }       
	    //输出结果
	    public void showResult(){  
	        for(int i = 0; i < N; i++){  
	            for(int j = 0; j < N; j++){  
	                System.out.print(result[i][j] + "   ");  
	                if(j == N - 1){  
	                   System.out.println();  //控制每行输出的数字个数，以完成旋转矩阵的样式
	                }  
	            }  
	        }  
	}
}

