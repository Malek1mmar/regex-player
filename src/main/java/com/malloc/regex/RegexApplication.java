package com.malloc.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegexApplication {
	private static final String VALID_DATE_PATTERN =
			"^\\d{4}-(0[1-9]|1[0-2])-([0-2]\\d|3[01])T([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)$";
	private static final Pattern DATE_PATTERN = Pattern.compile(VALID_DATE_PATTERN);

	public static void main(String[] args) {
		//SpringApplication.run(RegexApplication.class, args);
		// Test cases
		String[] testDates = {
				"2025-07-22T14:45:30", // valid
				"1999-12-31T23:59:59", // valid
				"2025-13-01T00:00:00", // invalid month
				"2025-00-10T12:00:00", // invalid month
				"2025-02-30T10:10:10", // invalid day (Feb 30 doesn't exist, but regex won't catch it)
				"2025-01-01T24:00:00", // invalid hour
				"abcd-ef-ghTij:kl:mn", // completely invalid format
		};

		for (String date : testDates) {
			Matcher matcher = DATE_PATTERN.matcher(date);
			boolean isValid = matcher.matches();
			System.out.println(date + " => " + (isValid ? "Valid" : "Invalid"));
		}
	}
}
