package com.POD5.controller;

import java.util.Comparator;

import com.POD5.model.UserAccount;

public class AccountComparator implements Comparator<UserAccount> {
	@Override
	public int compare(UserAccount u1, UserAccount u2) {
		return u1.getLastName().compareTo(u2.getLastName());
		
	}
}