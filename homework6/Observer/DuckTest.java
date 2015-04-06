/* @author	Steff Bisinger
 * @file	DuckTest.java
 * @date	4/2/2015 - created
 * @brief	Class that demonstrates the use of DuckConducktor and Duck
 */ 

public class DuckTest{
	
	public void main(){
		DuckConducktor con = new DuckConducktor();
		Duck ducks[] = new Duck[8];
		int i=0;
		///Let's get our ducks in a row. *giggles*
		///Oh, the puns.
		for(i=0; i<8; i++){
			ducks[i] = new Duck(i, con);
		}
		///This is the song we want to play.
		///Currently a crappy rendition of "Mary Had A Little Lamb"
		int song[] = {3,2,1,2,3,3,3,2,2,2,3,3,3,3,2,1,2,3,3,3,3,2,2,3,2,1};
		//Play the song
		i=0;
		for(i=0;i<26;i++){
			con.nextNote(song[i]);
		}
		//Release the Ducks
		i=0;
		for(i=0;i<8;i++){
			ducks[i].unsubscribe();
		}
	}
}
