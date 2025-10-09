package com.demo;

import org.springframework.stereotype.Service;

@Service(value = "magician")
public class Magician {
	
	public void doEat() throws RuntimeException{
		System.out.println("eating food");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void doMagic() {
		System.out.println("abra ka dabra");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
