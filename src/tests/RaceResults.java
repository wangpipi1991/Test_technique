package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RaceResults {
	private Map<String, TimeDuration> map = null;
	public RaceResults() {
		// TODO Auto-generated constructor stub
	}
	public RaceResults(String tagNumber, TimeDuration resultTime) {
		map = new TreeMap<String, TimeDuration>();
	}
	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		map.put(tagNumber, resultTime);
	}
	
	public void printResults() {
		List<Map.Entry<String,TimeDuration>> list = new ArrayList<Map.Entry<String,TimeDuration>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String,TimeDuration>>() {
            public int compare(Entry<String, TimeDuration> t1,
                    Entry<String, TimeDuration> t2) {
                return t1.getValue().toString().compareTo(t2.getValue().toString());
            }
        });
        
        for(Map.Entry<String,TimeDuration> mapping:list){ 
               System.out.println(mapping.getKey()+": "+mapping.getValue()); 
          } 
	}
}
