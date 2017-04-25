package MySet;
import java.util.*;
public class MySet<V> {
	HashNode<V>[]  buckets;
	private int size;
	private int cur;
	
	public MySet(int _size){
		size = _size;cur = 0;
		buckets = new HashNode[size];
	}
	
	public int hash(V value){
		return value.hashCode()%size;
	}
	public boolean contains(V value){
		HashNode<V> node = buckets[hash(value)];
		while(node!=null){
			if(node.value.equals(value)) return true;
			else node = node.next;
		}
		return false;
	}
	
	public void add(V value){
		if(contains(value)) return;
		int hash = hash(value);
		HashNode<V> node = buckets[hash];
		buckets[hash] = new HashNode<V>(value);
		buckets[hash].next = node;
		cur++;
		
	}
	
	public int Size(){return cur;}
	
	
	class HashNode<K>{
		public K value;
		public HashNode<V> next;
		public HashNode(K _value){
			value = _value;
		}
	}
}
