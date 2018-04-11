/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubs;

import static clubs.Clubs.Solution.levelOrder;
import java.io.IOException;
import java.io.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Clubs {
    
  class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
  
class Solution{
    
   static void levelOrder(Node root){
    
    Queue<Node> myNumbers = new LinkedList<Node>();
    myNumbers.add(root);
    
    while( myNumbers.size() != 0){
        
        if (root.left!=null){
            int count = 0;
            
            for(Node item : myNumbers){
                if (root.left == item){
                     count=1;
                }
                }
            if (count!=1){
                     myNumbers.add(root.left);
            }
            }
        
        if (root.right!=null){
            
            int count = 0;
            
            for(Node item : myNumbers){
                if (root.right == item){
                     count=1;
                }
                }
            if (count!=1){
                     myNumbers.add(root.right);
            }
        }
    
        root = myNumbers.remove();
        
        System.out.print(root.data + " ");
       
        
    }
    
    
    }
}
public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            Solution sau = new Solution(); 
            sau.levelOrder(root);
        }	
}

