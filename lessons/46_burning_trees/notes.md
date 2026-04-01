# Burning Trees Simulator


## Problem

Consider a forest that is made up of a NxN grid, and that some percentage of the spaces of the grid are randomly filled with trees. You must light the trees on fire, and see how long the fire will burn. The starting position of the trees is randomized, so each run will have a different number of rounds before the fire burns out completely. You must calculate the number of rounds of burn time for a particular forest.

## Simulation

Start the simulation by setting the fire to the leftmost column of trees in the forest (second grid in the example).

### Specifications

- There are 4 states for a square: empty (" "), tree ("@"), fire ("W"), ash (".").
- At the start of a round all existing fire will spread and then turn to ash.
- A fire will spread to all trees directly adjacent to the fire (not diagonal).
- A tree that just turned into fire will not spread until the next round.
- Empty spaces and ash cannot catch fire.

The effect is that fire will expand by one square each round. Eventually the fire will stop burning because there are no more trees adjacent to the existing fire.

## Example

<img width="782" height="640" alt="image" src="https://github.com/user-attachments/assets/4ace507a-3b73-4fcb-949f-2c310f4511db" />


## Adjustments

The density of trees can be adjusted and this would affect the burn time:

- Consider 100% density, the fire would burn for a number of rounds equal to the width of the grid.
- Consider an forest of 10% density (still randomly arranged), the fire would stop almost immediately due to lack of adjacent trees to burn.

### Day 1

Complete the following methodds:

- tick() - advance the map to the next state.
- done() - determine if there are more fires left.

You may modify the map directly. Please use the words TREE/FIRE/ASH/SPACE in your method to make the code more readable. The only values map should contain at the end of a tick are TREE/FIRE/ASH/SPACE.

If your prefer, you are allowed to make a copy of the array so that you have an easier time manipulating/calculating states. This may be slow, but we can improve it after it works.

```
private int[][]map;
private int ticks;
private static final int TREE = 2;
private static final int FIRE = 1;
private static final int ASH = 3;
private static final int SPACE = 0;
```

Day 1 - Save your work here: ```.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/03_30_burning_trees/```

### Day 2

#### Previous Runtime

We mentioned that the worst case with the previous solution could be O(n^3) or worst because we have to loop through an N by N grid and the simulation last K rounds which could be N or greater for some densities.

Example: If we have an 1000 by 1000 grid and need to repeat the simulation around 100 times per density and if you want to test it for 100 densitities. The result would be:

n^3 * repetitions * densities = 1000^3 * 100 * 100

#### How can we improve the runtime?

**New Solution**

Instead of looping over the grid to find each fire, we can use a collection to keep track of all fire. A collection is an object that represents a group of objects. We will call this a Frontier, because it is a collection of all of the places we have yet to explore. We can process each existing position of the Frontier which does a few things:

- Check the size of the Frontier and process that many elements.

- Loop size times:

    - Remove the oldest location from the frontier, this is your current position
    - Turn that position into ASH
    - Spread FIRE to neighboring TREE squares
    - Any new FIRE you created when spreading must be added to the Frontier for next time

**IMPORTANT: You should only process the original FIRE, so check the size of the frontier once, before you start removing elements.**

#### What is the new runtime with this solution?

Adding/removing fire from the frontier is a constant time operation O(1). Each simulation would run in O(k*f) time, where f is the average size of the frontier.

If number of trees burned is b that would make the runtime O(b). The number of rounds will not increase the runtime. The value of b is between 0 and n^2. 

By implementing a frotier, we are decreasing the time complexity from O(n^3) to O(n^2) when the density is very high. Lower densities will lower the total number of steps and the simulation will terminate fast.

Now the total rumtime is O(n2) * repetitions * densities => Better than before

#### How can we implement this solution?

- A Frontier class is needed to store the coordinates (row, column). We only need to store positions in this class, so we can use a 1D array for the positions {1, 3}, {5, 2}.
- The following methods should be implemented:

```
public class Frontier{
  private ? frontier; // Replace ? with the type you want for your frontier
  public Frontier(){}
  public int size(){}
  public void add(int[]location){}
  public int[] remove(){}
}
```

**What data structure can we use to implement our Frontier?**

- Methods add and remove should be executed in constant time.
- Older positions should be processed before the new ones?

The structure you need should follow the FIFO behaviour, so a Queue implementation would work here. You must implement a LinkedList or ArrayDeque. 

**Why do we need a Frontier class instead of using a LinkList or ArrayDeque in our main class?**

