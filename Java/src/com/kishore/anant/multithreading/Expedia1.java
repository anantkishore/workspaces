package com.kishore.anant.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Expedia1 {


    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);

        customSort(list);

    }

    public static void customSort(List<Integer> arr) {
        
        Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        arr.forEach(item -> {
            if(intMap.containsKey(item))
            {
                int freq = intMap.get(item);
                intMap.put(item, freq+1);
            }
            else
                intMap.put(item, 1);
        }
        );
        Set<Map.Entry<Integer, Integer>> entrySet = intMap.entrySet();
        Collections.sort(entrySet, (o1, o2) -> getKey());

    }

}



class Result implements Comparable<Result>{

    private Integer key;
    private Integer value;

    public Result(int keyParam){
        this.key = keyParam;
        this.value = 1;
    }
    
    public Integer getKey(){
        return this.key;
    }

    public Integer getValue() {
        return this.value;
    }

    public void incrementValue(){
        this.value += 1;
    }

    @Override
    public boolean equals(Object o){
    	if(o instanceof Result)
    		return (this.key.compareTo(((Result) o).getKey()) == 0) ? true: false;
		return false;
    }

    public int compareTo(Result r)
    {
        int val = this.getKey().compareTo(r.getKey());
        if(val == 0)
        {
            return this.getValue().compareTo(r.getValue());
        }
        return val;
    }

    /*
     * Complete the 'customSort' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void customSort(List<Integer> arr) {
        
        Map<Integer, Result> map = new TreeMap<Integer, Result>();
        arr.forEach(item -> {
           
            if(map.containsKey(item)){
                map.get(item).incrementValue();
            }
            else
            {
            	map.put(item, new Result(item));
            }
        });
        List<Result> list = new ArrayList<>();
        for(Result result : map.values())
        {
            list.add(result);
        }
        Collections.sort(list);
        
        
        

    }

}