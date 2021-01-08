/**  
 * @Title: Test.java
 * @Description: 
 * @author LYL
 * @date 2021-01-08 14:33:33
 */  

package homework6;

import java.util.Scanner;

/**  
 * @ClassName: Test
 * @Description: 打印日历表提示：
1.先使用Date或Calendar获得这个月的1号是星期几，用来确定1号前需要几个**
2.然后确定这个月的天数，确定需要打印多少个数字
a)	可以使用条件判断获得天数
b)	可以借用Calendar类的add方法，时间定为到X年X月的1号，先添加一个月，再减去一天，则时间就定为到X年X月的最后一天，获得这一天是几号则可得这个月的天数。
3.每输出7个内容（包含数字与空格）则需要换行。
4.输入年，月实现输出该月的日历

关键数据：  该月1号是星期几，  该月有多少天


 * @author LYL
 * @date 2021-01-08 14:33:33
*/

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要查看日历的年月");
		int year = sc.nextInt();
		int month = sc.nextInt();
		
	}

}
