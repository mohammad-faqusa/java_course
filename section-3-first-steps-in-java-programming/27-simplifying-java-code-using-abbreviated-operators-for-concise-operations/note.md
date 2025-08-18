## 27. Simplifying Java Code: Using Abbreviated Operators for Concise Operations

### Abbreviating operators

#### Why do we want to use multiple statements in curly braces {} ?

* first, it's a way to group statements together before executing them.
* it allows us to put statements on multiple lines which is more natural and readable
* more closely resembles running code in Java

```jshelllanguage
jshell > {
    ...>int result=1;
    ...>result=result+1;
    ...>System.out.println("result = "+result);
    ...>}
    result=2
```

#### Incrementing by one

`result = result + 1`
but we also have to other shorthand ways to do this

| shorthand (or Abbreviating) operator     | code sample |
|------------------------------------------|-------------|
| Post-fix increment operator              | result++;   |
| compound assignment operator with + sign | result+=1;  |

```jshelllanguage
jshell > int result = result + 1;
    result == > 1

    jshell > result++; // postfix operator
    $3 == > 1

    jshell > System.out.println(result);
    2
```

##### Decrementing by one

`result = result - 1`

| shorthand (or Abbreviating) operator     | code sample |
|------------------------------------------|-------------|
| Post-fix increment operator              | result--;   |
| compound assignment operator with + sign | result-=1;  |

```java
int result = 1;
result--;
        System.out.

println(result);

result-=1;
        System.out.

println(result);
```

#### Compound Assignment Operator Challenge

* init an int variable, named **result** to the value 10
* use compound assignment to subtract a number
* print the result

```jshelllanguage
jshell > int result = 10;
    result == > 10

    jshell > result -= 5.5;
    $6 == > 4

    jshell > System.out.println(result);
    4

    jshell > result = result - 5.5
            | Error:
    |incompatible types:possible lossy conversion from double to int
    |result=result-5.5
    |^----------^

    jshell>result-=5.5
    $9==>4
```

* the compound operator hides the error  
  it may uses casting implicitly

* what if casting ?

using double :

```jshelllanguage
jshell > {
    ...>double result=10;
    ...>result=result-4.5;
    ...>System.out.println(result);
    ...>}
    5.5

    jshell>{
    ...>double result=10;
    ...>result-=4.5;
    ...>System.out.println(result);
    ...>}
    5.5
```

#### the abbreviating operators

| shorhand operator           | code sample |
|-----------------------------|-------------|
| post-fix increment operator | result++    |
| post-fix increment operator | result--    |
| addition compound           | result+=5   |
| subtraction compound        | result-=5   |
| multiplication compound     | result *=5  |
| division compound           | result/=5   |




