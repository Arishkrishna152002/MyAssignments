package week2.Day2;

public class SplitMethodInArray {

	public static void main(String[] args) {

		String s = "Hi@I@am@new @to@Java@Programming";

		String specialchar = "Hi!I*am#new$to%Java&4564535345Programming98765";

		String name = "Arish Krishna E";

		String[] split = name.split(" ");

		String[] splitbyChar = s.split("");

		String[] split2 = specialchar.split("[^A-Z]");

		String[] split_word = s.split("@");

		for (int i = 0; i < split_word.length; i++) {

			System.out.println(split_word[i]);
		}

		System.out.println("=====================================================");

		for (int i = 0; i < splitbyChar.length; i++) {

			System.out.println(splitbyChar[i]);
		}
		System.out.println("=====================================================");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		System.out.println("======================================================");
		for (int i = 0; i < split2.length; i++) {
			System.out.println(split2[i]);
		}

	}

}
