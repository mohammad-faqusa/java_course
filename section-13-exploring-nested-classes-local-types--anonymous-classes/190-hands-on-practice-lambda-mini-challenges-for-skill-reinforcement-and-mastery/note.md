## 190. Hands-On Practice: Lambda Mini-Challenges for Skill Reinforcement and Mastery

### Consumer challenge 
lambda function take a string , then split into array " ", and print the parts in loop 

```jshelllanguage
Consumer<String> consumerLambda  = s -> {
    String[] parts = s.split(" ");
    for(String part : parts) {
        System.out.println(part);
    }
};

consumerLambda.accept("Hello My name is Mohammad Faqusa");
```

#### use forEach

#### concise 
all in single line 

#### mini challenge 2 
write the following in lambda expression 
```jshelllanguage
Function<String, String> lambdaFunction = (s) -> {
    StringBuilder returnVal = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if(i%2==1) {
            returnVal.append(s.charAt(i));
        }
    }
    return returnVal.toString();
};

System.out.println(lambdaFunction.apply("123456789"));
```

#### mini challenge 3 : 
```jshelllanguage

```

#### mini challenge 6: 
* create supplier lambda expression 
* 