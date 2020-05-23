package ru.not.Zotov.task3;

import java.util.Date;

class EmailMessage extends Message  {
	Date sendDate;
	Date reciveDate;
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
 	}
	Date getSendDate() {
		return sendDate;
	}
	public void setReciveDate(Date reciveDate) {
		this.reciveDate = reciveDate;
 	}
	Date getReciveDate() {
		return reciveDate;
	}
}
