package com.apex.collections;

import java.util.HashSet;

public class RegistrationHashSet {
	public static boolean register(HashSet<String> set, String email) {
		if(set.contains(email)) {
			System.out.println("Already registered: " + email);
			return false;
		}
		else{
			set.add(email);
			System.out.println("\n"+email+ " registered Successfully");
			return true;
		}
	}

	public static void main(String[] args) {
		HashSet<String> registeredEmails = new HashSet<String>();
		registeredEmails.add("alice@mail.com");
		registeredEmails.add("bob@mail.com");
		registeredEmails.add("carol@mail.com");
		registeredEmails.add("alice@mail.com");
		registeredEmails.add("david@mail.com");
		
		System.out.println("Set size: " +registeredEmails.size());
		
		String email1 = "bob@mail.com";
		String email2 = "eve@mail.com";
		register(registeredEmails, email1);
		register(registeredEmails, email2);
		System.out.println("\ncarol@mail.com exists "+registeredEmails.contains("carol@mail.com"));
		System.out.print("\nAll emails: ");
		registeredEmails.stream().forEach(emails -> System.out.print(emails+" "));
	
	}
}
