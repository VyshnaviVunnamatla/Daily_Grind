import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right; 
    TreeNode(int val){
        this.val=val;
    }
}

public class TreeEdgeFlipping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] par=new int[n];
        for(int i=0;i<n;i++) par[i]=sc.nextInt();
        int[] vals=new int[n];
        for(int i=0;i<n;i++) vals[i]=sc.nextInt();
        int q=sc.nextInt();
        String[] queries=new String[q];
        for(int i=0;i<q;i++) queries[i]=sc.next();
        TreeNode root=buildTree(par,vals); 
    }

    public static TreeNode buildTree(int[] par,int[] vals){
        Map<Integer,TreeNode> mp=new HashMap<>();
        
        return root;
    }
}
