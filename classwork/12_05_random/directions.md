## Random

Save here: `.../APCSA1/apcsa-assignments-YourUsername-fakk/classwork/12_05_random/random.txt`

1. Which of the following statements assigns a random integer between 1 and 10, inclusive, to rn ?
```
a. int rn = (int) (Math.random()) * 10;
b. int rn = (int) (Math.random()) * 10 + 1;
c. int rn = (int) (Math.random() * 10);
d. int rn = (int) (Math.random() * 10) + 1;
e. int rn = (int) (Math.random() + 1) * 10;
```
Answer: 

2. Consider the following code segment, which is intended to assign to num a random integer value between min and max, inclusive. Assume that min and max are integer variables and that the value of max is greater than the value of min.

```
double rn = Math.random();
int num = /* missing code */;
```

Which of the following could be used to replace /* missing code */ so that the code segment works as intended?
```
a. (int) (rn * max) + min
b. (int) (rn * max) + min - 1
c. (int) (rn * (max - min)) + min
d. (int) (rn * (max - min)) + 1
e. (int) (rn * (max - min + 1)) + min
```
Answer: 

3. Assume that myList is an ArrayList that has been correctly constructed and populated with objects. Which of the following expressions produces a valid random index for myList?
```
a. (int) ( Math.random () * myList.size () ) - 1
b. (int) ( Math.random () * myList.size () )
c. (int) ( Math.random () * myList.size () ) + 1
d. (int) ( Math.random () * (myList.size () + 1) )
e. Math.random (myList.size () )
```

Answer: 
