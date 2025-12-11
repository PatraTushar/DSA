package Recursion.CodeWithMik;


public class Q6 {


    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }


    }


     TreeNode prev = null;

     void flatten(TreeNode root) {


         //  Time Complexity: O(n)  Where n = number of nodes in the tree.
         //  Space Complexity: O(h) (recursion stack)

        if (root == null) return;

        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;


    }

    static void display(TreeNode head){

        TreeNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.right;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);


        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        f.left= g;

        Q6 obj=new Q6();
        display(a);
        obj.flatten(a);
        display(a);




    }
}
