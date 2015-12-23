package week1;

public class CaesarCipher {
  public String encrypt( String input, int key){
	  String encripted = "";
	  for (int i = 0; i< input.length(); i++){
		encripted += (char)((Character.getNumericValue(Character.toLowerCase(input.charAt(i)))+key))  ;
		  
	  }  
	  
	 return encripted;
  }
  
  public static void main(String args[]){
	  
	  CaesarCipher c= new CaesarCipher();
	  System.out.println(c.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));

	

	  }
}
