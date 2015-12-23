package week1;

public class WordPlay {

	public boolean isVowel(char ch){
		char lowerCase = Character.toLowerCase(ch);

		if (lowerCase == 'a' || 
				lowerCase == 'e' ||
				lowerCase == 'i' ||
				lowerCase == 'o' ||
				lowerCase == 'u' ){
			return true;
		}
		return false;

	}

	public String replaceVowels( String phrase, char ch){
		String replacedPhrase= "" ;

		for (int i =0 ; i< phrase.length(); i++){
			if( isVowel(phrase.charAt(i))){
				replacedPhrase+=ch;
			}else{
				replacedPhrase +=phrase.charAt(i);
			}
		}
		return replacedPhrase;

	}
	public String emphasize(String phrase, char ch){

		String replacedPhrase= "" ;

		for (int i =0 ; i< phrase.length(); i++){
			if( phrase.charAt(i) == ch){
				if (i % 2==0){
					replacedPhrase+='*';
				}else{
					replacedPhrase+='+';
				}
			}else{
				replacedPhrase +=phrase.charAt(i);
			}
		}
		return replacedPhrase;


	}

	public static void main(String arg[])
	{
		WordPlay wp= new WordPlay();
		System.out.println(wp.isVowel('F') == false);
		System.out.println(wp.isVowel('a') == true);
		System.out.println(wp.replaceVowels("Hello World", '*').equals("H*ll* W*rld"));
		System.out.println(wp.emphasize("dna ctgaaactga", 'a').equals("dn* ctg+*+ctg+"));
		
		

	}
}
