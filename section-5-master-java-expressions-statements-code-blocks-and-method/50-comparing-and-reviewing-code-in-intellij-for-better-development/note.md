## 50. Comparing And Reviewing Code In IntelliJ For Better Development

### introduction 
compare code methods helps alot for studying  
it save time for comparing from videos 

### the process 
1. from previous example  
this is the old code : 
```jshelllanguage
    public int calculateHighScorePosition(int playerScore) {

    int position = 4;
    if (score >= 1000) {
        position = 1;
    } else if (score >= 500) {
        position = 2;
    } else if (score > 100) {
        position = 3;
    }
    return position;
}
```
2. this is the new code in another file  : 
```jshelllanguage
    public int calculateHighScorePosition(int playerScore) {

    int position = 0;
    if (score >= 1000) {
        position = 1;
    } else if (score >= 500) {
        position = 10;
    } else if (score > 100) {
        position = 3;
    }
    return position;
}
```
3. keep on new code window tap
4. on project panal select the old file : 
   * click right
   * compare 
   * compare to your new file code you are in 
5. now you have two windows for comparing the code
6. switch to `unified viewer`
7. you can click on `arrows` to unify the changes 

#### show history of file 
* on project panal 
* select the file , mouse click right 
* history -> show history 
* you  can revert to previous versions 
  * by right click on document history -> revert

#### comparison 
* you can also compare the contents of entire folders 
* 