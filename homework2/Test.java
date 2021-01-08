package homework2;

import java.util.ArrayList;

/**  
 * @ClassName: Test
 * @Description: 2.	编写一个程序，使用ArrayList存储客户的邮件地址。地址中应该包含姓名、街道、市(县)、省(自治区)、国家(地区)和代码，
 * 然后显示ArrayList中的内容，此程序的输出结果应该如下：(需重写地址类的toString方法)
 * @author LYL
 * @date 2021-01-08 13:51:18
*/

public class Test {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		EmailAddress ea1 = new EmailAddress ("张三","韶山南路","长沙市","湖南省","中国","1001");
		EmailAddress ea2 = new EmailAddress ("李四","韶山西路","长沙市","湖南省","中国","1002");
		EmailAddress ea3 = new EmailAddress ("王五","韶山东路","长沙市","湖南省","中国","1003");

		al1.add(ea1);
		al1.add(ea2);
		al1.add(ea3);
		for(int i=0;i<al1.size();i++) {
			System.out.println(al1.get(i));
		}

	}

}
