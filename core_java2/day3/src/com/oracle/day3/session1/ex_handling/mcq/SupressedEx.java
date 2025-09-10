package com.oracle.day3.session1.ex_handling.mcq;

class TryEx extends RuntimeException {

}

class FinallyEx extends RuntimeException {

}

public class SupressedEx {

	public static void main(String[] args) {
		 try {
	            foo();
	        } catch (Exception e) {
	            System.out.println(e);
	            
	            // Get suppressed exceptions
	            Throwable[] throwables = e.getSuppressed();
	            for (Throwable t : throwables) {
	                System.out.println(t);
	            }
	        }
	}

	private static void foo() throws Exception {
		Exception t = null;

		try {
			throw new TryEx(); // Custom exception thrown
		} catch (Exception ex) {
			t = ex;
		} finally {
			FinallyEx e = new FinallyEx(); // Another exception created
			if (t != null) {
				e.addSuppressed(t); // Suppress earlier exception
			}
			throw e; // Throw the new exception
		}
	}
}
