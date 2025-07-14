package com.dayFour.inheritance;

public class MultiLevelnheritanceDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Jack", 9568412772L);
		System.out.println(p1);
		
		p1 = new Employee("Anna", 8567412337L,"Sales",96470);
		System.out.println(p1);
		
		p1 = new LevelOneEmployee("Sam",8974512466L,"IT", 100000,100,"Signing Authority");
		System.out.println(p1);

	}
 
}
