class Solution {
    private void paran( String current , int open , int closed , int total , List<String> answer ){

        if( current.length()==2*total){
            answer.add(current);
            
        }

        if( open < total ){
            paran( current + "(" , open + 1 , closed , total , answer);
        }

        if( closed<open){
            paran( current + ")" , open , closed+1 , total , answer);
        }
        
    }

    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        paran("" , 0 , 0 , n , answer);
        return answer;
    }
}