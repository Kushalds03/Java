import java.util.LinkedList;

public class HashMap_implement {
    public class HashMap<K,V> {  //generic (the value of the key and the value may be anytype )
         private class Node {
            K key;
            V value;
            
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
         }

         private  int size; //n
         private  LinkedList<Node> buckets[];   //N = buckets.length (it is a array which store linked list )
         
         @SuppressWarnings("unchecked")

         public HashMap(){
            this.size = 0;
            this.buckets = new LinkedList[4];
            for(int i = 0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }

         }
         private int hashFunction(K key){

         }
         public void put(K key, V value){
            int bi = hashFunction(key);
            

         }
         public boolean containsKey(K key){
            return false;

         }
         public V remove(K key){
            return null;

         }
         public  V get(K key){
            return null;
         }
         public  ArrayList<K> keySet(){
            return null;
         }
    } 


    public static void main(String[] args) {
        
    }
}
