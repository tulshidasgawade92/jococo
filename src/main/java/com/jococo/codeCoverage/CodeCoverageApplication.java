package com.jococo.codeCoverage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeCoverageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeCoverageApplication.class, args);
	}

	public static boolean isPalindrome(String inputString) {
		if (inputString.length() == 0) {
			return true;
		} else {
			char firstChar = inputString.charAt(0);
			char lastChar = inputString.charAt(inputString.length() - 1);
			String mid = inputString.substring(1, inputString.length() - 1);
			return (firstChar == lastChar) && isPalindrome(mid);
		}
	}
}
