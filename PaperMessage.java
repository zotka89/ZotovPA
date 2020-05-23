package ru.not.Zotov.task3;

class PaperMessage extends Message{
	int fromPostalIndex;
	int toPostalIndex;
	public void setFromPostalIndex(int fromPostalIndex) {
		this.fromPostalIndex = fromPostalIndex;
 	}
	int getFromPostalIndex() {
		return fromPostalIndex;
	}
	public void setToPostalIndex(int toPostalIndex) {
		this.toPostalIndex = toPostalIndex;
 	}
	int getToPostalIndex() {
		return toPostalIndex;
	}
}
