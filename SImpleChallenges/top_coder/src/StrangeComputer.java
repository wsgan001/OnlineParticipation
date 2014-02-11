public class StrangeComputer
{
	public int setMemory(String mem)
	{
        int index1=0,index0=0,count=0;char curr='0';
        for(int i=0;i<mem.length();i++)
        {
            if(mem.charAt(i)!=curr)
            {
                count++;
                curr=mem.charAt(i);
            }
             }
        return count;

    }
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.8 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		StrangeComputer obj;
		int answer;
		obj = new StrangeComputer();
		long startTime = System.currentTimeMillis();
		answer = obj.setMemory(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p1);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p1;
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
		int p1;
		
		// ----- test 0 -----
		p0 = "0011";
		p1 = 1;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "000";
		p1 = 0;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "0100";
		p1 = 2;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "111000111";
		p1 = 3;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// PROBLEM STATEMENT
	// You have been given a very strange computer.  Its memory consists of several bits, each initially set to 0, and it can only perform the following type of operation:
	// 
	// Choose one of the bits in memory, and choose a value - 0 or 1.  All the bits between the selected bit and the last bit in memory, inclusive, will be set to the chosen value.  For example, if the memory is "0010", and you choose the second bit and a value of 1, the memory will change to "0111".
	// 
	// You are given a String mem.  The number of characters in mem is equal to the number of bits in the computer's memory.  Return the minimum number of operations required to set the computer's memory equal to mem.
	// 
	// DEFINITION
	// Class:StrangeComputer
	// Method:setMemory
	// Parameters:String
	// Returns:int
	// Method signature:int setMemory(String mem)
	// 
	// 
	// CONSTRAINTS
	// -mem will contain between 1 and 50 characters, inclusive.
	// -mem will contain only the characters '0' (zero) or '1' (one).
	// 
	// 
	// EXAMPLES
	// 
	// 0)
	// "0011"
	// 
	// Returns: 1
	// 
	// Choose the third bit and a value of 1.
	// 
	// 1)
	// "000"
	// 
	// Returns: 0
	// 
	// No operations are needed.
	// 
	// 2)
	// "0100"
	// 
	// Returns: 2
	// 
	// 0000 -> 0111 -> 0100
	// 
	// 3)
	// "111000111"
	// 
	// Returns: 3
	// 
	// 
	// 
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.8 (beta) modified by pivanof!