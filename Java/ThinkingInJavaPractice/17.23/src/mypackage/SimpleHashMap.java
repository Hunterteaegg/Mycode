//: containers/SimpleHashMap.java
// A demonstration hashed Map.
package mypackage;

import java.util.*;
import net.mindview.util.*;

public class SimpleHashMap<K,V> implements Map<K,V> {
  // Choose a prime number for the hash table
  // size, to achieve a uniform distribution:
  static final int SIZE = 997;
  // You can't have a physical array of generics,
  // but you can upcast to one:
  @SuppressWarnings("unchecked")
  LinkedList<MapEntry<K,V>>[] buckets =
    new LinkedList[SIZE];
  public V put(K key, V value) {
    V oldValue = null;
    int index = Math.abs(key.hashCode()) % SIZE;
    if(buckets[index] == null)
      buckets[index] = new LinkedList<MapEntry<K,V>>();
    LinkedList<MapEntry<K,V>> bucket = buckets[index];
    MapEntry<K,V> pair = new MapEntry<K,V>(key, value);
    boolean found = false;
    ListIterator<MapEntry<K,V>> it = bucket.listIterator();
    int conflictTimes=0;
    while(it.hasNext()) {
    	conflictTimes++;
    	System.out.println("With "+conflictTimes+" times, "+key+" and existance conflict happened!");
      MapEntry<K,V> iPair = it.next();
      if(iPair.getKey().equals(key)) {
        oldValue = iPair.getValue();
        it.set(pair); // Replace old with new
        found = true;
        break;
      }
    }
    if(!found)
      buckets[index].add(pair);
    return oldValue;
  }
  public V get(Object key) {
    int index = Math.abs(key.hashCode()) % SIZE;
    if(buckets[index] == null) return null;
    for(MapEntry<K,V> iPair : buckets[index])
      if(iPair.getKey().equals(key))
        return iPair.getValue();
    return null;
  }
  public Set<Map.Entry<K,V>> entrySet() {
    Set<Map.Entry<K,V>> set= new HashSet<Map.Entry<K,V>>();
    for(LinkedList<MapEntry<K,V>> bucket : buckets) {
      if(bucket == null) continue;
      for(MapEntry<K,V> mpair : bucket)
        set.add(mpair);
    }
    return set;
  }
  public void clear()
  {
	  for(LinkedList<MapEntry<K, V>> l:buckets)
		  l=null;
  }
  public V remove(Object key)
  {
	  int index=Math.abs(key.hashCode())%SIZE;
	  V result=null;
	  if(buckets[index]==null)
		  return result;
	  for(MapEntry<K, V> iPair:buckets[index])
		  if(iPair.getKey().equals(key))
			  result=iPair.getValue();
			  buckets[index].remove(key);
	
			  return result;
  }
  public static void main(String[] args) {
    SimpleHashMap<String,String> m =
      new SimpleHashMap<String,String>();
    m.putAll(Countries.capitals(25));
    System.out.println(m);
    System.out.println(m.get("ERITREA"));
    System.out.println(m.entrySet());
  }
@Override
public boolean containsKey(Object arg0) {
	// TODO �Զ����ɵķ������
	int index=Math.abs(arg0.hashCode())%SIZE;
	
	if(buckets[index]==null)
	{
		return false;
	}
	else {
		return true;
	}
}
@Override
public boolean containsValue(Object arg0) {
	if(get(arg0)!=null)
	{
		return true;
	}
	else {
		return false;
	}
}
@Override
public boolean isEmpty() {
	// TODO �Զ����ɵķ������
	return false;
}
@Override
public Set<K> keySet() {
	// TODO �Զ����ɵķ������
	Set<K> keySet=new HashSet<K>();
	
	for(LinkedList<MapEntry<K, V>> list:buckets)
		for(MapEntry<K, V> mapEntry:list)
			keySet.add(mapEntry.getKey());
	
	return keySet;
}
@Override
public void putAll(Map<? extends K, ? extends V> arg0) {
	// TODO �Զ����ɵķ������
	for(K key:arg0.keySet())
		put(key, arg0.get(key));
	
}
@Override
public int size() {
	// TODO �Զ����ɵķ������
	int length=0;
	
	for(LinkedList<MapEntry<K, V>> list:buckets)
		for(MapEntry<K, V> map:list)
			length++;
	
	return length;
}
@Override
public Collection<V> values() {
	// TODO �Զ����ɵķ������
	ArrayList<V> values=new ArrayList<V>();
	
	for(K key:keySet())
		values.add(get(key));
	
	return values;
}
} /* Output:
{CAMEROON=Yaounde, CONGO=Brazzaville, CHAD=N'djamena, COTE D'IVOIR (IVORY COAST)=Yamoussoukro, CENTRAL AFRICAN REPUBLIC=Bangui, GUINEA=Conakry, BOTSWANA=Gaberone, BISSAU=Bissau, EGYPT=Cairo, ANGOLA=Luanda, BURKINA FASO=Ouagadougou, ERITREA=Asmara, THE GAMBIA=Banjul, KENYA=Nairobi, GABON=Libreville, CAPE VERDE=Praia, ALGERIA=Algiers, COMOROS=Moroni, EQUATORIAL GUINEA=Malabo, BURUNDI=Bujumbura, BENIN=Porto-Novo, BULGARIA=Sofia, GHANA=Accra, DJIBOUTI=Dijibouti, ETHIOPIA=Addis Ababa}
Asmara
[CAMEROON=Yaounde, CONGO=Brazzaville, CHAD=N'djamena, COTE D'IVOIR (IVORY COAST)=Yamoussoukro, CENTRAL AFRICAN REPUBLIC=Bangui, GUINEA=Conakry, BOTSWANA=Gaberone, BISSAU=Bissau, EGYPT=Cairo, ANGOLA=Luanda, BURKINA FASO=Ouagadougou, ERITREA=Asmara, THE GAMBIA=Banjul, KENYA=Nairobi, GABON=Libreville, CAPE VERDE=Praia, ALGERIA=Algiers, COMOROS=Moroni, EQUATORIAL GUINEA=Malabo, BURUNDI=Bujumbura, BENIN=Porto-Novo, BULGARIA=Sofia, GHANA=Accra, DJIBOUTI=Dijibouti, ETHIOPIA=Addis Ababa]
*///:~
