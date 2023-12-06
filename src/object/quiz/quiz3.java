package object.quiz;

public class quiz3 {

	public static void main(String[] args) {
		Dog dog = new Dog("진돗개", "초코");
		System.out.println(dog);
	}

}
class Dog{
	String species;
	String name;
	public Dog(String species, String name) {
		super();
		this.species = species;
		this.name = name;
	}
	@Override
	public String toString() {
		return species + " " + name ;
	}
	
}