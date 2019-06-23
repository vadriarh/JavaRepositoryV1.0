package test;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Task {
	public static void main(String[] args) {
//		Map<Integer, Integer> mathMap=new HashMap<Integer, Integer>();
//		for (int i = 1; i < 11; i++) {
//			mathMap.put(i, 0);
//		}
//		for (int i = 0; i < 1000; i++) {
//			int number=(int)(Math.random()*10)+1;
//			mathMap.put(number,mathMap.get(number)+1);
//		}
//		for (Entry<Integer, Integer> entry : mathMap.entrySet()) {
//			System.out.println("Key = "+entry.getKey()+"   Value = "+entry.getValue());
//		}

		Map<Integer, Map<Integer, Integer>> crazyMap = new HashMap<>();
		for (int i = 1; i < 11; i++) {
			crazyMap.put(i, getMap(100, 10));
		}
		printMap(wordCountMap("lahdf  ahfjaiosdfih afuihf ashf uhfuha hfudufh aauhfdaufhah afh pafh"));
	}

	static Map<Integer, Integer> getMap(int count, int bounds) {
		Map<Integer, Integer> mathMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < count; i++) {
			int number = (int) (Math.random() * bounds) + 1;
			Integer temp = mathMap.get(number);
			if (temp == null) {
				mathMap.put(number, 1);
			} else {
				mathMap.put(number, temp + 1);
			}
		}
		return mathMap;

	}

	@SuppressWarnings("rawtypes")
	static void printMap(Map map) {
		for (Object entry : map.keySet()) {
			System.out.println("Key = " + entry + "   Value = " + map.get(entry));
		}
	}

	static Map<String, Integer> wordCountMap(String str) {
		Map<String, Integer> map = new HashMap<>();
		str.toLowerCase();
		str.split("\\s");

		return map;

	}
}
