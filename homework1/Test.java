/**  
 * @Title: Test.java
 * @Description: 
 * @author LYL
 * @date 2021-01-08 12:50:24
 */  

package homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	/**  
	 * @Description: 编写一个程序，该程序将从命令行参数接受一些字符串值并将这些值存储在ArrayList中。
	 * 倒序显示ArrayList中的内容，然后降序排序并显示该内容（提示：可以运用String 类中的compareTo()方法和冒泡排序法进行比较）
	 * @author LYL
	 * @date 2021-01-08 12:50:25
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		System.out.println("请输入一堆字符：(以0结束)");
		for(;;) {
			String s = sc.next();
			if(!s.equals("0")) {				
				list.add(s);
			}else {
				break;
			}
			
		}
		
		System.out.println("**********************************");
		System.out.println("原来集合中的内容");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("**********************************");
		System.out.println("倒序显示为：");
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
		
//		System.out.println("**********************************");
//		System.out.println("长度降序排列为：");
//		ArrayList list1 = (ArrayList) list.clone();			//复制一个新的集合，以避免更改原来的集合
//		for(int i=0;i<list1.size()-1;i++) {					//循环遍历的次数
//			for(int j=0;j<list1.size()-1-i;j++) {				//比较判断两个数
//				String x = (String) list1.get(j);
//				String y = (String) list1.get(j+1);
//				
//				if(y.length()<x.length()) {
//					String temp = (String) list1.set(j, list1.get(j+1));
//					list1.set(j+1, temp);
//				}
//			}
//			
//		}
//		for(int i=list1.size()-1;i>=0;i--) {
//			System.out.println(list1.get(i));
//		}

		
		System.out.println("**********************************");
		System.out.println("字母顺序降序排列为：");
		ArrayList list2 = (ArrayList) list.clone();			//复制一个新的集合，以避免更改原来的集合
		
		for(int i=0;i<list2.size()-1;i++) {
			for(int j=0;j<list2.size()-1-i;j++) {
				int x = ((String) list2.get(j)).charAt(0);  //拿到集合中相邻位置字符串的第一个字符串中的第一个字符（char型用ASCII编码，所以直接用int接收）
				int y = ((String) list2.get(j+1)).charAt(0);//拿到集合中相邻位置字符串的第二个字符串中的第一个字符  例如第一次循环时拿到（a,ab,abc）中ab的第一个字符a的ASCII编码值97
				if(x>y) {					//如果第一个字符串的字符大于第二个字符串的字符
					String temp = (String) list2.set(j, list2.get(j+1));	//list.set(j, "asd")方法会返回第j个位置未被修改时的数据
					list2.set(j+1, temp);
				}
			}
		}
		for(int i=list2.size()-1;i>=0;i--) {				//循环输出集合中的元素
			System.out.println(list2.get(i));
			
		}
	}

}
