# Count Triangles

Save here: ```.../APCSA1/apcsa-assignments-fall-YourUsername/classwork/11_12_count_triangles/```

## Part 1

The file "input.txt" gives triangles side lengths, one triangle per line. Some values do not make a triangle.

In a valid triangle, the sum of any two sides must be larger than the remaining side, but... 5 10 25? It is not a valid triangle.

Write a program that determine how many of the listed triangles are valid?

Solution: 1032

## Part 2

Now, it occurs to you that triangles are specified in groups of three vertically. Each set of three numbers in a column specifies a triangle. Rows are unrelated.

For example, given the following specification, numbers with the same hundreds digit would be part of the same triangle:

101 301 501

102 302 502

103 303 503

201 401 601

202 402 602

203 403 603

Using the input file, and instead reading by columns, how many of the listed triangles are possible?

Solution: 1838
