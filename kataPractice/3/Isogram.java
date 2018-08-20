public class Isogram {
  public static void main(String[] args){
	  System.out.println(isIsogram("Dermatoglyphics")); //true
	  System.out.println(isIsogram("moose")); //false  
	  System.out.println(isIsogram("aba")); //false
  }
  
  public static boolean  isIsogram(String str) {
      char[] wordAsArray = str.toLowerCase().toCharArray();
      for(int j=0; j<wordAsArray.length; j++){
          char checkingLetter = wordAsArray[j];
          for(int i=j+1; i<wordAsArray.length; i++){
              if(checkingLetter==wordAsArray[i])
                return false;
          }
      }
      return true;
  }
}