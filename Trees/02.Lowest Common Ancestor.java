import java.util.*;


// class Node {
//     Node left;
//     Node right;
//     int data;
    
//     Node(int data) {
//         this.data = data;
//         left = null;
//         right = null;
//     }
// }

class lcaa {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
          
          ArrayList<Node> al1= find(root,v1);
          ArrayList<Node> al2 = find(root,v2);
        //   for(Node ele:al1)
        //     System.out.println(ele.data+" ");
        //   for(Node ele:al2)
        //     System.out.println(ele.data+" ");
          int i=al1.size()-1,j=al2.size()-1;
          while(i>=0 && j>=0){
              if(al1.get(i) !=  al2.get(j)){
                  break;
              }
              i--;
              j--;
          }
          
          return al1.get(i+1);
    }
    
    
    public static ArrayList<Node> find(Node root, int v1){
        if(root == null){
            return new ArrayList<>();
        }
        
        
        if(root.data == v1){
            ArrayList<Node> base = new ArrayList<>();
            base.add(root);
            return base;
        }
        
        ArrayList<Node> left = find(root.left,v1);
        if(left.size()>0){
            left.add(root);
            return left;
        }
        ArrayList<Node> right = find(root.right,v1);
        if(right.size()>0){
            right.add(root);
            return right;
        }
        
        return new ArrayList<>();
        
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
      	int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }	
}