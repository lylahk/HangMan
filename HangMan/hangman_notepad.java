public class HangMan{
	public static void main(String[] args){
		
		//create a list of words to choose from
		String[] words = {"House", "Horse", "Water", "Phone", "Monitor", "Available"};
		
		//Select random word index from words[]
		int randomWordInt = (int) (Math.random() * words.length);
	
		//create array to hold letter guesses made
		char[] guessedLetters = new char[words[randomWordInt].length()];
	
		//count number of guesses
		int letterTried = 0;
		
		//check if word is completely guessed
		boolean guessedWord = false;
		
		//
		
		
		//
		System.out.print(words.length);
	}
}