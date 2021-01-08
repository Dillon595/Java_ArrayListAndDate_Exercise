/**  
 * @Title: Test.java
 * @Description: 
 * @author LYL
 * @date 2021-01-08 14:29:27
 */  

package homework5;

import java.util.Date;

/**  
 * @ClassName: Test
 * @Description: 
 * @author LYL
 * @date 2021-01-08 14:29:27
*/

public class Test {
	public static void main(String[] args) {
		Date d1 = new Date(2021,1,8);
		System.out.println(d1);
		System.out.println("从1970年1月1日到"+d1+"已经有"+(d1.getTime()/(24*60*60*1000))+"天了");
	}
}
