class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Character> mapChar=new HashMap<>();

        for(int i=0;i<s.length();i++){

            char a=s.charAt(i);
            char b=t.charAt(i);

            if(!mapChar.containsKey(a)){
                if(!mapChar.containsValue(b)){

                    mapChar.put(a, b);
                }
                else{
                    return false;
                }
            }
            else{

                char mapped=mapChar.get(a);
                if(mapped!=b){
                    return false;
                }
            }
        }
        return true;
    }
}