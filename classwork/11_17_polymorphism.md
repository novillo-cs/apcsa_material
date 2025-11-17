# Library Books

Save here: .../APCSA1/apcsa-assignments-fall-YourUsername/classwork/11_17_library_books/

You must implement 4 classes:

  -  Book (superclass)
  -  TextBook (subclass)
  -  Novel (subclass)
  -  Driver

For the Book, TextBook, and Novel class, you will create a constructor and all getters and setters.

### Book Class

The Book class will have a title and author as instance variables. The constructor should follow this format:

```public Book(String title, String author)```

It should also have a toString method that returns

```Book: TITLE```

where TITLE is replaced with the title of the book.

### TextBook Class

The TextBook class will have an edition and whether it’s an ebook as instance variables. The constructor should follow this format:

```
public TextBook(String title, String author, 
                int edition, boolean isEbook)
```

The ebook field needs a getter named isEbook.

It should also override the toString method to return

```Textbook edition # EDITION```

where EDITION is replaced with the edition of the book.

### Novel Class

The Novel class will have the reading level and the genre as instance variables. The constructor should follow this format:

```
public Novel(String title, String author, 
            int readingLevel, String genre)
```

It should also override the toString method to return

```GENRE Novel```

where GENRE is replaced with the genre of the book.

### Driver

In the Driver you must create an ArrayList that will store all the books in your library. Then create your library by adding at least 2 textbooks and 2 novels to the ArrayList.

After creating your library, use a loop to access the ArrayList and print out the object and any information you have access to.poly
