class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> seq = new HashSet<>();
        int len = tiles.length();
        boolean[] used = new boolean[len];
        generateSequences(tiles, "",used,seq);
        return seq.size() - 1;
    }
    public void generateSequences(
        String tiles,
        String current,
        boolean[] used,
        Set<String> seq
    ){
        seq.add(current);
        for(int pos=0;pos<tiles.length();pos++){
            if(!used[pos]){
                used[pos]=true;
                generateSequences(
                    tiles,current + tiles.charAt(pos),
                    used,
                    seq
                );
                used[pos] =false;
            }
        }
    }
}