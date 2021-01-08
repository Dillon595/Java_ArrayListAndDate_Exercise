package homework3;

/**  
 * @ClassName: Person
 * @Description: 编写人类对象，包含属性：姓名，年龄，体重。
			要求实现：  1.对象与对象之间能判断是否相等，所有属性都相等则对象也相等。
			 		2.对象与对象之间能比较大小，先比较年龄，再比较体重，最后比较姓名
				  	3.要求输出该对象时，显示该对象属性的值(toString)

 * @author LYL
 * @date 2021-01-08 14:04:30
*/

public class Person {
	String name;
	int age;
	float weight;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			if(obj == this) {
				return true;
			}
			Person p = (Person)obj;
			if(p.name.equals(this.name)&&p.age==this.age&&p.weight==this.weight) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	
	public Person(String name, int age, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
}
