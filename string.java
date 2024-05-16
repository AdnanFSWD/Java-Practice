https://leetcode.com/playground/JnEeJrUA
####################################################################################################################################

For loop on a string
        
    Traversal on Character Array
            char[] arr = {'A', 'r', 'c', 'h', 'i', 't'};
            for(int i=0; i<arr.length; i++){
                // In Array, Length is a Property
                System.out.println(arr[i]);
            }
            
            System.out.println();
        
    Traversal on String
            String str = "Archit";
            for(int i=0; i<str.length(); i++){
                // In String, Length is a Function
                // Instead of [] bracket, you have to use charAt()
                System.out.println(str.charAt(i));
            }
        
            // - Use charAt() instead of [] to access a character in a string


####################################################################################################################################
- WAP to print reverse of Array of Characters
            char[] arr = {'M', 'A', 'D'};
            int left = 0, right = arr.length - 1;
            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++; right--;
            }
        
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
####################################################################################################################################
 // - WAP to count vowels in a string.
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            int vowel = 0;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch == 'A' || ch == 'E' || ch == 'I'
                   || ch == 'O' || ch == 'U'
                   || ch == 'a' || ch == 'e' || ch == 'i'
                   || ch == 'o' || ch == 'u'){
                    vowel++;
                }        
            }
            System.out.println(vowel);


####################################################################################################################################
// - WAP to count spaces in a string.
Scanner scn = new Scanner(System.in);
String str = scn.nextLine();

int spaces = 0;
for(int i=0; i<str.length(); i++){
    char ch = str.charAt(i);
    if(ch == ' '){
        spaces++;
    }
}
System.out.println(spaces);

####################################################################################################################################
Inbuilt Sorting
input = MOHAMMED adnan toCharArray
output =   AACDEHMMMOaaaadhnnorrrty


Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // char[] arr = new int[str.length()];
        // for(int i=0; i<str.length(); i++){
        //     arr[i] = sc.charAt(i);
        // }
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);
        
        System.out.println(arr);
####################################################################################################################################
Anagram or not

String x = "he iS ADnAN";
String y = " is He NaNdA";

x = x.replace(" ", "");
y = y.replace(" ", "");

x = x.toLowerCase();
y = y.toLowerCase();

char a[] = x.toCharArray();
char b[] = y.toCharArray();

Arrays.sort(a);
Arrays.sort(b);

Boolean res = Arrays.equals(a,b);

if(res == true)
{
    System.out.println("Anagrams");
}else{
    System.out.println("Not an Anagram");
}

####################################################################################################################################
check if Panagram or not // should contain all letters from a to z atleast once;

String x = "THE QUICK BROwN FOX JUMPS OVER A LAZY dOG";
       
        x = x.replace(" ", "");
       
        x = x.toUpperCase();
        
        char p[] = x.toCharArray();
        int size = p.length;
        
        int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        int i=0;
        while(i != size){
            int index = p[i]-65;
            a[index]=1;
            i++;
        }
        
        i = 0;
        while(i != 26){
            if(a[i] == 1){
                i++;
            }else{
                System.out.println("Not a Panagram");
                // System.exit(0);
                
            }
        }
        System.out.println("Panagram");

####################################################################################################################################
finding the char in string by using index

String x = "he iS ADnAN";

    System.out.println(x.charAt(6));

####################################################################################################################################
 WAP to count the maximum and minimum distance(absolute difference of indices) between two vowels in a string.
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        // Maximum Distance
        int left = -1, right = -1;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                right = i;
                if(left == -1) 
                    left = i;
            }
        }
        
        System.out.println(right - left + 1);
        
//         // Minimum Distance
//         int left = -1, right = -1;
//         int min = Integer.MAX_VALUE;
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
            
//             if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
//                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 left = right;
//                 right = i;
                
//                 if(left != -1 && right - left + 1 < min){
//                     min = right - left + 1;
//                 }
//             }
//         }
        
//         System.out.println(min);
        

####################################################################################################################################
Lower case to Upper case for only single word

