Coloring Tree 
You are given a complete binary tree with N vertices rooted with vertex 1. A complete binary tree is a binary 
tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible. 
The level order traversal of the tree from left to right is given by 1, 2, 3, 4, . 
Initially, all vertices are colored with color O. 
We have given Q queries each consisting of two letters t and t'. 
Ift = 1, then answer the color of vertex t'. 
Ift = 2, then color all the vertex of the subtree rooted with vertex t' with color which is numbered 1 more than the 
color used in the previous query of this type. We use color 1 in the first query of this type. 
Input 
The first line contains two space-separated integers N and Q denoting the number of vertices in tree and number 
of queries respectively. 
The next Q lines contains 2 space-separated integers denoting t and t' for the given query. 
For each query output the color of vertex.

Explanation 
Initially, all nodes are colored with color O. 
So for the first query, the answer is O. 
In the second query, all vertices in the subtree rooted with vertex 2 are colored with color 1. So, vertices 2, 4, 5, 8, 9, 10 are colored 
with color 1. 
So, for the third query and fourth query, the answer is 1. 
For the fifth query, the answer is O because the color of vertex 1 is still 1. 
In the sixth query, all vertices in the subtree rooted with vertex 3 are colored with color 2. So, vertices 3, 6, 7 are colored with color 2 
So, for the fifth query, the answer is 2. 
