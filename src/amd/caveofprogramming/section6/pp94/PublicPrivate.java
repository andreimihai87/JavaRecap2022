package amd.caveofprogramming.section6.pp94;

public class PublicPrivate {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("Joe");
		person1.setAge(35);
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());

	}

}
