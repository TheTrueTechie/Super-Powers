
public class Person {
	private String nameOfPerson;
	private String superPower;

	public static void main(String[] args) {
		Person VeggieMan = new Person("VeggieMan", "Vegeterian Powers");
		Person VeganMan = new Person("VeganMan", "Vegan Powers");
		System.out.println(VeggieMan);
	}

	Person(String nameOfPerson, String superPower) {
		this.nameOfPerson = nameOfPerson;
		this.superPower = superPower;
	}

	@Override
	public String toString() {
	return String.format("Hello my name is %s I turn people into Vegeterians!", nameOfPerson);	
	}

	

	public String getNameOfPerson() {
		return nameOfPerson;
	}

	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
	}

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

}