String x = "javatpoint";  
        char y[] = x.toCharArray();    
        int size = y.length;   
        
        int i = 0;   
    
        while(i != size){
            y[i] = (char)(y[i]-32);//for upper to lower change - to +
            i++;
        }
        System.out.println(y);   
####################################################################################################################################
from lower to upper (-)|| upper to lower case(+)  for the entire sentence

String x = "javatpoint is the best learning website";  
        char y[] = x.toCharArray();    
        int size = y.length;   
        
        int i = 0;   
    
        while(i != size){
            if(y[i] != ' '){
                y[i] = (char)(y[i] - 32);
            }
            i++;
        }
        System.out.println(y);   

####################################################################################################################################
to convert  1st letter of the each word in the sentence for L to U || U to L

String x = "my name is mohammed adnan";
char y[] = x.toCharArray();
int size = y.length;

y[0] = (char)(y[0]-32);

int i = 1;
while(i != size){
    if(y[i] == ' '){
        y[i+1] = (char)(y[i+1]-32);
        
    }
    i++;
}
System.out.println(y);

o/p = My Name Is Mohammed Adnan
####################################################################################################################################
TO FIND THE COUNT OF VOWELS, CONSONANTS AND SPECIAL CHAR IN THE STRING

String x = "My Name Is Mohammed Adnan$";
        char y[] = x.toCharArray();
        int size = y.length;
        
        int vowcnt = 0;
        int conscnt = 0;
        int splcnt = 0;
        
        int i = 0;
        while(i != size){
            if(y[i]>='a' && y[i]<='z'|| y[i]>='A' && y[i]<='Z'){
                if(y[i] == 'a' || y[i] =='e' || y[i] == 'i' || y[i] == 'o' || y[i] =='u' || y[i] == 'A' || y[i] =='E' || y[i] == 'I' || y[i] == 'O' || y[i] =='U'){
                    vowcnt++;
                }else{
                    conscnt++;
                }
            }else{
                splcnt++;
            }
            i++;
        }
        
        System.out.println(x); // My Name Is Mohammed Adnan$
        System.out.println("vowcnt"+" = "+vowcnt); // vowcnt = 8
        System.out.println("conscnt"+" = "+conscnt); // conscnt = 13
        System.out.println("splcnt"+" = "+splcnt); // splcnt = 5

####################################################################################################################################
VERIFY IF THE STRING CONTAINS ONLY INTEGERS

String x = "adnan";
        char y[] = x.toCharArray();
        int size = y.length;
        
       
        int i = 0;
        while(i != size){
            if(y[i] >= '0' && y[i] <= '9'){
                i++;
            }else{
                System.out.println("Not an int string");
                System.exit(0);
            }
        }
        
        System.out.println("int STRNG");

// adnan = Not an int string
// 8099934 = int STRNG
####################################################################################################################################
Remove Duplicates in String

Scanner scn = new Scanner(System.in);
        String str = scn.next();

        // Version - 1 : Unsorted("mohammedadnan")removes all dupli if two or more and prints only one
        int[] freq = new int[26];
        String output = "";
        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i) - 'a';
            if(freq[idx] == 0){
                output = output + str.charAt(i);
            }
            
            freq[idx]++;
        }
        System.out.println(output); // (mohaedn)


        // Version - 2: Unsorted("mohammedadnan")prints only single char w/o dupli
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i) - 'a';
            freq[idx]++;
        }
        
        String output = "";
        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i) - 'a';
            if(freq[idx] == 1){
                output = output + str.charAt(i);
            }
        }
        System.out.println(output);  // (ohe)

        // Version - 1: Sorted("aaaabbbbccchhdddd") removes all dupli if two or more and prints only one
        String output = "";
        for(int i=0; i<str.length(); i++){
            // Adding the First Occurence of each character
            if(i == 0 || str.charAt(i - 1) != str.charAt(i)){
                output = output + str.charAt(i);
            }
        }
        
        System.out.println(output); //(abchd)


        // Version - 2: Sorted("aaaabbbchhdddde")prints only single char w/o dupli
        String output = "";
        
        for(int i=0; i<str.length(); i++){
            // Adding the First Occurence of each character
            char left = (i - 1 >= 0) ? str.charAt(i - 1) : '0';
            char right = (i + 1 < str.length()) ? str.charAt(i + 1) : '0';
            
            // Unique -> Add it to the answer
            if(str.charAt(i) != left && str.charAt(i) != right) {
                output = output + str.charAt(i);
            }
        }
        
        System.out.println(output); //(ce)



