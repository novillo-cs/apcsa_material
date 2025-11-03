## Wrapper Classes

### Currency

Fill in the Currency class using the method comments as a guide.

For getDollars and getCents, you can isolate the dollar part by rounding the Double to an Integer. To do that, get the double value using doubleValue and cast the result to an Integer.

There are several ways to get the cents, but you need to be careful not to get a double rounding error. The safest way is to multiple the orginal value by 100, then cast to an integer and then use a mod 100 function:
cents = (int)(value * 100) % 100

When you run, you should get
```
Value of bankroll: $12.45
Dollars: 12
Cents: 45
Value of bankroll: $20.56
Dollars: 20
Cents: 56
Value of bankroll: $67.78
Dollars: 67
Cents: 78
```

### Guess the number (Extremes)

The Extremes class represents the range of Integer values.

Fill in the Extremes methods. In the constructor, set min and max to the minimum and maximum value of Integer. Use Integer.MIN_VALUE and Integer.MAX_VALUE. Also fill in the MinDiff and MaxDiff methods to return the difference between the users guess and the actual max/min values of Integer.

Driver: use the comments as a guide to ask the user to guess the maximum and minimum values. Compute the difference between the guess and the values, then print it out.

```

        
        // Create an Extremes object
        
        
        // Ask the user to guess the maximum value of an Integer
        
        
        // Compute and display the difference
        // between the max and the guess
        
        
        // Ask the user to guess the minimum value of an Integer
        
        
        // Compute and display the difference 
        // between the min and the guess
        

```

Be aware that if you choose a number too big or too small, it will cause an error since the number cannot be stored.

The results in run should look something like this:

```
Guess the maximum Integer value: 
543214
You were off by 2146940433
Guess the minimum Integer value: 
2145678321
You were off by 1805327
```

Note: Your methods should return the actual difference between the min and the max. This value can be positive or negative. In your run method, you should use Math.abs to compute a posive value.
