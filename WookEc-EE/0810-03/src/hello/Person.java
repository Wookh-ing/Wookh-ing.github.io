package hello;

public class Person {
	private int personId;
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(int personId, String name,
			int age) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + "]";
	}


	
}
