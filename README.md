# Minimum-Swaps-to-Make-Strings-Equal
You are given two strings s1 and s2 of equal length, consisting only of the characters 'x' and 'y'.  In one operation, you can swap any two characters (even from different strings). Return the minimum number of swaps required to make the strings equal.
Explanation:
We're looking for mismatches between the two strings.

There are two types of mismatches:

xy → s1 has x and s2 has y

yx → s1 has y and s2 has x

Every two xy mismatches can be resolved with 1 swap. Same with yx.

But if we have one xy and one yx, we need 2 swaps to fix both.

If total mismatches are odd, it's impossible to fix them (because one mismatch will always remain).
