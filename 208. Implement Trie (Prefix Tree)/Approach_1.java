class TreeNode {
    boolean isEnd = false;
    TreeNode children[] = new TreeNode[26];
}

class Trie {
    TreeNode root;

    public Trie() {
        root = new TreeNode();

    }

    public void insert(String word) {
        TreeNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TreeNode();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TreeNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null)
                return false;
            node = node.children[index];
        }
        if (node.isEnd == true)
            return true;
        return false;
    }

    public boolean startsWith(String prefix) {
        TreeNode node = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null)
                return false;
            node = node.children[index];
        }

        return true;

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */