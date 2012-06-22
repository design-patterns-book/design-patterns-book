package edu.dpb.ch24.i04.exercises.ex04.mailinglist.aspects;

import java.util.Date;

public class EmailUser implements Observer {
	// callback
	private MailingList mailingList;
	private Role role;

	public EmailUser(MailingList mailingList, Role role) {
		this.mailingList = mailingList;
		this.role = role;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public void update() {
		String from = mailingList.getFrom();
		String subject = mailingList.getSubject();
		Date date = mailingList.getDate();
		String body = mailingList.getBody();

		System.out.println("[" + role
				+ "][EmailUser] Received Email message:\n\tFROM: " + from
				+ "\n\tSUBJECT: " + subject + "\n\tDATE: " + date
				+ "\n\tBODY: " + body + "\n");
	}

	@Override
	public Subject getSubject() {
		return mailingList;
	}

	@Override
	public String toString() {
		return "EmailUser";
	}

}
