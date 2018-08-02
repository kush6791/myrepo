package com.oracle;

public class Lambda1 {
	
	static String getRevString(RevStr rs, String a){
		return rs.revString(a);
	}
	
	public static void main(String[] args) {
		String str = "abc";
		
		//outStr = stringOp((str) -> str.toUpperCase(), inStr);
		
		//System.out.println(getRevString((s) -> s.toUpperCase(), str));
		
	}
}
