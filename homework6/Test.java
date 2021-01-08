package homework6;

import java.util.Random;

public class Test {

	/**  
	 * @Description: 利用Random类,随机生成一个int 随机数,long随机数,float随机数,double随机数,高斯随机数,并在屏幕上随机打印.
	 * @author LYL
	 * @date 2021-01-08 15:11:54
	 */

	public static void main(String[] args) {
		Random random = new Random();
		int i1 = random.nextInt();
		System.out.println("int随机数："+i1);
		long l1 = random.nextLong();
		System.out.println("long随机数："+l1);
		float f1 = random.nextFloat();
		System.out.println("float随机数："+f1);
		double d1 = random.nextDouble();
		System.out.println("double随机数："+d1);
		double d2 = random.nextGaussian();
		System.out.println("高斯随机数："+d2);
		
	}

}
