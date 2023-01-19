package com.jsp.custome_exception;

public class Voting extends NoageLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=16
				;
		
		try {
			if(age<18)
			{
				throw new NoageLimit();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
