package test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public void forPrint(Map <String,List<Integer>> inner) {
		
		for(Entry<String,List<Integer>> entry:inner.entrySet()) {
		Iterator<Integer> iter=entry.getValue().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.);
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
