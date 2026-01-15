// Collaborators:

import java.util.Random;

public abstract class Adventurer{
  private String name;
  private int HP,maxHP;


  /*There is no no-arg constructor. Be careful with your subclass constructors.*/
  
  public Adventurer(String name){
      this(name, 10);
  }

  public Adventurer(String name, int hp){
      this.name = name;
      this.HP = hp;
      this.maxHP = hp;
  }

  //concrete method written using abstract methods.
  //refill special resource by amount, but only up to at most getSpecialMax()
  public int restoreSpecial(int n){
      if( n > getSpecialMax() - getSpecial()){
              n = getSpecialMax() - getSpecial();
      }
      setSpecial(getSpecial()+n);
      return n;
  }

  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public abstract String getSpecialName();
  //accessor methods
  public abstract int getSpecial();
  public abstract void setSpecial(int n);
  public abstract int getSpecialMax();

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public abstract String attack(Adventurer other);

  //heall or buff the target adventurer
  public abstract String support(Adventurer other);

  //heall or buff self
  public abstract String support();

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other);

  /*
    standard methods
  */
  public void applyDamage(int amount){
    this.HP -= amount;
  }

  

  //toString method
  public String toString(){
    return this.getName();
  }

  //Get Methods
  public String getName(){
    return name;
  }

  public int getHP(){
      return HP;
  }

  public int getmaxHP(){
      return maxHP;
  }
  public void setmaxHP(int newMax){
        maxHP = newMax;
  }

  //Set Methods
  public void setHP(int health){
      this.HP = health;
  }

  public void setName(String s){
      this.name = s;
  }
}
