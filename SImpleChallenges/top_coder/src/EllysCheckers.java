import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class EllysCheckers
{
	public String getWinner(String board)
	{
        int dist = 0;
        for (int i=0; i<board.length();i++)
            if(board.charAt(i)=='o')
                dist+=(board.length()-i-1);
        return (dist%2== 0)?"NO":"YES";

    }
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.8 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, String p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		EllysCheckers obj;
		String answer;
		obj = new EllysCheckers();
		long startTime = System.currentTimeMillis();
		answer = obj.getWinner(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p1 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p1);
		}
		if (!res) {
			System.out.println("DOESN'T MATCH!!!!");
		} else if ((endTime - startTime) / 1000.0 >= 2) {
			System.out.println("FAIL the timeout");
			res = false;
		} else if (hasAnswer) {
			System.out.println("Match :-)");
		} else {
			System.out.println("OK, but is it right?");
		}
		System.out.println("");
		return res;
	}
	public static void main(String[] args) {
		boolean all_right;
		all_right = true;
		
		String p0;
		String p1;
		
		// ----- test 0 -----
		p0 = ".o...";
		p1 = "YES";
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "..o..o";
		p1 = "YES";
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = ".o...ooo..oo..";
		p1 = "NO";
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "......o.ooo.o......";
		p1 = "YES";
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = ".o..o...o....o.....o";
		p1 = "NO";
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// PROBLEM STATEMENT
	// Elly and Kriss play a game. The game is played on a single row that consists of N cells; we will call it the board. The cells of the board are numbered 0 through N-1, from the left to the right. Each cell of the board is either empty or occupied by a single checker. The girls take alternating turns, until one of them cannot make a move. The girl who is unable to make a move loses the game.
	// 
	// In each move the current player selects a cell containing a checker and performs one of the following two types of moves:
	// 
	// A step, in which the checker is moved one cell to the right. The step can only be made if the target cell is empty.
	// A jump, in which the checker jumps three cells to the right. The jump can only be made if the target cell is empty and the cells it jumped over contain two other checkers.
	// 
	// Once a checker reaches the rightmost cell, it disappears immediately and no longer plays any role in the game.
	// 
	// The initial layout of the board will be given as a String board. The i-th character of board will be '.' (a period) if the i-th cell is empty at the
	// beginning, and it will be 'o' (lowercase letter o) if the i-th cell initially contains a checker. Assume that both girls play optimally. Return "YES" (quotes for clarity) if the first player wins the game and "NO" otherwise.
	// 
	// DEFINITION
	// Class:EllysCheckers
	// Method:getWinner
	// Parameters:String
	// Returns:String
	// Method signature:String getWinner(String board)
	// 
	// 
	// NOTES
	// -If there is a checker on the rightmost cell in the beginning of the game, it disappears instantly (before the first move is made), as if it were never there.
	// -The rules of the game ensure that each cell contains at most one checker at any time, and that no checker can jump beyond the last cell.
	// 
	// 
	// CONSTRAINTS
	// -board will contain between 1 and 20 characters, inclusive.
	// -Each character of board will be either '.' or 'o'.
	// 
	// 
	// EXAMPLES
	// 
	// 0)
	// ".o..."
	// 
	// Returns: "YES"
	// 
	// With only one checker it is pretty obvious who will win.
	// 
	// 1)
	// "..o..o"
	// 
	// Returns: "YES"
	// 
	// Don't forget to ignore checkers on the rightmost cell.
	// 
	// 2)
	// ".o...ooo..oo.."
	// 
	// Returns: "NO"
	// 
	// Here one can jump the checker from cell 5 to cell 8.
	// 
	// 3)
	// "......o.ooo.o......"
	// 
	// Returns: "YES"
	// 
	// 4)
	// ".o..o...o....o.....o"
	// 
	// Returns: "NO"
	// 
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.8 (beta) modified by pivanof!
