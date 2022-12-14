# -

## 가끔 쓰는 문법

### 입출력

```kotlin
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))
```

### 출력으로 시간초과나면 => StringBuilder 등 사용해섯 한 방에 출력

### 리스트 정렬

```kotlin
        val list: MutableList<Rank> = ArrayList<Rank>()
        score.forEachIndexed{ index, i -> list.add(Rank(index, i)) }
        list.sortWith (Comparator{ a, b ->
            when {
                a.score == b.score -> a.index - b.index
                else -> b.score - a.score
            }
        })
```

### 2차원 배열 초기화

```kotlin
val reshapeMatrix: Array<IntArray> = Array(r) { i -> IntArray(c) { j -> 0 } }
```

### kotlin에서 3항 연산자(ternary operator)

- 따로 없어서 if, else 나 when으로 처리해야 함

```kotlin
var prev = if (i == 0) 0 else tmp[i - 1]
var next = if (i == flowerbed.size - 1) 0 else tmp[i + 1]
```

### empty list 생성 및 Comparator를 이용한 정렬

```kotlin
        val reorderLogList: MutableList<ReorderLog> = mutableListOf()
        reorderLogList.sortWith { a, b ->
            if (a == b) a.log.compareTo(b.log)
            else a.log.compareTo(b.log)
        }      
```

```kotlin
        reorderLogList.sortWith(
            Comparator { a, b ->
                if (a == b) a.log.compareTo(b.log)
                else a.log.compareTo(b.log)
            }
        )
```

### Comparator 사용

- 조건 여러 개면 when 으로 처리

```kotlin
    val customComparator = Comparator<Int> { a, b ->
        when {
            (a == null && b == null) -> 0
            (a == null) -> -1
            else -> 1
        }
    }
```
