## 202. Mastering java.util.Collections: binarySearch, frequency, min, max, rotate

### the process 
1. create tenOfHearts card 
2. found index = collections.binarySearch(deck, tensOfHearts, sortingAlgorithm)
3. print found index 
4. error (-53) , the list must be sorted 
5. deck.sort(sortingAlgorithm);
6. print found index
7. create ten of clubs 
8. collections.replaceAll 
9. print sub list 32 to 36 
10. duplicate the replace method , swapping the args 
11. if(Collections.replaceAll) else : 
12. Collections.frequency 
13. Collections.max 
14. Collections.min 
15. create comparator (Sort by Suit, then sort by Rank)
16. create List 'copied' , deck.sublist(0,13)
17. Collections.rotate(copied, 2)
18. print the previous and current status 
19. rotate -2 
20. iterate and Collections.swap 
21. try the reverse and compare to the swap 

#### when to use indexOf , binarySearch
1. use binarySearch if already sorted 
2. other wise indexOf
