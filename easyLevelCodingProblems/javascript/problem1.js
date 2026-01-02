/*
Write a program that takes a list of numbers and returns a new list containing only the even numbers from the original list.
*/

const numbers = [1, 3, 2, 5, 4, 6, 5, 7, 8, 4, 3, 2, 5, 7, 9, 8, 0, 3, 1, 2];

let evenNumbers = numbers.filter(function(n) {
return n%2===0;
});

console.log("Even numbers:", evenNumbers);