## SET 컬렉션  

- 특징  
수학의 집합에 비유
저장 순서가 유지되지 않음  
객체를 중복 저장 불가  
하나의 null만 저장 가능  

- 구현 클래스  
HashSet, LinkedHashSet, TreeSet  

###  Set 컬렉션의 특징 및 주요 메소드  

- 객체 추가
boolean add(E e) // 주어진 객체를 저장, 객체가 성공적으로 저장되면 true를 리턴하고 중복 객체면 false를 리턴  
- 객체 검색  
boolean conains(Object o) // 주어진 객체가 저장되어 있는지 여부  
isEmpty() // 컬렉션이 비어 있는지 조사  
Iterator<E> iterator() // 저장된 객체를 한번씩 가져오는 반복자 리턴  
int size() // 저장되어있는 전체 객체수 리턴  
- 객체 삭제  
void clear() // 저장된 모든 객체를 삭제  
boolean remove(Object o) // 주어진 객체를 삭제  

- 전체 객체 대상으로 한 번씩 반복해 가져오는 반복자(Iterator) 제공  
인덱스로 객체를 검색해서 가져오는 메소드 없음  

boolean 리턴 - hasNext() // 가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴한다  
E 리턴 - next() // 컬렉션에서 하나의 객체를 가져온다  
void 리턴 - remove() // Set 컬렉션에서 객체를 제거한다  

```java
Set<String> set = ...;
Iterator<String> iterator = set.iterator();
while(iterator.hasNext()){
    //String 객체 하나를 가져옴
    String str = iterator.next(); // 저장된 객체 수만큼 루핑
}
```

- 향상된 for 문으로 대체 가능  
```java
Set<String> set = ...;
for(String str:set){

} // 저장된 객체 수만큼 루핑
```

### HashSet  
Set<E> set = new HashSet<E>();  
- 특징
동일 객체 및 동등 객체는 중복 저장하지 않음  
동등 객체 판단 방법  
hashCode() 리턴값 >> equals() 리턴값 >> 동등 객체  

