## Numbers Inheritance

Save here: `.../APCSA1/apcsa-assignments-fall-YourUsername/classwork/11_19_inheritance_numbers/`

Classes to be implemented:

**RealNumber:** is meant to store double values and might have rounding errors.

**RationalNumber:** is meant to store two int values, and can be printed like a fraction, and compared to each other with no rounding errors.

new RationalNumber(5,10) will print as: "1/2"

new RationalNumber(0,5) will print as "0"

new RationalNumber(10,5) will print as "2"


Ignore divide by 0 by making any RationalNumber with a denominator of 0 become: numerator 0 denominator 1 (or 0/1), which would print as "0"
new RationalNumber(5,0) will print as "0"

**Examples:**

```
RealNumber x = new RealNumber(0.5);//prints as "0.5"
RealNumber y = new RealNumber(5);//prints as "5.0"
RealNumber a = new RationalNumber(3,2);//prints as "3/2"
RealNumber b = new RationalNumber(1,2);//prints as "1/2"
RealNumber c = new RationalNumber(5,0);//prints as "0"

```

**Negative numbers:**

```
new RationalNumber(5,-3) will print as "-5/3"

new RationalNumber(-5,3) will print as "-5/3"

new RationalNumber(-5,-3) will print as "5/3"
```

**Divide a RationalNumber by a RealNumber:**

When you divide a RationalNumber by a RealNumber, it calls the inherited divide(RealNumber) method, NOT the divide(RationalNumber) method.

```
RationalNumber q = new RationalNumber(3,5);
RationalNumber r = new RationalNumber(2,3);
RationalNumber s = new RationalNumber(5,9);
RationalNumber t  = new RationalNumber(50,81);
System.out.println("Expected 2/9: "+q.multiply(r).multiply(s));
System.out.println("Expected 81/50: "+q.divide(r).divide(s));
System.out.println("Expected 1: "+q.divide(r).divide(s).multiply(t));
RealNumber two  = new RealNumber(2.0);
System.out.println("Expected 0.81 : "+q.divide(r).divide(s).divide(two);
```
