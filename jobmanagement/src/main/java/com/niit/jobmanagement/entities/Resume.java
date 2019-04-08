package com.niit.jobmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Resume extends AbstractEntity {

	@OneToOne
	@JoinColumn(name = "userid")
	private User user;

	private byte[] resumefile; 

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public byte[] getResumefile() {
		return resumefile;
	}

	public void setResumefile(byte[] resumefile) {
		this.resumefile = resumefile;
	}
}
