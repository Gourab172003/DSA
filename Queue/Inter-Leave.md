Interleave the Two Halves of a Queue (Even Length)
Problem Statement

You are given a queue of even length N containing integers.
Your task is to interleave the first half of the queue with the second half, such that elements are taken alternately from each half, starting with the first half.

You must use queue operations only (and an auxiliary queue if required).

Input
A queue Q containing N integers (N is even)

Output
The queue after interleaving the first half with the second half

Example
Input Queue:
1 2 3 4 5 6 7 8 9 10
Output Queue:
1 6 2 7 3 8 4 9 5 10

Explanation

First half of the queue:
1 2 3 4 5

Second half of the queue:
6 7 8 9 10

Interleaving both halves alternately produces:
1 6 2 7 3 8 4 9 5 10

Constraints
1. 2 ≤ N ≤ 10⁴
2. N is always even
3. Only queue operations (enqueue, dequeue, peek) are allowed
