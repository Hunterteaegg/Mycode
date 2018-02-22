//: containers/SlowMap.java
// A Map implemented with ArrayLists.
package mypackage;

import java.util.*;
import net.mindview.util.*;

public class SlowMap<K,V> implements Map<K,V> {
  private List<K> keys = new ArrayList<K>();
  private List<V> values = new ArrayList<V>();
  public V put(K key, V value) {
    V oldValue = get(key); // The old value or null
    if(!keys.contains(key)) {
      keys.add(key);
      values.add(value);
    } else
      values.set(keys.indexOf(key), value);
    return oldValue;
  }
  public V get(Object key) { // key is type Object, not K
    if(!keys.contains(key))
      return null;
    return values.get(keys.indexOf(key));
  }
  public Set<Map.Entry<K,V>> entrySet() {
    Set<Map.Entry<K,V>> set= new HashSet<Map.Entry<K,V>>();
    Iterator<K> ki = keys.iterator();
    Iterator<V> vi = values.iterator();
    while(ki.hasNext())
      set.add(new MapEntry<K,V>(ki.next(), vi.next()));
    return set;
  }
  public static void main(String[] args) {
    SlowMap<String,String> m= new SlowMap<String,String>();
    m.putAll(Countries.capitals(15));
    System.out.println(m);
    System.out.println(m.get("BULGARIA"));
    System.out.println(m.entrySet());
  }
@Override
public void clear() {
	// TODO 自动生成的方法存根
	keys.removeAll(keys);
	values.removeAll(values);
	
}
@SuppressWarnings("unchecked")
@Override
public boolean containsKey(Object arg0) {
	// TODO 自动生成的方法存根
	return keys.contains((K)arg0);
}
@SuppressWarnings("unchecked")
@Override
public boolean containsValue(Object arg0) {
	// TODO 自动生成的方法存根
	return values.contains((V)arg0);
}
@Override
public boolean isEmpty() {
	// TODO 自动生成的方法存根
	return keys.isEmpty();
}
@Override
public Set<K> keySet() {
	// TODO 自动生成的方法存根
	HashSet<K> keyset=new HashSet<K>();
	
	for(K k:keys)
	{
		keyset.add(k);
	}
	return keyset;
}
@Override
public void putAll(Map<? extends K, ? extends V> arg0) {
	// TODO 自动生成的方法存根
	keys.addAll(arg0.keySet());
	values.addAll(arg0.values());
	
}
@SuppressWarnings("unchecked")
@Override
public V remove(Object arg0) {
	// TODO 自动生成的方法存根
	V result;
	
	if(!keys.contains((K)arg0))
	{
		return null;
	}
	else
	{
		result=values.get(keys.indexOf((K)arg0));
		keys.remove((K)arg0);
		values.remove(result);
	}
	return result;
}
@Override
public int size() {
	// TODO 自动生成的方法存根
	return keys.size();
}
@Override
public Collection<V> values() {
	// TODO 自动生成的方法存根
	return values;
}
} /* Output:
{CAMEROON=Yaounde, CHAD=N'djamena, CONGO=Brazzaville, CAPE VERDE=Praia, ALGERIA=Algiers, COMOROS=Moroni, CENTRAL AFRICAN REPUBLIC=Bangui, BOTSWANA=Gaberone, BURUNDI=Bujumbura, BENIN=Porto-Novo, BULGARIA=Sofia, EGYPT=Cairo, ANGOLA=Luanda, BURKINA FASO=Ouagadougou, DJIBOUTI=Dijibouti}
Sofia
[CAMEROON=Yaounde, CHAD=N'djamena, CONGO=Brazzaville, CAPE VERDE=Praia, ALGERIA=Algiers, COMOROS=Moroni, CENTRAL AFRICAN REPUBLIC=Bangui, BOTSWANA=Gaberone, BURUNDI=Bujumbura, BENIN=Porto-Novo, BULGARIA=Sofia, EGYPT=Cairo, ANGOLA=Luanda, BURKINA FASO=Ouagadougou, DJIBOUTI=Dijibouti]
*///:~