####################################################################################################################################
- WAP to two strings having equal ascii sums. 
Ascii sum is the sum of ascii codes of all characters in the string.


        Scanner scn = new Scanner(System.in);
        String s1 = scn.next(); //1//adnan  //2//micrsoft
        String s2 = scn.next(); //1//nanda  //2//amazon
        
        int sum1 = 0, sum2 = 0;
        for(int i=0; i<s1.length(); i++){
            sum1 = sum1 + s1.charAt(i);
        }
        
        for(int i=0; i<s2.length(); i++){
            sum2 = sum2 + s2.charAt(i);
        }
        
        if(sum1 == sum2) System.out.println(true); //1
        else System.out.println(false); //2


####################################################################################################################################
FOR EACH LOOP (SUM)

Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0; i<x; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        
        for(int data: arr){
            sum += data;
        }
        System.out.println(sum);


####################################################################################################################################
Java program to count occurrences of a word in string

String x = "habeeb My name is habeeb and all my friends call me habeeb My name is habeeb and all my friends call me habeeb";
        String target = "habeeb";
        // int size = x.length();
        String a[] = x.split(" ");
        int count = 0;
        
        for(int i=0; i != a.length; i++){
            if(target.equals(a[i])){
                count++;
            }
        }
        System.out.println(count);
####################################################################################################################################
ACCESSING DATA IN MAP DATA STRUCTURES

String x = "MOHAMMEDADNAN";
        char y[] = x.toCharArray();
        int size = y.length;
        
        Map<Character,Integer> map = new HashMap<>();
        int i=0;
        while(i != size){
            if(map.containsKey(y[i]) == false){
                map.put(y[i],1);
            }else{
                int oldval = map.get(y[i]);
                int newval = oldval + 1;
                map.put(y[i], newval);
            }
            i++;
        }
        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
        for(Map.Entry<Character,Integer> data : hmap){
            System.out.print(data.getKey()+" ");
            System.out.println(data.getValue());
        }

 Output
A 3
D 2
E 1
H 1
M 3
N 2
O 1
####################################################################################################################################
151. Reverse Words in a String

Input: s = "the sky is blue"
Output: "blue is sky the"


####################################################################################################################################
Target String

String "str" = abcde
String "Target" = cdeab



Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2 = sc.next();
if(s1.length()!=s2.length()){
    System.out.print("False");
    return;
}
String s3 = s1+s1;
boolean flag = s3.contains(s2);
if(flag){
    System.out.print("True");
}
else{
    System.out.print("False");
}

####################################################################################################################################
print the substring

Scanner scn = new Scanner(System.in);
        String y = scn.next();
        int n = y.length();
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<= n; j++){
               String ss = y.substring(i, j);
                System.out.print(ss+" ");
            }
        }


####################################################################################################################################
separate words in a string
Scanner scn = new Scanner(System.in);  // abc cde efdg hi j klm nop
        String y = scn.nextLine();
        String[] x = y.split(" ");
        
        for(int i=0; i< x.length; i++){
            System.out.println(x[i]); 
        }

        // abc
        // cde
        // efdg
        // hi
        // j
        // klm
        // nop
####################################################################################################################################
print the palindrome of the sub string

        public static boolean isPalindrome(String s){
            int i = 0;
            int j = s.length()-1;
            while(i <= j){
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(j);
                
                if(ch1 != ch2){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
            return true;
        }
        
        
        public static void solution(String s){
            for(int i=0; i<s.length(); i++){
                for(int j=i+1; j<= s.length(); j++){
                   String ss = s.substring(i, j);
                    if(isPalindrome(ss) == true){
                    System.out.println(ss);
                    }
                }
            }
        }
        
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);  
            String str = scn.nextLine();
            solution(str);
        }
    }

