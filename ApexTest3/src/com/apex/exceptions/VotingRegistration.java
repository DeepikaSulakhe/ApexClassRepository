package com.apex.exceptions;

public class VotingRegistration {

	public static void main(String[] args) {
		try {
			registerVoter("Alice",22);
			registerVoter("Bob", 16);
			
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
			try {
				registerVoter("Carol",25);
			} catch (UnderAgeException e1) {
				System.out.println(e.getMessage());
			}
		}finally {
			System.out.println("Registration process completed.");
		}

	}

	private static void registerVoter(String name, int age) throws UnderAgeException {
		if(age > 18 ) {
			System.out.println("Registered: " + name);
		}else {
			throw new UnderAgeException(name+ " is too young. Age: " +age);
		}
		
	}

}
