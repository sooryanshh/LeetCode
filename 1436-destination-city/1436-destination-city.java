class Solution {
    public String destCity(List<List<String>> paths) {
        for(List<String> temp : paths){
            String destination = temp.get(1);
            boolean flag = true;
            for(List<String> list : paths){
                if(list.get(0).equals(destination)){
                    flag = false ;
                    break;
                }
            }
            if(flag )return destination ;
            
        }
        return " ";
    }
}