####################################################################################################################################
Isogramic String(if all the letters in the string, occur only once in it.)

public static boolean iso(String x){
    x = x.toLowerCase();
   char y[] = x.toCharArray();
   Arrays.sort(y);

   for(int i=0; i<y.length-1; i++){
           if(y[i] == y[i+1])  
               return false;
       }
   return true;
   }

   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String x = sc.nextLine();
  
   boolean res = iso(x);
   if(res == true){
       System.out.print("Isogram");
   }else{
       System.out.print("Not an Isogram");
   }
####################################################################################################################################
Check Subsequence

Take two Strings str and target as input. Print "True" if str is a subsequence of target else print "False".

Sample Input 0

abc
afbghidc
Sample Output 0

True
Explanation 0

"abc" is a subsequence of "afbghidc", hence output is True.





public static boolean isSubSequence(String str1, String str2,
int m, int n)
{
if (m == 0)
return true;
if (n == 0)
return false;
if (str1.charAt(m - 1) == str2.charAt(n - 1))
return isSubSequence(str1, str2, m - 1, n - 1);
return isSubSequence(str1, str2, m, n - 1);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

String str1 =sc.nextLine();
String str2 = sc.nextLine();
int m = str1.length();
int n = str2.length();
boolean check = isSubSequence(str1, str2, m, n);
if (check)
System.out.println("True");
else
System.out.println("False");
}
####################################################################################################################################
Indices of Most Frequent Character
Consider str as 1-indexing string.

IMPORTANT: If two or more characters have same frequency then consider the lowest character in Lexicographic order.

Sample Input 0

bcasdasb
Sample Output 0

3 6
Explanation 0

In this example "b", "a", "s" are most frequent characters, and a is the lowest in Lexicographic order. Hence the indices of "a" are printed in output.


Scanner sc = new Scanner(System.in);

String str = sc.next();



int[] freq = new int[26];

for(int i = 0; i < str.length(); i++){

int q = str.charAt(i) - 'a';

freq[q] += 1;

}

int max = Integer.MIN_VALUE;

for(int i = 0; i < 26; i++){

if(freq[i] > max){

max = freq[i];

}

}

char ans = 'a';

for(int i = 0; i < 26; i++){

if(max == freq[i]){

ans += i;

break;

}

}

for(int i = 0; i < str.length(); i++){

if(ans == str.charAt(i)){

System.out.print(i+1 + " ");

}

}

####################################################################################################################################
A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

Sample Input = aabbcc
Sample Output = True

Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int freq[] = new int[256];
for(int i=0;i<s.length();i++){
    freq[s.charAt(i)]++;
}
for(int i=1;i<s.length();i++){
    if(freq[s.charAt(i)]!=freq[s.charAt(0)]){
        System.out.print("False");
        return;
    }
}
System.out.print("True");



####################################################################################################################################
Power of a String

Sample Input = abbcccddddeeeeeffgghheecccc
Sample Output = 5
Explanation = Here, Power of string is 5 (eeeee), as it is a substring of maximum length having only one unique character.

public static int power(String s){
    int max = 1, l = 1,i = 1;
    while(i<s.length()){
        while(i<s.length() && s.charAt(i-1) == s.charAt(i)){
            i++;
            l++;
        }if(max<l) 
            max = l;
        if(l == 1) 
            i++;
        l=1;
    }
    return max;
}

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = power(str);
    System.out.println(n);
}
####################################################################################################################################
125. Valid Palindrome

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

public boolean isPalindrome(String s) {
    char[] c = s.toCharArray();
    for (int i = 0, j = c.length - 1; i < j; ) {
        if (!Character.isLetterOrDigit(c[i])) i++;
        else if (!Character.isLetterOrDigit(c[j])) j--;
        else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--])) 
            return false;
    }
    return true;
}

####################################################################################################################################

####################################################################################################################################


####################################################################################################################################



####################################################################################################################################




####################################################################################################################################



####################################################################################################################################


####################################################################################################################################



####################################################################################################################################



####################################################################################################################################

####################################################################################################################################
