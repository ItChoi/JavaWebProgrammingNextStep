package test.next.step;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import test.next.step.exception.NegativeNumberException;

public class StringCalculator {
	public int returnNumber(String number) {

		int sum = 0;
		
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(number);
		String[] split;
		String separate;
		if (m.find()) {
			separate = m.group(1);
			split = m.group(2).split(separate);
			
		} else {
			split = number.split(",|:"); 
		}
		
		return sumMethod(split);
	}
	
	public int sumMethod(String[] split) {
		int sum = 0;
		for (String a : split) {
			if (a.indexOf("-") != -1) {
				throw new NegativeNumberException("음수는 사용할 수 없다.");
			}
			
			sum += Integer.parseInt(a);
		}
		
		return sum;
	}
}
