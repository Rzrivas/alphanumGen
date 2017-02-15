import java.io.File;
import java.util.Scanner;

public class alphanumGen {
	static void alphanumGen(char set[], String prefix, int n, int k) {
        
        // Base case: k is 0, print prefix
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
 
        // One by one add all characters from set and recursively 
        // call for k equals to k-1
        for (int i = 0; i < n; ++i) {
             
            // Next character of input added
            String newPrefix = prefix + set[i]; 
            // k is decreased, because we have added a new character
            alphanumGen(set, newPrefix, n, k - 1); 
        }
    }

	public static void main(String[] args) {
		alphanumGen b = new alphanumGen();
		char alphanum[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
	    int size = alphanum.length;
	    int len;
	    Scanner reader = new Scanner(System.in);
		System.out.println("Enter a length of key: ");
		len = reader.nextInt();
		System.out.println(len);
	    alphanumGen(alphanum,"",size,len);
	        
	}

}
