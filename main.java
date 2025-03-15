import java.util.*;
import java.io.*:

private int getNum(int lower,int upper){
	int Num=( (int)(lower + upper)/2);
        return Num;
}
public void ComputerGuesser(){
	int lower = 1
	int upper = 100
	int guess = getNum(lower,upper);
	string response = "";

	int turns = 0;
	boolian keepgoing = true;
	while (keepgoing){
	  turns++;

	  system.out.print(turns +")I guess " + guess);
	  system.out.print("too (H)igh,too (Low),or (Correct)");
	  response = input.nextLine();
