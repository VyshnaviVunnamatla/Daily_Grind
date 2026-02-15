import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}

public class PerfectSquares {

    public static void main(String[] args){
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(9);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(7);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(3);

        System.out.println(totalperfsq(root));
    }
    static int MOD=1000000007;

    public static int totalperfsq(TreeNode root){
        if(root==null) return 0;
        ArrayList<Integer> subnodes=new ArrayList<>();
        preorder(root,subnodes);
        return (cntperfsq(subnodes)+totalperfsq(root.left)+totalperfsq(root.right))%MOD;

    }
    public static int cntperfsq(ArrayList<Integer> subnodes){
        int cnt=0;
        if(subnodes.size()<2) return 0;
        for(int i=0;i<subnodes.size()-1;i++){
            for(int j=i+1;j<subnodes.size();j++){
                if(perfsq(subnodes.get(i),subnodes.get(j))) cnt++;
            }
        }
        return cnt;
    }
    public static void preorder(TreeNode root,ArrayList<Integer> subnodes){
        if(root==null) return;
        subnodes.add(root.val);
        preorder(root.left,subnodes);
        preorder(root.right,subnodes);
    }
    public static boolean perfsq(int x1,int x2){
        int prod=x1*x2;
        int sr=(int)Math.sqrt(prod);
        return (sr*sr==prod);
    }
}

