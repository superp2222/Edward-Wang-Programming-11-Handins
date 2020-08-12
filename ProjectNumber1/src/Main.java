import org.junit.runners.model.TestClass;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        for(int i=0; i<s.length(); i++){
            //creates a for loop that is the length of the String s
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                /*s
                self explanatory: If the character at i (which increases by 1 increment due to the for loop)
                is a vowel (a, e, i, o, u), then the Answer String increases by 1, counting its occurrence
                 */
                answer++;
            }
        }
        System.out.println("Number of Vowels:" + answer);
        //prints the number of vowels counted
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        //your code here
        for (int i = 0; i < s.length(); i++) {
            //same strategy, scanning each character in a string for the occurrence
            if (s.substring(i).startsWith("bob")) {
                /*s
                In this case, if the substring at the current value of I starts with "bob"
                then answer is incremented to count
                 */
                answer++;
            }
        }
        //prints how many times "bob" is seen
        System.out.println("Bob Occurrences:" + answer);
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        int answer = 0;
        //your code here
        String longest = s.substring(0, 1);
        //this string will denote the longest alphabetical substring
        String current = s.substring(0, 1);
        //this string will denote the current alphabetical substring
        for(int i = 1; i < s.length(); i++) {
            //same string sweeper loop the other two methods used
            if(s.charAt(i - 1) <= s.charAt(i)) {
                //this compares the letters in the substring to the adjacent one using alphabetical value
                current += s.substring(i, i + 1);
                /*s
                now we check if the current substring is longer than the longest substring
                that way, we can match the Longest string to the Current string to guarentee
                the longest alphabetical line
                 */
                if(current.length() > longest.length()) {
                    /*s
                    since there may be multiple alphabetical substrings, this code
                    separately denotes the longest one of them
                     */
                    longest = current;
                }
            } else {
                current = s.substring(i, i + 1);
                //if nothing happens, we give current the value of the letter at i and the one beside it
            }
        }
        System.out.println("Longest Alphabetical Line:" + longest);
        return longest;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
