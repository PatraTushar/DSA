package TREE;

public class BinarySearchTree {

    public static  class BST {
        public class Node {
            private int value;
            private Node left;
            private Node right;
            private int height;

            public Node(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }
        }

        private Node root;

        public BST() {

        }

        public void insert(int value) {
            root = insert(value, root);
        }

        private Node insert(int value, Node node) {
            if (node == null) {
                node = new Node(value);
                return node;
            }

            if (value < node.value) {
                node.left = insert(value, node.left);
            }

            if (value > node.value) {
                node.right = insert(value, node.right);
            }

            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return node;
        }

        public void populate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                this.insert(nums[i]);
            }
        }

        public void populatedSorted(int[] nums) {
            populatedSorted(nums, 0, nums.length);
        }

        private void populatedSorted(int[] nums, int start, int end) {
            if (start >= end) {
                return;
            }

            int mid = (start + end) / 2;

            this.insert(nums[mid]);
            populatedSorted(nums, start, mid);
            populatedSorted(nums, mid + 1, end);
        }

        public void display() {
            display(this.root, "Root Node: ");
        }

        private void display(Node node, String details) {
            if (node == null) {
                return;
            }

            System.out.println(details + node.value);
            display(node.left, "Left child of " + node.value + " : ");
            display(node.right, "Right child of " + node.value + " : ");
        }

        public boolean isEmpty() {
            return root == null;
        }

        public int height(Node node) {
            if (node == null) {
                return -1;
            }
            return node.height;
        }

        public boolean balanced() {
            return balanced(root);
        }

        private boolean balanced(Node node) {
            if (node == null) {
                return true;
            }

            return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
        }

        public void preorder(){

            preorder(root);

        }

        private void preorder(Node node){

            if(node==null){
                return;
            }

            System.out.print(node.value +" ");
            preorder(node.left);
            preorder(node.right);
        }


        public void Inorder(){

            Inorder(root);

        }

        private void Inorder(Node node){

            if(node==null){
                return;
            }


            preorder(node.left);
            System.out.print(node.value +" ");
            preorder(node.right);
        }


        public void postorder(){

            postorder(root);

        }

        private void postorder(Node node){

            if(node==null){
                return;
            }


            preorder(node.left);
            preorder(node.right);
            System.out.print(node.value +" ");
        }



    }
    public static void main(String[] args) {

        BST tree=new BST();
        int[] nums={5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
     //   tree.populatedSorted(nums);
        tree.display();
       // System.out.println(tree.height(tree.root));
       // tree.preorder();


    }
}
