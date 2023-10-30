# algorithm-study
Algorithm Study for Java Developer Challenge


## Problem Description
[Given an array of integers, assume they are bars and calculate the amount of water that will accumulate between bars]

## Solution Description

If the input array has two or fewer bars, it's impossible to trap any water, so the function returns 0.

Initialize variables: h (maximum height encountered), sum (total trapped water), and two pointers i and j pointing to the left and right ends of the elevation map.

Enter a while loop that continues until i and j meet in the middle of the elevation map.

Compare the heights at positions i and j:

The solution uses a two-pointer approach to traverse the elevation map from both ends. It dynamically tracks the maximum height encountered and calculates the trapped water at each step. The time complexity is O(n), where n is the number of bars.

## How to Run
To test the solution, follow these steps:

1. Clone this repository:
   git clone https://github.com/aycaikaya/your-algorithmic-solutions.git

2. Navigate to the project directory:
   cd your-algorithmic-solutions

3. Compile and run the Main class:
   javac MainClass.java
   java MainClass

   
## Examples
{7, 0, 4, 2, 5, 0, 6, 4, 0, 5}


## Author
Ayça İdil Kaya


## License
This project is licensed under the MIT License - see the LICENSE file for details.

