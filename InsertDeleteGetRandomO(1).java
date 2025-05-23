
class RandomizedSet {
 ArrayList<Integer> list;
 HashMap<Integer , Integer> map; 
 Random random = new Random();
    public RandomizedSet() {
     list = new ArrayList<>();
     map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val , list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int ind = map.get(val);
        int lastInd  = list.get(list.size() - 1);

        list.set(ind , lastInd);
        map.put(lastInd , ind);
        list.remove(list.size() -1);
        map.remove(val);
        return true;


        
    }
    
    public int getRandom() {
         return list.get(random.nextInt(list.size()));
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolam_1 = obj.insert(val);
 * boolean param_ean par2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */