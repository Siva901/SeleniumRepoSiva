package week3.day1;

public class Animal {
	
	String animal_name;
	String animal_type;
	
	Animal(String name,String type){
		animal_name=name;
		animal_type=type;
		
	}
	public void sayAboutAnimal() {
		System.out.println("Animal_name :"+animal_name+ " Animal_type :" + animal_type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Lion","Forest");
		animal.sayAboutAnimal();
	}

}
