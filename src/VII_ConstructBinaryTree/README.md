# 7.重建二叉树

__TreeNode定义如下__
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
```
二叉树是一种树的组织形式，但是我也不知道为什么这玩儿，总是翻来覆去的要考

### 二叉树的前序遍历
```java
public void preOrder(TreeNode node) {
    if (node == null) {
        return;
    }
    System.out.println(node.val);
    preOrder(node.left);
    preOrder(node.right);
}
```

### 二叉树的中序遍历
```java
public void midOrder(TreeNode node) {
    if (node == null) {
        return;
    }
    midOrder(node.left);
    System.out.println(node.val);
    midOrder(node.right);
}
```

### 二叉树的后序遍历
```java
public void postOrder(TreeNode node) {
    if (node == null) {
        return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.val);
}
```

具体的测试代码见BinaryTreeTreversal.java