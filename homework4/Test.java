
package homework4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	/**
	 * @Description: 一.使用Date类求获取当前日期,分别使用下以下格式打印: 1)按日期的原格式打印. 2)"当前时间是:
	 *               xxxx年xx月xx日 星期X 北京时间" 3)"当前时间是: xxxx年xx月xx日 时:分:秒"
	 *               3)按欧美日期习惯输出当前日期 ("月-日-年 时:分:秒") 建议使用SimpleDateFormat
	 * 
	 * @author LYL
	 * @date 2021-01-08 14:11:18
	 */

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("原格式为：" + d);
		SimpleDateFormat beijing = new SimpleDateFormat("yyyy 年 MM 月 dd 日 EEEE 北京时间");
		System.out.println("当前时间是："+beijing.format(d));
		
		SimpleDateFormat current = new SimpleDateFormat("yyyy 年 MM 月 dd 日  HH:mm:ss");
		System.out.println("当前时间是："+current.format(d));
		
		SimpleDateFormat europe = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		System.out.println("当前时间是："+europe.format(d));
	}

}
