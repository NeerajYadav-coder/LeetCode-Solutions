public int hIndex(int[] citations) {
    Arrays.sort(citations);
    int n = citations.length;

for(int i = 0 ; i < citations.length; i++){
    int h = n - i;
    if(citations[i] >= h){
        return h;
    }
}
return 0;
}