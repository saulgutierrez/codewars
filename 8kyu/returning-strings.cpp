// Description:
/*
Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
[Make sure you type the exact thing I wrote or the program may not execute properly]
*/

// My solution
std::string greet(const std::string& n){
  std::string str = "Hello, " +n + " how are you doing today?";
  return str;
}