package ru.not.Zotov.task3;

 class Message {
	 Person from;
	 Person to;
	 String message;
	 	public void setFrom(Person from) {
			this.from = from;
	 	}
		Person getName() {
			return from;
		}
		public void setTo(Person to) {
			this.to = to;
		}
		Person getSurename() {
			return to;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		String getMessage() {
			return message;
		}
}
