int reverse(int x){
    long long int  y=0;
    int k=0;
    
    int  temp=x;
    while(temp){
        temp=temp/10;
        k++;
    }
    int i,j;
    for(j=k-1,i=0;j>=0,i<k;i++,j--){
        
        y=y+(x%10)*(pow(10,j));
        x=x/10;
        
    }
    
    if(y< INT_MIN || y> INT_MAX){
        return 0;
    }
    else 
        return y;

}
