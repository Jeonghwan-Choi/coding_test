***DFS 깊이 우선탐색***
-
**DFS: depth-first-search**

* 그래프 완전 탐색 기법중 하나
* 깊이 우선탐색은 그래프의 시작 노드에서 출발하여 탐색할 한 쪽 분기를 정하여 최대깊이까지 탐색을 마친 후 다른 쪽 분기로 이동하여 다시 탐색을 수행하는 알고리즘입니다.

 
* 그래프 완전 탐색
* 재귀 함수로 구현
* 스택 자료구조 이용
* 먼저 들어온 DATA가 나중에 나감


* 깊이 우선 탐색은 실제 구현 시 재귀 함수를 이용하므로 스택오버플로 (stack overflow) 에 유의해야함


* DFS는 한 번 방문한 노드를 다시 분문하면 안 되므로 노드 방문 여부를 체크할 배열이 필요함




**Example**
1. DFS를 시작할 노드를 정한 후 사용할 자료구조 초기화 하기
2. 스택에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 스택에 삽입하기
3. 스택 자료구조에 값이 없을 떄까찌 반복하기
4. 