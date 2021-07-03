class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I',1);
        romanNumerals.put('V',5);
        romanNumerals.put('X',10);
        romanNumerals.put('L',50);
        romanNumerals.put('C',100);
        romanNumerals.put('D',500);
        romanNumerals.put('M',1000);
        
        int i = 0, result = 0;
        while(i < s.length()){
            int ch1Value = romanNumerals.get(s.charAt(i));
            if((i+1) < s.length()){ 
                int ch2Value = romanNumerals.get(s.charAt(i+1));
                int diff = ch2Value - ch1Value;
                if(diff > 0){
                    if(diff == 4 || diff == 9 || diff % 40 == 0 || diff % 90 == 0)
                        result += diff;
                    i += 2; 
                }else{
                    result += ch1Value;
                    i += 1;
                }
            }else{
                result += ch1Value;
                i += 1;
            }
               
        }
        return result;
    }
}
