/**  
 * @Title: Test.java
 * @Description: 
 * @author LYL
 * @date 2021-01-08 14:33:33
 */

package homework7;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @ClassName: Test
 * @Description: 打印日历表提示： 1.先使用Date或Calendar获得这个月的1号是星期几，用来确定1号前需要几个**
 *               2.然后确定这个月的天数，确定需要打印多少个数字 a) 可以使用条件判断获得天数 b)
 *               可以借用Calendar类的add方法，时间定为到X年X月的1号，先添加一个月，再减去一天，则时间就定为到X年X月的最后一天，获得这一天是几号则可得这个月的天数。
 *               3.每输出7个内容（包含数字与空格）则需要换行。 4.输入年，月实现输出该月的日历
 * 
 *               关键数据： 该月1号是星期几， 该月有多少天
 * 
 * 
 * @author LYL
 * @date 2021-01-08 14:33:33
 */

public class Test {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		int date = 0; // 存放输入的年月后计算得到的1号的星期
		int day_max = 0;// 存放输入的年月的月的天数

		int year = 0;// 用来保存输入的年份
		int month = 0;// 用来保存输入的月份

		Scanner in = new Scanner(System.in);
		System.out.print("请输入年份：");
		year = in.nextInt();
		System.out.print("请输入月份：");
		month = in.nextInt();
		System.out.println("输入的日期为：" + year + "-" + month);
		in.close();

		// 将月份置为下月1号,往前一天,先得到当前月有多少天
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, 1);

		calendar.add(Calendar.DATE, -1);
		day_max = calendar.get(Calendar.DATE);

		// 再将时间设置为1号,是星期几,星期日是0,星期一是1,依次类推
		calendar.add(Calendar.DATE, -(day_max - 1));
		date = calendar.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.println(calendar.getTime());
		printfCalendar(date, day_max);
	}

	/**
	 * 功能：打印一个日历
	 * 
	 * @param start   该月1号是星期几
	 * @param day_max 该月有多少天
	 */
	public static void printfCalendar(int start, int day_max) {
		System.out.println("==================================================");
		// 输出表头
		System.out.print("日\t一\t二\t三\t四\t五\t六\n");

		int day = 1;// 打印的天数
		month: for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				// 打印第一行的时候，空出前start个空间
				if (i == 0 && j < start) {
					System.out.print("\t");
					// 跳出当前次循环
					continue;
				}

				if (day > day_max) {
					System.out.println();
					break month;
				}
				System.out.print(day + "\t");
				day++;
			}
			// 打印完一行后换行
			System.out.println();
		} // for month
		System.out.println("==================================================");
	}

}
