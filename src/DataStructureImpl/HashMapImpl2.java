package DataStructureImpl;

//HashMap is a Array of LinkedList
// it uses bucket to store the nodes of LinkedList
// put(),get(),containsKey(),remove(),size(),keySet()
// put() function adds elements if absent otherwise it'll update the values
// to store key value pair in buckets HashMap uses Concept known as Hashing
// converting data from one form to another form is known as Hashing
// hash function gives bucket index to store element O(LinkedList)
// (n/N)nodes/buckets = lambda (lambda <= k(threshold value))
// as soon as lambda values will be equal or greater than a threshold value no. of buckets increases
// it also known as rehashing
// if n=7, N=4 and k =2 , then n/N = 7/4 = 1.75 which is less than K(2)
// if one more node gets added then n= 8, so n/N= 8/4 = 2 which i equal to k
// but if n= 9 then , n/N = 9/4 = 2.25 which is greater than k, in that case we have to do Rehashing
// so to maintain time complexity to constant we have to keep value of lambda (n/N) less than K for that we have to increase number of buckets
// which means we have to increase size of LinkedList, so value of N will get updated to 8(8 indexes)
// and again put() function called on nodes of LL. to store Nodes on new Array , for that key gets supplied to hashing function as a input , output we get as a index of new bucket where elements gets stored 
// n=9, N=8 , k =2 , n/N = 9/8 = 1.125 < K , so constant TC of put() function gets achieved using rehashing

import java.util.*;

public class HashMapImpl2 {

	static class HashMap<k, v> {// generics
		private class Node {
			k key;
			v value;

			public Node(k key, v value) {
				this.key = key;
				this.value = value;
			}
		}

		private int n; // n - nodes
		private int N; // N - buckets
		private LinkedList<Node> buckets[];

		@SuppressWarnings("unchecked")
		public HashMap() {
			this.N = 4;
			this.buckets = new LinkedList[4];
			for (int i = 0; i < 4; i++) {
				this.buckets[i] = new LinkedList<>();
			}
		}

		private int hashFunction(k key) {
			int bi = key.hashCode();
			return Math.abs(bi) % N;
		}

		private int searchInLL(k key, int bi) {
			LinkedList<Node> ll = buckets[bi];

			for (int i = 0; i < ll.size(); i++) {
				if (ll.get(i).key == key) {
					return i; // di
				}
			}

			return -1;
		}

		@SuppressWarnings("unchecked")
		private void rehash() {
			LinkedList<Node> oldBucket[] = buckets;
			buckets = new LinkedList[N * 2];

			for (int i = 0; i < N * 2; i++) {
				buckets[i] = new LinkedList<>();
			}

			for (int i = 0; i < oldBucket.length; i++) {
				LinkedList<Node> ll = oldBucket[i];
				for (int j = 0; j < ll.size(); j++) {
					Node node = ll.get(j);
					put(node.key, node.value);
				}
			}
		}

		public void put(k key, v value) { // bi= 0 to N-1
			int bi = hashFunction(key);
			int di = searchInLL(key, bi);

			if (di == -1) {// if key dosen't exist
				buckets[bi].add(new Node(key, value));
				n++;
			} else {// if key exists
				Node node = buckets[bi].get(di);
				node.value = value;
			}

			double lambda = (double) n / N;
			if (lambda > 2.0) {
				rehash();
			}
		}

		public v get(k key) {
			int bi = hashFunction(key);
			int di = searchInLL(key, bi);

			if (di == -1) {// if key dosen't exist
				return null;
			} else {// if key exists
				Node node = buckets[bi].get(di);
				return node.value;
			}
		}

		public boolean containsKey(k key) {
			int bi = hashFunction(key);
			int di = searchInLL(key, bi);

			if (di == -1) {// if key dosen't exist
				return false;
			} else {// if key exists
				return true;
			}
		}

		public v remove(k key) {
			int bi = hashFunction(key);
			int di = searchInLL(key, bi);

			if (di == -1) {// if key dosen't exist
				return null;
			} else {// if key exists
				Node node = buckets[bi].remove(di);
				n--;
				return node.value;
			}
		}

		public boolean isEmpty() {
			return n == 0;
		}

		public ArrayList<k> keySet() {
			ArrayList<k> keys = new ArrayList<>();

			for (int i = 0; i < buckets.length; i++) {// bi
				LinkedList<Node> ll = buckets[i];
				for (int j = 0; j < ll.size(); j++) { // di
					Node node = ll.get(j);
					keys.add(node.key);
				}
			}
			return keys;
		}

	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 190);
		map.put("China", 200);
		map.put("US", 500);
		map.put("Canada",300);
		
		ArrayList<String> keys = map.keySet();
		for(int i=0;i<keys.size();i++) {
			System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
		}
		
		map.remove("China");
		System.out.println(map.get("China"));

	}
}
