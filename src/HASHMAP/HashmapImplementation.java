package HASHMAP;


import java.util.*;

public class HashmapImplementation {

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Number of elements
        private int N; // Number of buckets
        private LinkedList<Node>[] buckets;

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            return (key.hashCode() & 0x7fffffff) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int index = 0;
            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return index;
                }
                index++;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N = N * 2;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;

            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            double lambda = (double) (n + 1) / N;
            if (lambda > 2.0) {
                rehash();
            }

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                buckets[bi].get(di).value = value;
            }
        }

        public boolean containsKey(K key) {
            return searchInLL(key, hashFunction(key)) != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) return null;

            Node removedNode = buckets[bi].remove(di);
            n--;
            return removedNode.value;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) return null;
            return buckets[bi].get(di).value;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}
