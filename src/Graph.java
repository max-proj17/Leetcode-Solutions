//
//
// Code belongs to Aakash Hasija from GeeksforGeeks at: https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
// I do not write any of this code. I added comments and refactored the code for my own studying.
//
import java.io.*;
import java.util.*;
public class Graph {
    private int V;//Num vertices
    private  LinkedList<Integer> adj[]; //adjacency list

    Graph(int v)
    {
        V=v;
        adj = new LinkedList[v]; //Linked list of vertices
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList(); //Each vertex will have its own linked list
        }
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w); //w is added to vertex at v's linkedlist
    }

    void BFS(int s)
    {
        boolean visited[] = new boolean[V]; //keeps track of visited vertices

        Queue<Integer> queue = new LinkedList<Integer>();

        //current node will be visited and queued
        visited[s] = true;
        queue.add(s);

        while(queue.size() != 0) //will run until there are no more unvisited vertices
        {
            //dequeue vertex and get all adjacent vertices. If an adjacency has not been visited, mark as visited
            //and enqueue
            s = queue.poll();
            System.out.print(s + " "); //We can store this traversal for other purposes, but we will just print for now.

            Iterator<Integer> i = adj[s].listIterator(); //iterator for adjacent vertices of a vertex
            while (i.hasNext())
            {
                int n = i.next();
                if(!visited[n])  //if we haven't visited a vertex: 1) visit it at mark true, 2) add it to the queue
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void DFS(int s)
    {
        boolean nodes [] = new boolean[V];

        Stack<Integer> stack = new Stack<>();

        stack.push(s); //Put the root node into stack
        int a = 0;

        while(!stack.empty())
        {
            s = stack.peek(); //get top element from stack
            stack.pop();

            if(!nodes[s]) //marks current vertex as visited if it hasn't been visited
            {
                System.out.print(s + " ");
                nodes[s] = true;
            }
            for (int i=0; i<adj[s].size(); i++) //visits each vertex of the sublist of adj vertices of s
            {
                a = adj[s].get(i);
                if(!nodes[a])   //if we haven't explored an adjacent vertex...
                {
                    stack.push(a); //track it so we can explore later
                }
            }
        }
    }

    public static void main(String [] args)
    {
        //BFS is level order on binary tree
        //DFS is just like preorder

        //This is a directed graph
        Graph g = new Graph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);


        g.BFS(1);
        System.out.println();
        g.DFS(1);
    }


}
