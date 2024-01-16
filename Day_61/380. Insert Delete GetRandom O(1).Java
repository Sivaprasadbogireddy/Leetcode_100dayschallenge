class RandomizedSet {
    Set<Integer> rs;

    public RandomizedSet() {
        rs=new HashSet<>();    
    }
    
    public boolean insert(int val) {
        if(!rs.contains(val)){
            rs.add(val);
            return true;
        }
        else
            return false;
    }
    
    public boolean remove(int val) {
        if(rs.contains(val)){
            rs.remove(val);
            return true;
        }
        else
            return false;
    }
    
    public int getRandom() {
        List<Integer> list=new ArrayList<>(rs);
        int i=(int)(Math.random()*(rs.size()));
        return list.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */