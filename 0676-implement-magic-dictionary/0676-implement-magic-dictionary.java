class MagicDictionary {
    class Trie{
        static class Node{
            Node children[] = new Node[26];
            boolean flag;
            boolean containsKey(char ch){
                return children[ch - 'a'] != null;
            }
            void put(char ch, Node node){
                children[ch - 'a'] = node;
            }
            Node get(char ch){
                return children[ch - 'a'];
            }
            void setEnd(){
                flag =true;
            }
            boolean isEnd(){
                return flag;
            }           
        }

        private Node root;
        Trie(){
            root = new Node();
        }
        
        public void insert(String word){
            Node node = root;
            for(char ch: word.toCharArray()){
                if(!node.containsKey(ch)){
                    node.put(ch, new Node());
                }
                node = node.get(ch);
            }
            node.setEnd();
        }

        public boolean search(String word, int c, Node root, int n, int idx){
            if(idx >= n){
                if(c == 1 && root.isEnd()) return true;
                else return false;
            }
            if(c > 1) return false;
        
            boolean key = false;
            int index = word.charAt(idx) - 'a';
            for(int i=0;i<26;i++){
                Node child = root.children[i];
                if(child != null && i == index){
                    key = search(word, c, child, n, idx+1);
                    if(key) return true;
                }
                if(child != null && i != index){
                    key = search(word, c+1, child, n, idx+1);
                    if(key) return true;
                }
            }
            

            return false;
        }

        public boolean check(String word){
            return search(word, 0, root, word.length(), 0);
        }
    }

    Trie trie;
    public MagicDictionary() {
        trie = new Trie();
    }
    
    public void buildDict(String[] dictionary) {
        for(String word: dictionary){
            trie.insert(word);
        }
    }
    
    public boolean search(String searchWord) {
        return trie.check(searchWord);
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */