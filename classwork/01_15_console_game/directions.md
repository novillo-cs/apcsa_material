## Console Game

### Day 1

* This project must be saved in your assignments repo => `.../APCSA1/apcsa-assignments-fall-YourUsername/classwork/01_15_console_game/`
* Design a game where a player can have a different job/role.
* Choosing a different job will alter how the player can play the game and what specific things they can do.
* All kinds of players will have some common characteristics. Having a common class will help to represent this behavior.
* Job/role is called "class" in these kinds of games, but we will not use that term.


<img width="1271" height="722" alt="image" src="https://github.com/user-attachments/assets/91507374-586c-4977-a794-2deb9135ae97" />


Example:

<img width="528" height="547" alt="image" src="https://github.com/user-attachments/assets/20716e2d-b555-4f5e-bdad-5d44ab049fe6" />


### Player class (superclass):

* What things must all types of players have as their properties? Focus on big ideas about the player itself, not items or possessions. 

### Subclasses:

* Design 3 subclasses using any theme you wish.

* Does not have to be fantasy or anything common in games. What attributes/fieds or actions/methods might be required now?

* The subclasses can override the attack method as well as add new attributes. Attributes like mana would be added to magical characters, while a Barbarian might have a new attribute for their level of rage.

* There are many groups of jobs in different settings

    * Warrior / Wizard / Archer
    * Soldier / Spy / Politician
    * Princess / Pony / Monster
    * Others
 
Are we going to use the superclass to instantiate objects?

### Let's start

* Use the code provided for the superclass Adventurer.
* Implement one subclass of Adventurer and test it with a driver. You must implement all abstract methods.
* In the driver, the player should be declared as Adventurer and instantiated as the subclass (Adventurer player1 = new Warrior("Bob", 10);).
* Your player has some HP (health points) values at the beginning of the game.
* Your attack/support/special methods return Strings because you want the option of printing the text of what happened.


### Day2

* Look at the sample subclass MyWarrior and compare it to your subclass. What is different? What is the same?

* How your game will interact with the user? 

#### Game requirements:

* Create a class Game.java
* Create two Adventurer objects player and enemy.
* Prompt the user: a job/rol.
* Print the names, HP, and SpecialResource(quantity+name) of both the player and enemy.
* Prompt the user: "Type: attack / special / support / quit
* The user can type a/attack to select attack, or type sp/special to do a special attack, or su/support to support themselves. You then make the character use the appropriate action.
* If the user types quit, end the program.
* If an invalid response is typed, ask again until the response is valid.
* Print the results of the action.
* Now if the opponent is still alive (HP > 0) have the computer randomly choose to have the opponent attack/special attack the player, or buff themselves.
* Print the results of the action.
* Repeat this process until one Adventurer is dead (0 or fewer HP), then print the results of the fight. If the user quits, do not print the winner.
