
package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
//@Setter
@RequiredArgsConstructor
public class LombokTest {
	
	private final String hoho;
	private final int lombok;
	
	public static void main(String[] args) {
		LombokTest lt = new LombokTest("qwerqwer",21);

		System.out.println(lt.getHoho());
		System.out.println(lt.getLombok());
		
	}
	
}
