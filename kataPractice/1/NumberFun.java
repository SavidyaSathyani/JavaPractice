public class NumberFun {
  public static void main(String[] args){
	  System.out.println(findNextSquare(121)); //144
	  System.out.println(findNextSquare(30)); //-1
  }
  
  public static long findNextSquare(long sq) {
      long squareRoot = 1;
      long square = 0;
      do{      
        square = squareRoot*squareRoot;
        squareRoot++;
      } while(!(square>=sq));
      
      if(sq==square){
        return squareRoot*squareRoot;
      } else{
        return -1;
      }
  }
}