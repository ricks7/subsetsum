subsetsum
=========

Subset Sum

Given a target value and a list of numbers to pick from, pick numbers from the list such that the 
numbers picked add up to the target value.
For example, if given a target value of 150 and a list of numbers to pick from consisting of 1, 2, 100, 22 
and 28, the correct answer would be 100, 22 and 28 because 100 + 22 + 28 =150. If given a target value 
of 30 and the sample numbers to pick from were 1, 2, 100, 22 and 28, the correct answer would be 28 
and 2 because 28 + 2 = 30.
NOTE: Once you use a number from the list you cannot pick it again.
NOTE: If no combination of numbers adds up to the requested value, the correct answer is "No 
combination matches".
NOTE: There can be more than one correct answer. For example, for target value 3 and list 1, 2 and 3
the correct answer would be either: 1, 2 or 3. You only need to return 1 correct answer not all of them.
Write a program that takes a list of numbers from the command line. The first number is the target
value and the reminder of the numbers (however many there may be) is the set of numbers you have to
pick from. The program should either output a subset whose sum equals the target or "No combination 
matches" if no such subset exists. We would prefer you use Java or C# on this program, but you can use 
another procedural language if you don't know Java or C#.

For example, the following inputs should yield the following results:
SubsetSum 15 1 2 3 5 7 10
{3,7,5}

SubsetSum 9 1 2 3 5 7 10
{2,7}

SubsetSum 100 1 2 3 5 7 10
No combination matches

PS. Feel free to email either ricksoza@gmail.com if you have any questions about this spec or the system you are implementing.
