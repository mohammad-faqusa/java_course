## 122. Binary Search & Equality Checks: Speedy Lookups and Comparisons in Arrays

### finding a match 
* different algorithms for searching and matching elements 

#### Searching sequentially 
* linear search 
* if the array is sorted, this way is unnecassary, use another algorithm

#### using intervals to Search 
* interval searching 
* one of the most common searches : **binary search** 

#### Arrays.binarySearch()
to use it : 
* the array must be sorted 
* if has duplicates, there's no guarantee to which match on 
* must be comparable 
* returns 
  * the position of a match, if found 
  * -1 if not found 


#### back to Main code in previous project
```java
public class Main {

    public static void main(String[] args) {
        
        // .... 
        String[] sArray = {"able", "Java", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Ralph") >= 0){
            sout("Ralph is in the array");  
        }
        
        int s1 = {1,2,3,4,5}; 
        int s2 = {1,2,3,4,5}; 
//        int s2 = {1,2,3,4,3}; 
//        int s2 = {1,2,3,4,5,0}; 
        
        if(Arrays.equals(s1, s2)){
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }
    }
}
```

#### equal method : 
```jshelllanguage
int s1 = {1,2,3,4,5}; 
int s2 = {1,2,3,4,5}; 

if(Arrays.equals(s1, s2)){
    System.out.println("s1 and s2 are equal");
} else {
    System.out.println("s1 and s2 are not equal");
}
```