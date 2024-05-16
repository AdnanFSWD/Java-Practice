####################################################################################################################################
WAP to find GCD and LCM of two numbers iteratively

Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int On1 = n1;
        int On2 = n2;
        
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        
        int lcm = (On1 * On2)/gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);

####################################################################################################################################
Decimal to binary

Input: N = 33
Output: 100001

Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
    String bin = "";
while(N != 0){
    int bit = N%2;
    bin = bin + bit;
    N = N/2;
}
for(int i = bin.length()-1; i>=0; i--){
    System.out.print(bin.charAt(i));
}


####################################################################################################################################


