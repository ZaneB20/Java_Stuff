import java.util.*;
import java.io.*:

public class Guesser {
   public static void main(String[] args){
      new Guesser ();
   } // end main 

   public Guesser(){
          try {
                  File theFile = new File("poem.txt");
                  Scanner input = new Scanner(theFile);
		            while (input.hasNext()){


private int getNum(int lower,int upper){
