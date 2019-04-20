package fr.lille.imt.tree;

public class BST <E extends Comparable<E>>{
    private class Node{
        public E e;
        public Node left,right;
        public Node(E e){
            this.e = e;
            right = null;
            left = null;
        }
    }


    private int size;
    private Node root;



    public BST(){
        this.size = 0;
        this.root = null;
    }


    public void add(E e){
        if(root == null){
            root = new Node(e);
            size++;
        }else{
            add(root,e);
        }
    }

    private void add(Node root,E e){
        if(e.compareTo(root.e)==1){
            if(root.right == null){
                root.right = new Node(e);
            }else{
                add(root.right,e);
            }
        }else if(e.compareTo(root.e) == -1){
            if(root.left == null){
                root.left = new Node(e);
            }else{
                add(root.left,e);
            }
        }
    }
}
