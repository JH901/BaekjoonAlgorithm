package bfs_dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class num {
	static List<String> list = new ArrayList<String>();
	static Map<Integer, String> m = new HashMap<Integer, String>();
	static Map<String, Integer> m_r = new HashMap<String, Integer>();
	static boolean[][] map = new boolean[10000][10000];

	public static void main(String[] args){
    	String[][] tickets = {{"ICN", "SFO"},
    	                      {"ICN", "ATL"},
    	                      {"SFO", "ATL"},
    	                      {"ATL", "ICN"},
    	                      {"ATL","SFO"}};
        String A, B;
        int a, b;
        for(int i=0; i<tickets.length; i++){
            A = tickets[i][0];
            B = tickets[i][1];
            
            if(!list.contains(A)) list.add(A);
            if(!list.contains(B)) list.add(B);
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        for(int i=0; i<list.size(); i++){
        	System.out.println(answer[i]);
            m.put(i,answer[i]);
            m_r.put(answer[i],i);
        }
        
        for(int i=0; i<tickets.length; i++){
            A = tickets[i][0];
            B = tickets[i][1];
            
            a = m_r.get(A);
            b = m_r.get(B);
            
            map[a][b] = true;
        }
        list.clear();
        dfs("ICN");
        String[] answer2 = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer2[i] = list.get(i);
            System.out.print(list.get(i)+" ");
        }
        
    }

	public static void dfs(String airport) {
		list.add(airport);
		int a = m_r.get(airport);
		for (int i = 0; i < m.size(); i++) {
			if (map[a][i] == true) {
				map[a][i] = false;
				dfs(m.get(i));
				break;
			}
		}

	}
}


