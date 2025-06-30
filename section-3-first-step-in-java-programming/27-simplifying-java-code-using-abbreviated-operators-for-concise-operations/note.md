## why do we use multiple statements in {}

groubing the code together before executing, especially in JShell

more readable

executes the group as a whole, which more closely resembles running code in Java

```bash
jshell> {
   ...>     int result = 1;
   ...>     result = result + 1;
   ...>     System.out.println(result);
   ...> }
2
```

## incrementing

- increment by one : result++, or ++result
- increment by number : result += number

## decrementing

- by one : result-- or --result
- by number : result -= number
-

## exmaples

postfix increment :

```bash
jshell> {
   ...>     int result = 2;
   ...>     result++;
   ...>     System.out.println("Resutl : " + result);
   ...> }
Resutl : 3

jshell> {
   ...>     int result = 2;
   ...>
   ...>     System.out.println("Resutl : " + result++);
   ...> }
Resutl : 2
```

prefix increment :

```bash
jshell> {
   ...>     int result = 2;
   ...>
   ...>     System.out.println("Resutl : " + ++result);
   ...> }
Resutl : 3
```

## Compound Assignment Operator Challange

```bash
jshell> {
   ...>     int result = 10;
   ...>     result -= 3;
   ...>     System.out.println("Result : " + result);
   ...> }
Result : 7
```

```bash
jshell> {
   ...>     int result = 10;
   ...>     result -= 5.5;
   ...>     System.out.println("Result : " + result);
   ...> }
Result : 4

jshell> {
   ...>     int result = 10;
   ...>     result = result - 5.5;
   ...>     System.out.println("Result : " + result);
   ...> }
|  Error:
|  incompatible types: possible lossy conversion from double to int
|      result = result - 5.5;
|               ^----------^

jshell> {
   ...>     int result = 10;
   ...>     result =(int) result - 5.5;
   ...>     System.out.println("Result : " + result);
   ...> }
|  Error:
|  incompatible types: possible lossy conversion from double to int
|      result =(int) result - 5.5;
|              ^----------------^

jshell> {
   ...>     int result = 10;
   ...>     result =(int)( result - 5.5);
   ...>     System.out.println("Result : " + result);
   ...> }
Result : 4
```

### so compound assignment use casting automatically

```
int result -= 5.5
// same for :
int result = (int) (result - 5.5)
```
