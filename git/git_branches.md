# Git Branches

You already now that Git is a powerful version control system that enables you to track changes to your codebase. 

Git allows you to create branches. A branch is a separate version of the main line (branch).

Each branch can have its own commits, allowing you to work on multiple features or fixes simultaneously without affecting the main codebase.

![image](https://github.com/user-attachments/assets/97abf57e-528e-40bf-8aa7-fe73a3819e11)



## Create a branch

```
git branch your_branch_name
```

## Push the new branch to the remote server (GitHub for us)

```git push origin your_branch_name```

Try to make a change in one of your local files, commit and push your changes. Probably when you push, it will indicate that you need to push using the following
command:

```git push --set-upstream origin your_branch_name```

That command will link the local branch with the remote one.

## Switching Branches

```git checkout branch_name```

## Merging Branches

To merge a branch into another (commonly the main branch)

```git merge branch_name```

## Deleting Branches

```git branch -d branch-name```

## Viewing Branches

To view all branches in the repository

```git branch -a```

## Add a local branch that is already created in the server (GitHub)

Let's say you create a local branch XYZ in computer A and add it to the server (GitHub). Then, you go to computer B and clone your repo, and you want to work on the branch XYZ, you DO NOT have to create that that branch in computer B. Instead, you just need to add the branch XYZ that was already created.

```git checkout -b branch_name origin/branch_name```

## Steps to merge your branch with main

1. Commit and push in your branch
2. Go to main ```git checkout main```
3. Pull ```git pull```
4. Merge main with your branch ```git merge your_branch_name```
5. Push changes to main ```git push```

## Solve merge conflicts

It is common to have merge conflict when you work with multiple branches.

If after executing the merge command you see an error about CONFLICT, you must fix the code conflicts.

**Example:**

If you see the following:

```
git merge your_branch_name

Auto-merging Test.java
CONFLICT (content): Merge conflicts in Test.java
Automatic merge failed; fix conflicts and then commit the result

```

You must solve the conflicts in Test.java. Open the file with conflicts, you will see something like this:

```
<<<<<<< HEAD
String text = "Bonjour"; // line in current branch
=======
String text = "Hola"; // line in branch you're trying to merge
>>>>>>> your_branch_name
```

Now, you have to decide which line(s) you want to keep and which one should be removed.

Check that the conflicts were fixed, and commit and push changes:

```
git status
On branch master
All conflicts fixed but you are still merging.
(use "git commit" to conclude merge)

Changes to be committed:
modifies: Test.java

git commit -a -m "merge conflicts fixed"

git push
```

## Tutorials

https://www.w3schools.com/git/git_branch.asp

https://www.w3schools.com/git/git_branch_merge.asp

https://learngitbranching.js.org/

## Let's practice

This exercise should be completed with a parter.

1. One student create a repo and add their parter as collaborator.
   
![image](https://github.com/user-attachments/assets/c928fa50-983b-4d90-88d0-cde2026fb7de)


2. Create a file (any format) the goal is to get familiar with branches and fixing conflicts.
3. Both students should clone the repo and create a branch for themselves (use your name as the branch name).
4. Both students should modify the same file. Commit and push.
5. Change to main and merge with your branch.
6. Fix the conflicts.
