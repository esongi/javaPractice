# 컬렉션 프레임워크

- 컬렉션  
사전적 의미로 요소(객체)를 수집해 저장하는 것  

- 배열의 문제점  
저장할 수 있는 객체 수가 배열을 생성할 때 결정  
불특정 다수의 객체를 저장하기에는 문제  

- 객체 삭제했을 때 해당 인덱스가 비게 됨  
낱알 빠진 옥수수 같은 배열  
객체를 저장하려면 어디가 비어있는지 확인해야 함  

- 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공되는 컬렉션 라이브러리.  
java.util 패키지에 포함  
인터페이스를 통해서 정형화된 방법으로 다양한 컬렉션 클래스 이용  

# List 컬렉션

- 특징  
인덱스로 관리  
중복해서 객체 저장 기능  
- 구현 클래스  
ArrayList, Vector, LinkedList

## LIst 주요 메소드

- 객체 추가  
boolean add(E e) // 주어진 객체를 맨끝에 추가  
void add(int index, E element) // 주어진 인덱스에 객체를 추가  
set(int index, E element) // 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈  

- 객체 검색  
boolean contains(Object o) // 주어진 객체가 저장되어 있는지 여부  
E get(int index) // 주어진 인덱스에 저장된 객체를 리턴  
isEmpty() // 컬렉션이 비어있는지 조사  
int size() // 저장되어 있는 전체 객체수를 리턴  

- 객체 삭제  
void clear() // 저장된 모든 객체를 삭제  
E remove(int index) // 주어진 인덱스에 저장된 객체를 삭제  
boolean remove(Object o) // 주어진 객체를 삭제  

## ArrayList
- 저장 용량(capacity)  
초기 용량: 10(따로 지정 가능)  
저장 용량을 초과한 객체들이 들어오면 자동적으로 늘어남. 고정도 가능  

- 객체 제거  
바로 뒤 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨짐  

- Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴  
asList()로 List를 생성하면 원소를 새롭게 추가할 수 없음  
- List는 내부 구조가 배열로 만들어져 있다. 따라서 asList()를 사용해서 반환되는 List도 배열을 갖게 된다  
이때, asList()를 사용해서 List 객체를 만들 때 새로운 배열 객체를 만드는 것이 아니라, 원본 배열의 주소값을 가져오게 된다.  
따라서 asList()를 사용해서 내용을 수정하면 원본 배열도 함께 바뀌게 되고 원본 배열을 수정하면 그 배열로 만들어뒀던 asList()를 이용한 List 내용도 바뀌게 된다.  
이러한 이유 때문에 Arrays.asList()로 만든 List에 새로운 원소를 추가하거나 삭제 할 수 없다.  
따라서 Arrays.asList()는 배열의 내용을 수정하려고 할 때 List로 바꿔서 편리하게 사용하기 위함.  

## Vector  
List<E> list = new Vector<E>();

- 특징  
Vector는 스레드 동기화(synchronization)  
복수의 스레드가 동시에 Vector에 접근해 객체를 추가, 삭제하더라도 스레드에 안전  

## LinkedList  
List<E> list = new LinkedList<E>();  

- 특징  
인접 참조를 링크해서 체인처럼 관리  
특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞뒤 링크만 변경  
빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 좋은 성능  

