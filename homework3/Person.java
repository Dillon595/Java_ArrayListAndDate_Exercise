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
		if(obj instanceof Person) {		//首先判断传入的对象是不是Person类型，若不是直接返回false
			if(obj == this) {		//判断两个对象的地址值是否相同，若地址值相同则必定相等
				return true;
			}
			Person p = (Person)obj;		//先将传入的对象转换成Person类型才能比较
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
