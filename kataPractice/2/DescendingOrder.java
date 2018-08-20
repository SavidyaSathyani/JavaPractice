public class DescendingOrder {
  public static void main(String[] args){
	  System.out.println(sortDesc(21445 )); //54421
	  System.out.println(sortDesc(145263 )); //654321 
  }
  
  public static int sortDesc(final int num) {
    char[] numberArray = Integer.toString(num).toCharArray();
    for(int j=0; j<numberArray.length; j++){
        int maxIndex = j;
        for(int i=j; i<numberArray.length; i++){
            if(numberArray[i]>numberArray[maxIndex]){
                maxIndex = i;
            }
        }
        char temp = numberArray[j];
        numberArray[j] = numberArray[maxIndex];
        numberArray[maxIndex] = temp;
    }
    
    return Integer.parseInt(String.valueOf(numberArray));
  }
}