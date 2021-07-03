class Solution { 
    public boolean isPalindrome (int x) {

if(x<0)

return false;

int sum=0, temp,r;

temp=x; 
while(x!=0) {

r=x%10;

sum=sum*10+r;

x=x/10;
    }
    return temp==sum;
    }
                
                }
        

