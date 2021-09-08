public class BstTreeBinarySort {
    static class BsNode1{
        int val;
        BsNode1 left;
        BsNode1 right;
        BsNode1(int val){
            this.val = val;
        }



    }
    static class Bstree{
        BsNode1 root;

        Bstree(){
            root = null;
        }


        public void insert(int val){

            root = insert(root,val);

        }

        private BsNode1 insert(BsNode1 curr, int val) {
            if(curr==null){
                return new BsNode1(val);
            }
            if(val>curr.val){
               // System.out.println("iam at if");
                curr.right = insert(curr.right,val);

            }
            else //val<curr.val
            {
              //  System.out.println("iam at else");
                curr.left = insert(curr.left,val);
            }
            return curr;

        }
        public void inorder(BsNode1 bsn){
            if(bsn == null){
                return;
            }
            inorder(bsn.left);
            System.out.println("current val is "+bsn.val);
            inorder(bsn.right);

        }



    }




    public static void main(String[] args) {
      int arr1[]  = {5,6,9,4,2,9,12};
       Bstree bst = new Bstree();

      for (int i=0;i<arr1.length;i++){
      bst.insert(arr1[i]);

      }
      bst.inorder(bst.root);

    }








}
