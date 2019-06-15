package stringManipulator;

public class StringManipulatorTest {

	public static void main(String[] args) {
		StringManipulator mani1 = new StringManipulator();
		String str = mani1.trimAndConcat("    Hello     " , "     World    ");
		System.out.println(str); // HelloWorld 
		
		StringManipulator mani2 = new StringManipulator();
		char letter = 'o';
		Integer a = mani2.getIndexOrNull("Coding", letter);
		Integer b = mani2.getIndexOrNull("Hello World", letter);
		Integer c = mani2.getIndexOrNull("Hi", letter);
		System.out.println(a); // 1
		System.out.println(b); // 4
		System.out.println(c); // null
		
		StringManipulator mani3 = new StringManipulator();
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer aa = mani3.getIndexOrNull(word, subString);
		Integer bb = mani3.getIndexOrNull(word, notSubString);
		System.out.println(aa); // 2
		System.out.println(bb); // null

		StringManipulator mani4 = new StringManipulator();
		String newWord = mani4.concatSubstring("Hello", 1, 4, "world");
		System.out.println(newWord); // eworld

	}
}
