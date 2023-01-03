// Description
/* Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0. */

// My solution
#include <vector>

int sum(std::vector<int> nums) {
  int result = 0; 
  for(int i = 0; i < nums.size(); i++) {
    result += nums[i];
  }
  return result;
}