# Classwork: Using Command-Line Arguments to Compare Sorting Algorithms

### **Goal**
You will modify your previous lab (Driver.java + Sorts.java) so that your program accepts **two command-line arguments**:

1. **The size of the array** to generate
2. **The sorting algorithm** to run (`selection`, `bubble`, `insertion`)

You will then use the Linux `time` command to measure how long each sort takes with different input sizes.

### **Part 1 — Set Up**

1. In your classwork directory for today:
   `.../APCSA1/apcsa-assignments-YourUsername-fall/classwork/12_08_args/`
   copy your **Driver.java** and **Sorts.java** files from your last lab.

2. Make sure both files compile before you begin modifying anything.


### **Part 2 — Modify `main` to Use Command-Line Arguments**

Update `main` in **Driver.java** so that:

1. It reads `args[0]` as the **array size**

   * Convert it using `Integer.parseInt(args[0])`

2. It reads `args[1]` as the **sorting algorithm name**

   * Example: `"selection"`, `"bubble"`, `"insertion"`

3. It generates a **random integer array** of the requested size.

4. It **calls the correct sorting method** based on the algorithm name passed in.

### **Part 3 — Run Timing Tests**

Use the Linux `time` command to measure how long each sorting algorithm takes.

Example:

```
time java Driver 1000 bubble
time java Driver 2000 bubble
time java Driver 10000 bubble

time java Driver 1000 selection
time java Driver 2000 selection
time java Driver 10000 selection

time java Driver 1000 insertion
time java Driver 2000 insertion
time java Driver 10000 insertion
```

Record the **real** time for each run on a txt file or your notebook.

### **Part 4 — Discuss and Compare Results With Your Partner**

Compare your times with your partner. Together, discuss the following:

* Did both of you get similar timing results?
* If the times were different, why might that have happened?
* Which algorithm consistently performed the best for both of you?
* Which algorithm slowed down the most as the array grew?

Each pair should have a short **spoken discussion** and make sure both students understand the differences.