If at some point you would like to change the Frontier implementation you can do it in that class instead of changing the the simulation code (allowing different implementations depending on the constructor, or storing more data about the simulation).

Notice: You may declare your variable of type Queue<E> (interface) and instanciate it of type LinkedList or ArrayDeque. So if you change between LinkedList and ArrayDeque you do not need to change your code.

#### Tasks

Let's optimize the simulation.


- Add a Frontier class (Frontier.java) and only check the positions that are already on fire. Your frontier should be instantiate as an ArrayDeque or LinkedList.
- Implement: constructor(s) and methods: add(), remove(), and size().
- Store array of integers in your frontier: instantiate a LinkedList<int[]> or ArrayDeque<int[]>.
- To print ArrayDeque<int[]> myDeck => System.out.println(Arrays.deepToString(myDeck.toArray(new int[1][1])));

In the simulation file BurnTrees.java:

- Add a Frontier instance variable to your simulation.
- When burning the left column of trees, you must add those trees to be the starting configuration of the frontier.
- Change method tick(): Each round of the simulation, check the size() of the Frontier and only process that many nodes. For instacne, if your frontier has 5 fire positions, you must process exactly 5 times, even though at the end your frontier now has some new fire added.
- Change the done() method to use the frontier to check if you are done. This should be an O(1) operation.

Please note that this number per round behavior is required for this particular simulation, but in general for a BFS (Breadth-first search) we process one at a time without counting the number or rounds. The following image does not do rounds, it does one node at a time.

BFS will explore all areas in the order of distance from the start, so far away areas explored last.
    
![image](./bfs.gif)

You will most likely need to add a few extra instance variables to make this simulation work in a reasonable amount of time. However, do not add too many, keep it simple. When you do this, feel free to update the constructor and other methods accordingly.

Once this works, you can use your working simulation to determine the behavior of the fire on different densities.

Day 2 - Save your work here: ```.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/03_31_burning_trees_frontier/```



### Day 3

You have already built a forest fire simulator. The forest is represented as a grid where each cell is either a tree, empty space, fire, or ash. Fire starts on the left column and spreads to neighboring trees one tick at a time. The simulation ends when no fires remain.

Today's task: you will extend the simulator with a new method, then use it to collect data, analyze it, and writer conclusions about how tree density affects how fire spreads.

### 1. New Method:

Add the following method to BurnTrees.java: 

public boolean crossedEntireForest(): This method must return true if the fire reached the rightmost column of the grid, and false otherwise. You may implement this in one of two ways:


Option A: After the simulation ends, loop through every cell in the rightmost column. If any cell is ASH, return true.

Option B: Add a boolean instance variable. Inside tick(), set it to true the moment any cell in the rightmost column catches fire.

```
BurnTrees b = new BurnTrees(1000, 1000, 0.6);
int time = b.run();
boolean crossed = b.crossedEntireForest();
```

### 2. Collect data

Use run() and crossedEntireForest() to run repeated simulations and collect statistics. Write a loop in main() (or a separate helper method) that runs the simulation 100 times for a given density and board size, then computes:

Average normalized burn time: total ticks across all runs ÷ number of runs ÷ n (where n is the board width)

Crossed forest probability: number of runs where crossedEntireForest() returned true ÷ total runs

Run your test using a 1000×1000 board, and another one using  a 100×100 board. Use the same densities for the 2 test.

Complete the following table, and same it in a results.md file (or txt, docx, pdf):

<img width="369" height="178" alt="image" src="https://github.com/user-attachments/assets/0b0027b2-ab1d-4142-9d53-1fa6155b889a" />


### 3. Zoomed-In Table (1000×1000 board)

Look at the previous results and identify the density range where normalized burn time is highest. Run a new set of experiments zoomed into that range, using finer density steps.

Requirements:

- Your highest data point must not be the first or last row. It must be clearly in the middle, proving you found a local maximum and not just an edge.

- Include enough data points that the peak and the decline on both sides are clearly visible

### 4. Analysis

- In your results.md file, below your tables, write a response to each of the following. A few sentences each is fine, but be specific and reference your data.

- How did you choose your zoom range for Part 3? What did the first table tell you, and how did you decide where to zoom in?

- What do your results tell you about the effect of density on burn time? Describe what happens at low density, high density, and in between. Where is the peak, and why does it occur there?

- What are the real-world implications for forest management? Think about what density represents in a real forest and what it would mean to control it. You may do a small amount of outside research if you wish.

