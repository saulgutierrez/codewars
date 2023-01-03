// Description:
// This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

// My solution:
int simpleMultiplication(int a){
    //Your code
  if(a % 2 == 0) {
    a = a * 8;
  } else {
    a = a * 9;
  }
  return a;
}