public class MyHashTable<K, V> {

    private class HashNode<K, V>{

        private K key;

        private V value;

        private HashNode<K, V> next;

        // Constructor

        public HashNode(K key, V value){

            this.key = key;

            this.value = value;

        }


        public String toString(){

            return "{" + key + " " + value + "}";

        }

    }




    private HashNode<K, V>[] chainArray; //or Object []

    private int M = 11;

    private int size;

    private final double LOAD_FACTOR_THRESHOLD = 120;


    public MyHashTable() {

        chainArray = new HashNode[M];

        size = 0;

    }



    public MyHashTable(int M) {

        this.M = M;

        chainArray = new HashNode[M];

        size = 0;

    }


    private int hash(K key) {

        if (key instanceof MyTestingClass) {

            MyTestingClass myKey = (MyTestingClass) key;

            return Math.abs(myKey.hashCode() % M);

        }

        return Math.abs(key.hashCode() % M);

    }

   value);

        newNode.next = chainArray[index];

        chainArray[index] = newNode;

        size++;


        double loadFactor = (double) size / M;

        if (loadFactor > LOAD_FACTOR_THRESHOLD) {

            resize(2 * M);

        }

    }



