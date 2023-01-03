// Description:
/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
*/

// My solution:
bool XO(const std::string& str)
{
  // your code here
  int countX = 0;
  int countY = 0;
  for(int i = 0; i < str.size(); i++) {
    if(str[i] == 'X' or str[i] == 'x') {
      countX++;
    }
    
    if(str[i] == 'O' or str[i] == 'o') {
      countY++;
    }
  }
  if(countX == countY) {
    return true;
  } else {
    return false;
  }
}