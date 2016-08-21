package practice;

public class Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ANIL";
		System.out.println(name.toLowerCase());
		
		String line = args[0].toLowerCase();
		String searchWord = args[1].toLowerCase();
		
		String[] words = line.split("");
		
		int count = 0;
		for(int i = 0; i < words.length; i++){
			System.out.print(words[i]);
			if(words[i].equals(searchWord)){
				count++;
				
			}
		}
		
		System.out.println("The word " + args[1] + " occurs " + count + " times in the given sentence");

	}

}
