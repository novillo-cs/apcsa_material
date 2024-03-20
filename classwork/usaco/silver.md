# Silver

## Cow Travelling (Aram Shatakhtsyan, 2007)

This problem the algorithm is more difficult than the reading. You should still read it multiple times.

### 1. Description

Searching for the very best grass, the cows are travelling about the pasture which is represented as a grid with $N$ rows and $M$ columns ($2 \le N \le 100$; $2 \le M \le 100$). Keen observer Farmer John has recorded Bessie's position as (R1, C1) at a certain time and then as (R2, C2) exactly $T$ ($0 < T \le 15$) seconds later. He's not sure if she passed through (R2, C2) before $T$ seconds, but he knows she is there at time $T$.

FJ wants a program that uses this information to calculate an integer S that is the number of ways a cow can go from (R1, C1) to (R2, C2) exactly in T seconds. Every second, a cow can travel from any position to a vertically or horizontally neighboring position in the pasture each second (no resting for the cows). Of course, the pasture has trees through which no cow can travel.

Given a map with '.'s for open pasture space and '*' for trees, calculate the number of possible ways to travel from (R1, C1) to (R2, C2) in T seconds.

### 2. Program specifications

**INPUT FORMAT:**

The name of a file in the following format

* Line 1: Three space-separated integers: $N$, $M$, and $T$

* Lines 2..$N+1$: Line $i+1$ describes row $i$ of the pasture with exactly $M$ characters that are each '.' or '*'

* Line N+2: Four space-separated integers: $R1$, $C1$, $R2$, and $C2$.
  
**SAMPLE INPUT (file ctravel.in):**
4 5 6

...*.

...*.

.....

.....

1 3 1 5

**INPUT DETAILS:**

The pasture is 4 rows by 5 column. The cow travels from row 1, column 3 to row 1, column 5, which takes exactly 6 seconds.

**OUTPUT FORMAT:**

* Line 1: A single line with the integer S described above.
  
**SAMPLE OUTPUT**

1

**OUTPUT DETAILS:**

There is only one way from (1,3) to (1,5) in exactly 6 seconds (and it is the obvious one that travels around the two trees). 
