### SuperArray

You will create a class SuperArray. It must allow to create a dynamic String array giving you the option to resize the array.

## Instance variables

You must declare the following instance variables:

```
data => Array of String
size => Number of actual elements in the array
```

## Constructors

You must implement 2 constructors:

- Default constructor(no arguments) which creates an empty SuperArray. Empty means no elements. You only initilize the array with a initial capacity (length) of 10. This means 10 is the maximum capacity.

```
public SuperArray(){  
  // YOUR CODE HERE
}
```

```
public SuperArray(int initialCapacity){  
  // YOUR CODE HERE
}
```


**IMPORTANT:** size and initialCapacity(array length) are not the same.

initialCapacity: It is array.length. The number you specify when you create the array.

size: Actual values added to the array.


## Methods

### public int size()

It returns the number of **actual** elements added to the SuperArray. Rember this value it is **NOT** the capacity. 

### public boolean add(String value)

If there is space in the array, the element should be added and true is returned.
If there is no space available to add a new element, you must call the resize() method before adding. 

### public String toString()
  
It returns a String like this: "[hello, hola, bonjour]"
Use comma-space separated values, with square brackets around everything. An empty SuperArray would be just "[]".

### public String get(int index)
  
It returns the value at the specified index. If the index is not valid (index is less than 0, or index is size() or greater) print an error and return null. 

### public String set(int index, String newValue)
  
It changes the element at index to newValue, and return the value you replaced. If the index is not valid (index is less than 0, or index is size() or greater) print an error, return null and do not modify the list. 

### public String remove(int index)

It removes the element at the specified index. Shift all elements to the left to fill in the gap. If the index is not valid (index is less than 0, or index is size() or greater) print an error and return null. If no error with the index, return the value that you removed when the index was valid. 
 
### public boolean remove(String target)

It removes the leftmost element that has the same value as the target string. Shift all elements to the right of that index to the left to fill in the gap. Return true if the element was present and removed, false if it was not found. 

### private void resize()

Notice, it is a private method.

It will increase the capacity by making a new Array that has a new capacity of 2*length+1, then copy the old values, and set the data field to this new array.

Test it and then modify the add methods. The add methods must call this before you add to a list that is at capacity.

### indexOf(String target)

It returns the smallest index where the value in the SuperArray matches the target string. Return -1 when no value matches. Assume the target String is not null. 

### public int lastIndexOf(String target)

It returns the largest index where the value in the SuperArray matches the target string. Return -1 when no value matches. You may assume the target String is not null.

### public void add(int index,String value)

It adds the String to the target index. Values at that index and to the right of it must be shifted to the right to make room. Print an error when the index is out of range index is negative or index is larger than size().


<img width="419" height="666" alt="image" src="https://github.com/user-attachments/assets/7d78196a-ddb1-4542-99ea-a18fe7464803" />


