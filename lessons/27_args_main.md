# Lesson: `args` in `public static void main(String[] args)`

Every Java program starts running from the `main` method. You’ve seen it many times:

```
public static void main(String[] args)
```

### But what’s the purpose of `String[] args`?

It allows your program to receive **input from the command line**.

When you run your program from the terminal, you can pass extra data directly to it. Those pieces of data are stored in an array called `args`.

### What exactly is `args`?

* `args` is a **String array**.
* When you run a java program, each space-separated item typed after the program name becomes one element in that array.

For example, if you run:

```
java MyProgram hello world 1
```

Then inside your program:

* `args[0]` is `"hello"`
* `args[1]` is `"world"`
* `args[2]` is `"1"`
* `args.length` is `3`

Even though `"1"` looks like a number, it is still a **String**, because all command-line arguments start as strings.

### How do you use these arguments?

Here’s a example that prints whatever the user typed:

```java
public class Fruits {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
```

If you run:

```
java Fruits apple banana cherry 1
```

Output:

```
Argument 0: apple
Argument 1: banana
Argument 2: cherry
Argument 3: 1
```

### Converting the arguments

Since every element of `args` is a **String**, you must convert values to numbers if needed:

```
int x = Integer.parseInt(args[3]);
double y = Double.parseDouble(args[3]);
```

### Exercise

Add two numbers from the command line

```
public class AddNums {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter two numbers.");
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;

        System.out.println("The sum is: " + sum);
    }
}
```

Running:

```
java AddNums 8 12
```

Output:

```
The sum is: 20
```

---
