class TrieNode {
public:
    TrieNode* children[26];
    bool isEnd;

    TrieNode() {
        for (int i = 0; i < 26; ++i) {
            children[i] = nullptr;
        }
        isEnd = false;
    }
};

class WordDictionary {
public:
    TrieNode* root;

    WordDictionary() {
        root = new TrieNode();
    }

    // Adds a word to the trie
    void addWord(string word) {
        TrieNode* node = root;
        for (char c : word) {
            int index = c - 'a';
            if (node->children[index] == nullptr) {
                node->children[index] = new TrieNode();
            }
            node = node->children[index];
        }
        node->isEnd = true;
    }

    // Search for a word with possible dots
    bool search(string word) {
        return searchHelper(word, 0, root);
    }

private:
    bool searchHelper(const string& word, int index, TrieNode* node) {
        if (index == word.size()) {
            return node->isEnd;
        }

        char c = word[index];
        if (c == '.') {
            // If it's a dot, try all children
            for (int i = 0; i < 26; ++i) {
                if (node->children[i] && searchHelper(word, index + 1, node->children[i])) {
                    return true;
                }
            }
            return false;
        } else {
            // If it's a regular character, continue to the corresponding child node
            int childIndex = c - 'a';
            if (node->children[childIndex]) {
                return searchHelper(word, index + 1, node->children[childIndex]);
            }
            return false;
        }
    }
};
