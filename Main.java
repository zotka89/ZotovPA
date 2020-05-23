package ru.not.Zotov.task3;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		person1.setName("Павел");
		person1.setSurename("Зотов");
		//System.out.print(person1.getName());
		//System.out.println(" " +person1.getSurename());
		Person person2 = new Person();
		person2.setName("Вася");
		person2.setSurename("Пупкин");
		//System.out.print(person2.getName());
		//System.out.println(" " +person2.getSurename());
		PaperMessage pm1 = new PaperMessage();
		pm1.setMessage("Hello," +" " +person1.getName());
		pm1.setFromPostalIndex(603197);
		pm1.setToPostalIndex(603000);
		System.out.println("From " + person2.getName()+ " " + pm1.getFromPostalIndex()+ " To " 
		+ person1.getName() + " " +pm1.getToPostalIndex()+ " Message: " + pm1.getMessage());
		
	}
	
	
}
