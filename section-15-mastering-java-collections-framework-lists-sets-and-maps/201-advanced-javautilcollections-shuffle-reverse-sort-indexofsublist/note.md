## 201. Advanced java.util.Collections: Shuffle, Reverse, Sort, indexOfSubList

### the process 
1. collections.shuffle(deck)
2. print deck 

3. collections.reverse(deck)
4. print deck 

5. sorting algorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit)
6. collections.sort(deck, sorting algorithm) 
7. print deck 
8. collections.reverse 
9. print deck
10. create list of kings (deck.sublist(4,8))
11. printDeck(kings) 
12. create list of tens (deck.subList(16,20))
13. print tens 

14. int subListIndex = Collections.indexOfSublist(deck, tens)
15. print subListIndex 

16. deck.containsAll(tens), print

17. disjoint = collections.disjoint(deck, tens)
18. print disjoint 

18. disjoint2 = collecitons.disjoint(kings,tens)
19. print disjoint 2 

