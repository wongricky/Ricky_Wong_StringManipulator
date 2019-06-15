package stringManipulator;

public class StringManipulator {
	public String trimAndConcat(String str1, String str2) {
		String newString = str1.trim() + ", " + str2.trim();
		return newString;
	}
		
	public Integer getIndexOrNull(String str, char letter) {
		int index = str.indexOf(letter);
		if (index == -1) {
			return null;
		}
		else {
			return index;
		}
	}
	
	public Integer getIndexOrNull(String word, String subString) {
		int index = word.indexOf(subString);
		if (index == -1) {
			return null;
		}
		else {
			return index;
		}
	}
	
	public String concatSubstring(String str1, int num1, int num2, String str2) {
		String newString = str1.substring(num1, num2) + str2;
		return newString;
	}
	
	
	
}
