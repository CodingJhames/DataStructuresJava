/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;


public class HashTable {
    
    private int size;
    private Object[] table;

    public HashTable(int size) {
        this.size = size;
        table = new Object[size];
    }
    
    private int hashFunction(Object key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % size);
    }
    
    public void put(Object key, Object value) {
        int index = hashFunction(key);
        table[index] = value;
    }

    public Object get(Object key) {
        int index = hashFunction(key);
        return table[index];
    }


    public static void main(String[] args) {
        HashTable hashtable = new HashTable(10);
        hashtable.put("clave1", "valor1");
        hashtable.put("clave2", "valor2");
    
        System.out.println(hashtable.get("clave1")); 
        System.out.println(hashtable.get("clave2"));
    }
    
   
}

