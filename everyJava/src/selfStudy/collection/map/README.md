## Map 컬렉션  

- 특징  
키(key)와 값(value)으로 구성된 Entry 객체를 저장하는 구조  
키와 값은 모두 객체  
키는 중복될 수 없지만 값은 중복 저장 가능  

- 구현 클래스  
HashMap, HashTable, LinkedHashMap, Properties, TreeMap  

### Map 컬렉션의 특징 및 주요 메소드  
- 객체 추가  
V put(K key, V value) // 주어진 키와 값을 추가, 저장이 되면 값을 리턴  
- 객체 검색  
boolean containsKey(Object key) // 주어진 키가 있는지 여부  
boolean containsValue(Object value) // 주어진 값이 있는지 여부  
Set<Map.Entry<K,V>> entrySet() // 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴  
V get(Object key) // 주어진 키의 값을 리턴
boolean isEmpty // 컬렉션이 비어있는지 여부  
Set<K> keySet() // 모든 키를 Set 객체에 담아서 리턴  
int size()  // 저장된 키의 총 수를 리턴
Collection<V> values() // 저장된 모든 값 Collection에 담아서 리턴  
- 객체 삭제
void clear() // 모든 Map.Entry(키와 값)을 삭제  
V remove(Object key) // 주어진 키와 일치하는 Map.Enry 삭제, 삭제되면 값을 리턴  

- 기본사용방법  
```java
Map<String, Integer> map = ~;
map.put("홍길동", 30);
int score = map.get("홍길동");
map.remove("홍길동");
```

- 순회 방법 - 키 집합으로 순회하기  
```java
Map<K,V> map = ~;
Set<K> keySet = map.keySet();
Iterator<K> keyIterator = keySet.iterator();
while(keyIterator.hasNext()){
    K key = keyIterator.next();
    V value = map.get(key);
}
```

- 순회 방법 - Entry 집합으로 순회하기   
```java
Set<Map.Entry<K,V>> entrySet = map.entrySet();
Iterator<Map.Entry<K,V>> entryIterator = entrySet.iterator();
while(entryIterator.hasNext()){
    Map.Entry<K,V> entry = entryIterator.next();
    K key = entry.getKey();
    V value = entry.getValue();
}
```  

- 특징
키 객체는 hashCode()와 equals()를 재정의해 동등 객체가 될 조건을 정해야함  
- 키 타입은 String 많이 사용  
String은 문자열이 같을 경우 동등 객체가 될 수 있도록 hashCode()와 equals() 메소드가 재정의되어 있기 때문  