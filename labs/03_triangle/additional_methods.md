## Adding an equals Method to the Point Class

Before we write our own equals method, let’s look at a common issue when working with floating-point numbers.

When performing calculations, floating-point values are almost never exactly equal to what you expect due to tiny rounding errors.

For example:


| Comparison               | What you might *expect* | What actually happens |
| ------------------------ | ----------------------- | --------------------- |
| `10.0` == `9.99999`      | equal                   | false                 |
| `0.001` == `0.000999999` | equal                   | false                 |
| `0.0003` == `0.0001 + 0.0001 + 0.0001` | equal    | false                  |

So we can’t use == to compare doubles.

**Example:** Measuring the Distance Between Points

Imagine you’re running a physics simulation and need to measure how far a moving object has traveled.

You expect the object to move exactly 5.0 units, but when you compute the distance, you might get something like 4.999999999 or 5.000000002.

Even though the object moved “5.0 units,” the computer’s math introduces tiny rounding errors, causing the result to differ slightly.

## Fixing the Problem: “Close Enough” Comparison

To handle this, we can write a method that checks if two doubles are close enough instead of exactly equal:

`public static boolean closeEnough(double a, double b)`

### Disscuss with your neighbor:

1. How can you determine if two values are close enough to each other?
2. What would you do to compare them? Should it depend on a fixed tolerance (absolute difference)?
3. How could a simplistic method (absolute difference) fail to work on `0.00000001` vs `0.00000003`, where one value is 3× the other (thus NOT close enough)?

## New methods in Point class

- Check if the coordinate values are equal. We have learned that data precision can be a problem with double values. The following method should return true when a is equal to b or when the difference between them is not greater than 0.001%. Otherwise, return false. 

```
 public static boolean isClose(ddouble a, double b){
   return false;
 }
```

- A point is equal to another one when the values x and y are close to each other. Use method isClose to determine if values are close.

 ```
public boolean isEqual(Point other){
   return false;
 }
```
   

## New methods in Triangle class

 - Return true when the Points in one triangle are equal to the ones in another triangle.
   
```
public boolean equals(Triangle other){
    return false;
 }
```


 - Identify the type of triangle and return the name "scalene", "isosceles", or "equilateral". Reuse code. Do not duplicate lines of code.
   
 ```
public String getTriangleType(){
    return "";
 }
```
   

- Calculate the area with 3 sides:
  
 ``` 
 Area = √[s(s-a)(s-b)(s-c)]
```

  "s" is the semi-perimeter of the triangle, i.e., `s = (a + b + c)/2`.

  "a", "b", and "c" are the three sides of a triangle.

  Area of triangle with 3 sides formula is called Heron's formula and using this, area is equal to square root of s times s minus a times s minus b times s minus c

```
public double getArea(){
    return 0.0;
}
```
