import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
			List<Person> list = new ArrayList<Person>();
			
			list.add(new Person ("R","Sravya","rsravaya@gmail.com",25));
			list.add(new Person ("D","Aadya","jhuh",24));
			list.add(new Person ("G","Bhavya","jhfukgu",21));
			list.add(new Person ("Y","Kavya","bjhbk",27));
		
			for(Person p:list) {
				System.out.println( p.lastName +""+ p.firstName +"   " + p.emailid +"  " + p.age);
			}
	}

}
