# [236A - Boy or Girl](https://codeforces.com/problemset/problem/236/A)

## 📝 Problem Statement

This problem presents a fun scenario where a user's gender is determined by the number of distinct characters in their username. The rules are simple:

-   If the count of distinct characters in the username is **even**, the user is considered female.
-   If the count of distinct characters is **odd**, the user is considered male.

Given a username as a string, our task is to determine the user's gender based on this rule and print `"CHAT WITH HER!"` for a female or `"IGNORE HIM!"` for a male.

## 🤔 Approach & Logic

The core of the problem is to count the number of *unique* characters in the given string. A brute-force approach might involve complex nested loops or sorting, but there is a much more elegant and efficient solution using an appropriate data structure.

A **`HashSet`** is the ideal choice for this task. A `HashSet` in Java is a collection that only stores unique elements. If you try to add an element that already exists in the set, the operation is simply ignored. This property allows us to automatically handle duplicate characters.

The algorithm is as follows:
1.  Read the input string (the username).
2.  Create an empty `HashSet` to store characters.
3.  Iterate through each character of the input string.
4.  For each character, add it to the `HashSet`.
5.  After the loop finishes, the `size()` of the `HashSet` will be exactly the count of the distinct characters in the username.
6.  Finally, check if the size of the set is even or odd using the modulo operator (`% 2`).
7.  Print `"CHAT WITH HER!"` if the size is even, and `"IGNORE HIM!"` if it's odd.

## 💻 Code (Java)

Here is the Java implementation of the solution.

```java
import java.util.*;

public class BoG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the username as a single string
        String s = sc.next();
        int n = s.length();

        // Use a HashSet to store only the unique characters.
        // It automatically handles duplicates for us.
        Set<Character> hs = new HashSet<>();
        
        // Iterate through the string and add each character to the set
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            hs.add(c);
        }
        
        // The size of the set now equals the count of distinct characters.
        // Check if the count is even or odd.
        if (hs.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        
        sc.close();
    }
}
```

## 📊 Complexity Analysis

-   **Time Complexity:** $O(n)$
    The program iterates through the input string of length $n$ exactly once. The `add` operation for a `HashSet` takes, on average, $O(1)$ time. Therefore, the total time complexity is dominated by the loop, making it linear with respect to the length of the string.

-   **Space Complexity:** $O(k)$
    The space is used to store the unique characters in the `HashSet`. In the worst case, all characters in the string are unique. Let $k$ be the number of unique characters. The space complexity is $O(k)$. Since the problem deals with lowercase English letters, the number of unique characters `k` is at most 26. Therefore, the space complexity can also be considered constant, $O(1)$, as it is bounded by a small, fixed number regardless of the input string's length.