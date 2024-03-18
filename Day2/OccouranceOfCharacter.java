package week2.Day2;

public class OccouranceOfCharacter {

	public static void main(String[] args) {
		String name="Testleaf";
		int count=0;
		
		for(int i=0;i< name.length();i++) {
			char c=name.charAt(i);
			if(c=='e') {
				count++;
			}
		}
		System.out.println("occurance character in" + name + "is:"+ count);

	}

}


