package teste;

import java.util.*;
import java.util.stream.*;

class VisitCounter {
	   Map<Long, Long> count(Map<String, UserStats>... visits) {
	       
//         Map<Long, Long> userVisits = new HashMap<Long, Long>();

      	Map<Long, Long> newMap = new HashMap<Long, Long>();
        for(Map.Entry<String, UserStats> entry : visits.entrySet()) {
            if( entry.getKey()!=null){
                newMap.put(Long.parseLong(entry.getKey()), Long.parseLong(entry.getValue().userVisits);
            } 
        }
        return userVisits;
    }
}
