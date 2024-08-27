package BinarySearchTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTrees {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTrees{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1)
            return null;

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preOrder(Node root)
        {
            if( root ==null)
                return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void postOrder(Node root)
        {
            if (root==null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
            
        }

        public static void inOrder(Node root)
        {
            if (root==null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
            
        }
        public static void levelOrder(Node root)
        {
            if(root==null)
            return;
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode=q.remove();
                if(currNode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    break;
                    else
                    q.add(null);
                }
                else
                {
                    System.out.print(currNode.data +" ");
                    if(currNode.left!=null)
                    q.add(currNode.left);
                    if (currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
            }

        }
        public static int heightOfTree(Node root)
        {
            if(root==null)
            return 0;
            int lh=heightOfTree(root.left);
            int rh=heightOfTree(root.right);
            return Math.max(lh, rh)+1;
        }

    }
  

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees tree=new BinaryTrees();
        Node root =tree.buildTree(nodes);
        tree.preOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.levelOrder(root);
        System.out.println();
        System.out.println(tree.heightOfTree(root));

    }
    
}
