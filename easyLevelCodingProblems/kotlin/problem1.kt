/*
🔹 Problem: Longest Continuous Increasing Segment
📘 Problem Statement
You are given an array of integers.
Find the length of the longest continuous segment where the numbers are strictly increasing.
A segment must use consecutive elements of the array.
 
📥 Input
• 
First line: Integer N (size of array)
• 
Second line: N space-separated integers
 
📤 Output
• 
Print one integer — the length of the longest continuous increasing segment
 
📌 Constraints (Easy Level)
• 
1 ≤ N ≤ 1000
• 
-10⁶ ≤ arr[i] ≤ 10⁶
 
✅ Example 1
Input
6
1 2 2 3 4 1
Output
3
Explanation:
The longest increasing segment is 2 3 4 → length = 3
 
✅ Example 2
Input
5
5 4 3 2 1
Output
1
(All elements decrease, so longest increasing segment length is 1)
*/

fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }

    var maxLen = 1
    var currentLen = 1

    for (i in 1 until n) {
        if (arr[i] > arr[i - 1]) {
            currentLen++
        } else {
            currentLen = 1
        }

        if (currentLen > maxLen) {
            maxLen = currentLen
        }
    }

    println(maxLen)
}
