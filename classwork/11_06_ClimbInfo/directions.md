## ClimbInfo

A mountain climbing club maintains a record of the climbs that its members have made. Information about a
climb includes the name of the mountain peak and the amount of time it took to reach the top. The information is
contained in the **ClimbInfo class**.

There is a **ClimbingClub class** that maintains a list of the climbs made by members of the club.

1. Write an implementation of the ClimbingClub method addClimb that stores the elements of
climbList in alphabetical order by name (as determined by the compareTo method of the String
class). This implementation of addClimb should create a new ClimbInfo object with the given name
and time and then insert the object into the appropriate position in climbList. Entries that have the
same name will be grouped together and can appear in any order within the group. For example, consider the
following code segment.

ClimbingClub hikerClub = new ClimbingClub();

hikerClub.addClimb("Monadnock", 274);

hikerClub.addClimb("Whiteface", 301);

hikerClub.addClimb("Algonquin", 225);

hikerClub.addClimb("Monadnock", 344);

When the code segment has completed execution, the instance variable climbList would contain the
following entries in either of the orders shown below.

<img width="681" height="238" alt="image" src="https://github.com/user-attachments/assets/75312a0b-da15-4217-b1e8-f6575821dafb" />


You may assume that climbList is in alphabetical order by name when the method is called. When the
method has completed execution, climbList should still be in alphabetical order by name.

2. The ClimbingClub method distinctPeakNames is intended to return the number of different
names in climbList. For example, after the following code segment has completed execution, the value
of the variable numNames would be 3.

```
ClimbingClub hikerClub = new ClimbingClub();
hikerClub.addClimb("Monadnock", 274);
hikerClub.addClimb("Whiteface", 301);
hikerClub.addClimb("Algonquin", 225);
hikerClub.addClimb("Monadnock", 344);
int numNames = hikerClub.distinctPeakNames();
```
Consider the following implementation of method distinctPeakNames

```
/** @return the number of distinct names in the list of climbs */
public int distinctPeakNames()
{
  if (climbList.size() == 0)
  {
    return 0;
  }
  ClimbInfo currInfo = climbList.get(0);
  String prevName = currInfo.getName();
  String currName = null;
  int numNames = 1;
  for (int k = 1; k < climbList.size(); k++)
  {
    currInfo = climbList.get(k);
    currName = currInfo.getName();
    if (prevName.compareTo(currName) != 0)
    {
      numNames++;
      prevName = currName;
    }
  }
  return numNames;
}```

Does this implementation of the distinctPeakNames method work as intended when the
addClimb method stores the ClimbInfo objects in alphabetical order by name as described in
part (1)?  Yes/No and why? Write your response to this question in file answer.txt or answer.md or answer.pdf.
