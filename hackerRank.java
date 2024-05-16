https://leetcode.com/playground/UbVDFZ8c
####################################################################################################################################
Number Line Jumps
the kangaroos meet at the same location (number  on the number line) after same number of jumps ( jumps), and we print YES.


if(v1 > v2){
    int r = (x1 - x2)%(v2-v1);
    if(r == 0){
        return "YES";
    }
}
return "NO";

}

}
####################################################################################################################################
Breaking the Records
 9
10 5 20 20 4 5 2 25 1
Sample Output  2 4

int highestScoreCount = 0;
int lowestScoreCount = 0;
ArrayList<Integer> ans = new ArrayList<>();

int highestScore = scores.get(0);
int lowestScore = scores.get(0);

for(int i=1; i<scores.size(); i++){
    if(scores.get(i)>highestScore){
        highestScore = scores.get(i);
        highestScoreCount++;
    }if(scores.get(i)<lowestScore){
        lowestScore = scores.get(i);
        lowestScoreCount++;
    }
}
ans.add(highestScoreCount);
ans.add(lowestScoreCount);

return ans;
    }

}
####################################################################################################################################
Divisible Sum Pairs

Sample Input

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
Sample Output

 5

 int count = 0;
 for(int i=0; i<n; i++){
     for(int j=i+1; j<n; j++){
         if((ar.get(i)+ar.get(j))%k == 0){
             count++;
         }
     }
 }
 return count;

}

}

####################################################################################################################################
Save the Prisoner!

Sample Input 
2
5 2 1
5 2 2
Sample Output 2
3


int r = m%n;
if((r+s-1)%n == 0)
{
    return n;
}else{
    return ((r+s-1)%n);
}
}
####################################################################################################################################
Monkey Trouble 3(We are in trouble if they are both smiling or if neither of them is smiling. Print TROUBLE if we are in trouble, otherwise print NO TROUBLE.)

Scanner sc = new Scanner(System.in);
boolean aSmile = sc.nextBoolean();
boolean bSmile = sc.nextBoolean();

if(aSmile == true && bSmile == true){
    System.out.print("TROUBLE");
}else if(aSmile == false && bSmile == false){
    System.out.print("TROUBLE");
}else{
    System.out.print("NO TROUBLE");
}
####################################################################################################################################

####################################################################################################################################


####################################################################################################################################

####################################################################################################################################

####################################################################################################################################


####################################################################################################################################


####################################################################################################################################

