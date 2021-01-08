
package homework3;

/**  
 * @ClassName: Test
 * @Description: 
 * @author LYL
 * @date 2021-01-08 14:08:21
*/

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("张三",20,50);
		Person p2 = new Person("张三",20,50);
		Person p3 = new Person("李四",20,50);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1);
		System.out.println(p3);

	}

}
