package com.tyss.java.revisions;

public final class ImmutableEx {

	final String name;
	final int regNo;

	public ImmutableEx(String name, int regNo) {

		this.name = name;
		this.regNo = regNo;

	}

	public String getName() {

		return name;
	}

	public int getRegNo() {
		return regNo;
	}

}
