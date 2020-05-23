package ru.not.Zotov.task3;

class Person {
	String name;
	String surename;
		public void setName(String name) {
				if (name.isEmpty())	{
					System.out.println("Вы не ввели имя");
				} else {
				this.name = name;}
}
			String getName() {
				return name;
}
			public void setSurename(String surename) {
				if (surename.isEmpty())	{
					System.out.println("Вы не ввели фамилию");
				} else {
				this.surename = surename;}
	}
			String getSurename() {
				return surename;
	}


}

