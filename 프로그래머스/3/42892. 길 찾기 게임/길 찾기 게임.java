import java.util.*;
class Solution {
    
    public int[][] solution(int[][] nodeinfo) {
        
        List<Integer> preList = new ArrayList<>();
        List<Integer> afterList = new ArrayList<>();

        List<Node> nodeList = new ArrayList<>();
        for(int i = 0; i < nodeinfo.length; i++){
            int x = nodeinfo[i][0];
            int y = nodeinfo[i][1];
            Node node = new Node(x,y,i+1);
            nodeList.add(node);
        }
        
        // 정렬
        Collections.sort(nodeList);
        Node root = nodeList.get(0);        
        for(int i = 1; i < nodeList.size(); i++){
            update(root, nodeList.get(i));
        }
        
        preorder(nodeList.get(0), preList);
        afterOrder(nodeList.get(0), afterList);
        
        int[][] answer = new int[2][preList.size()];
        for(int i = 0; i < preList.size(); i++){
            answer[0][i] = preList.get(i);
            answer[1][i] = afterList.get(i);

        }
        
                
        return answer;
    }
    
    public void preorder(Node node, List<Integer> preList){
        preList.add(node.getValue());
        if(node.getLeft() != null){
            preorder(node.getLeft(), preList);
        }
        
        if(node.getRight() != null){
            preorder(node.getRight(), preList);
        }
    }
    
    public void afterOrder(Node node, List<Integer> list){
        if(node.getLeft() != null){
            afterOrder(node.getLeft(), list);
        }
        
        if(node.getRight() != null){
            afterOrder(node.getRight(), list);
        }
        
        list.add(node.getValue());
    }
    
    public void update(Node root, Node node ){
        if(root.getX() > node.getX()){
            if(root.getLeft() == null){
                root.setLeftNode(node);            
            }else{
                update(root.getLeft(), node);
            }
        }else{
            if(root.getRight() == null){
                root.setRightNode(node);
            }else{
                update(root.getRight(), node);
            }
        }
        
    }
}

class Node implements Comparable<Node> {
    int value;
    int x;
    int y;
    Node left;
    Node right;
    
    public Node(int x, int y, int value){
        this.x =x;
        this.y = y;
        this.value = value;
    }
    
    public Node getLeft(){
        return this.left;
    }
    
    public Node getRight(){
        return this.right;
    }
    
    public void setLeftNode(Node node){
        this.left = node;
    }
    public void setRightNode(Node node){
        this.right = node;
    }
        
    public int getY(){
        return this.y;
    }
        
    public int getX(){
        return this.x;
    }
    
    public int getValue(){
        return this.value;
    }
    
        
    @Override
    public int compareTo(Node node){
        if(this.y < node.getY()){
            return 1;
        }
        else if(this.y == node.getY()){
            if(this.x > node.getX()){
                return 1;
            }
            else{
                return -1;
            }

        }
        return -1;
    }
    public String toString(){
        return ""+ this.x+", "+ this.y+", value :"+value+"\n";
    }
}
