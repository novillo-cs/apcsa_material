## ANSI (American National Standards Institute ) Colors


Every ANSI sequence begins with the **escape code**, a sequence indicating to the terminal that the next characters it receives will be an ANSI code.

Some escape codes are \x1b, \033, or \u001b, depending on if you’re using hexadecimal, octal, or unicode (two byte Unicode character 00 1B). 

The ANSI codes for color work as follows:

|Code 	|Color|
|-------|----------|
|[30m 	|Black Text|
|[31m 	|Red Text|
|[32m 	|Green Text|
|[33m 	|Yellow Text|
|[34m 	|Blue Text|
|[35m 	|Purple Text|
|[36m 	|Cyan Text|
|[37m 	|White Text|

Putting a color code after the escape code will change the color of your text. 

Example:
```

System.out.print("\u001b[31mRed");

System.out.print("I am red");

System.out.print("\u001b[35mPurple");

System.out.print("I am purple");
```

The background color of a letter can be changed, too!

The colors have the exact same numerals, but instead of using [3, we’ll use [4.

For example, a red letter is [31m, so a red background is [41m. 

|Code 	|Color|
|-------|----------|
|[40m 	|Black Background|
|[41m 	|Red Background|
|[42m 	|Green Background|
|[43m 	|Yellow Background|
|[44m 	|Blue Background|
|[45m 	|Purple Background|
|[46m 	|Cyan Background|
|[47m 	|White Background|


## Others ANSI codes

Reset screen back to normal: "\u001b[0m"

You can also bold and underline text, using [1m for bold, [4m for underline, and [7m for “inverse” text (switch foreground and background colors).

```
public static final String CLEAR_SCREEN =  "\u001b[2J";

public static final String HIDE_CURSOR =  "\u001b[?25l";

[More Info](https://en.wikipedia.org/wiki/ANSI_escape_code)

public static final String SHOW_CURSOR =  "\u001b[?25h";
```
