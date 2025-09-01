## 144. Autoboxing & Unboxing for Arrays & Lists: Working with Wrapper Classes

### back to main code

```java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //.... previous 
        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
    }
}
```

```jshelllanguage
jshell> Integer[] wrapperArray = new Integer[5];
   ...>
wrapperArray ==> Integer[5] { null, null, null, null, null }

jshell> wrapperArray[0] = 50;
$4 ==> 50

jshell>         System.out.println(Arrays.toString(wrapperArray));
[50, null, null, null, null]

jshell> System.out.println(wrapperArray[0].getClass().getName());
java.lang.Integer

jshell> Character[] characterArray = {'a', 'b', 'c'};
characterArray ==> Character[3] { 'a', 'b', 'c' }

jshell> System.out.println(Arrays.toString(characterArray));

```

```jshelllanguage

import java.util.ArrayList;private static 


ArrayList<Integer> getList(int... varargs) {

    ArrayList<Integer> aList = new ArrayList<>(); 
    for (int i : varargs) {
        aList.add(i); 
    }
    return aList; 
}
    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }
    public static void main(String[] args) {

    
    }
```

call the array list method 
```jshelllanguage
var outList = getList(1,2,3,4,5,6); 
```

#### integllij settings 
go to file - settings -> inly hints -> types -> java -> , uncheck implicit 