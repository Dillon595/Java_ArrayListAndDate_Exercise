/**  
 * @Title: EmailAddress.java
 * @Description: 
 * @author LYL
 * @date 2021-01-08 13:54:16
 */  

package homework2;

/**  
 * @ClassName: EmailAddress
 * @Description: 
 * @author LYL
 * @date 2021-01-08 13:54:16
*/

public class EmailAddress {
	String name;
	String street;
	String city;
	String state;
	String country;
	String pinCode;
	
	public EmailAddress(String name, String street, String city, String state, String country, String pinCode) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "EmailAddress [\n name：" + name + "\n street：" + street + "\n city：" + city + " state：" + state
				+ "\n country：" + country + "\n pinCode：" + pinCode + "\n]";
	}
	
	
	
}
