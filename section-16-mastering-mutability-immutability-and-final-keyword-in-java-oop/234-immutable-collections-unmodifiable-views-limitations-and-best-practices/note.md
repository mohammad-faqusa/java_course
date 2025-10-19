## 234. Immutable Collections, Unmodifiable Views: Limitations and Best Practices

### the process 
1. create student class 
2. create student instances with their notes 
3. create a list of students 
4. copy the students using shallow copy `new ArrayList(students)`
5. print the original and the copied list 
6. edit the notes of any student in original test 
7. run and see the result 
8. **add new student** to the copied list , run and see the result 
9. get notes from a student in copied list and alter it , run and see the result 
10. copy the original list using `List.copyOf`  
this will throw an exception  
```Bash
Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
	at dev.lpa.Main.main(Main.java:23)
```
11. check to sort `studentFirstCopy`

#### List.copyOf vs Collections.unmodifiableList() 
| Feature                            | `Collections.unmodifiableList()` | `List.copyOf()` |
| ---------------------------------- | -------------------------------- | --------------- |
| Modifiable?                        | ❌ No                             | ❌ No            |
| Reflects changes in original list? | ✅ Yes                            | ❌ No            |
| Available since                    | Java 1.2                         | Java 10         |


