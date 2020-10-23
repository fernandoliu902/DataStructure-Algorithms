//在查寻一个结点的时候，把这个节点及这个节点之前的节点全部指向根节点
//用递归完成
public class UnionFind6 implements UF {
    private int[] parent;
    private int[] rank;

    public UnionFind6(int size){
        parent = new int[size];
        rank = new int[size];
        //初始并查集
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }


    @Override
    public int getSize() {
        return parent.length;
    }
    // 查找过程, 查找元素p所对应的集合编号
    // O(h)复杂度, h为树的高度
    private int find(int p){
        if(p < 0 || p >= parent.length)
            throw new IllegalArgumentException("p is out of bound.");

        // path compression 2, 递归算法
        if (p != parent[p]) {
            parent[p] = find(parent[p]);
        }
        return parent[p]; //返回的是根节点
    }

    // 查看元素p和元素q是否所属一个集合
    // O(h)复杂度, h为树的高度
    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    // 合并元素p和元素q所属的集合
    // O(h)复杂度, h为树的高度
    @Override
    public void unionElements(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) {
            return;
        }

        // 根据两个元素所在树的rank不同判断合并方向
        // 将rank低的集合合并到rank高的集合上
        if(rank[pRoot] < rank[qRoot]) {
            parent[pRoot] = qRoot;
        }else if(rank[qRoot] < rank[pRoot]) {
            parent[qRoot] = pRoot;
        }else{ //rank[pRoot] == rank[qRoot]
            parent[pRoot] = qRoot;
            rank[qRoot] += 1;
        }
    }
}
