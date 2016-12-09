package homework6;

public class BinarySearchTree {
public static Node root;
public BinarySearchTree(){
this.root = null;
}

public boolean find(int id){
Node current = root;
while(current!=null){
if(current.data==id){
return true;
}else if(current.data>id){
current = current.left;
}else{
current = current.right;
}
}
return false;
}
public boolean delete(int id){
Node parent = root;
Node current = root;
boolean isLeftChild = false;
while(current.data!=id){
parent = current;
if(current.data>id){
isLeftChild = true;
current = current.left;
}else{
isLeftChild = false;
current = current.right;
}
if(current ==null){
return false;
}
}
//if i am here that means we have found the node
//Case 1: if node to be deleted has no children
if(current.left==null && current.right==null){
if(current==root){
root = null;
}
if(isLeftChild ==true){
parent.left = null;
}else{
parent.right = null;
}
}


