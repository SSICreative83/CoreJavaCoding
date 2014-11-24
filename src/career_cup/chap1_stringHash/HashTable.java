/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CareerCup.Chap1_StringHash;

/**
 *
 * @author huijun
 */
public class HashTable {

    public static final int CAPACITY = 100;
    private HashTableItem[] hashTable = new HashTableItem[CAPACITY];
    private Integer size = 0;

    /**
     * @return the hashTable
     */
    public HashTableItem[] getHashTable() {
        return hashTable;
    }

    /**
     * @param hashTable the hashTable to set
     */
    public void setHashTable(HashTableItem[] hashTable) {
        this.hashTable = hashTable;
    }

    /**
     * @return the size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    public void put(Integer key, Object value) {
        HashTableItem item = new HashTableItem(key, value);

        int index = hash(key.hashCode()) % (size + 1);

        this.hashTable[index] = item;
        this.size++;
    }

    public void delete(Integer key) {
        for (int i = 0; i < this.hashTable.length; i++) {
            HashTableItem item = this.hashTable[i];
            if (item.getKey() == key) {
                for (int j = i; j < this.hashTable.length; j++) {
                    this.hashTable[j] = this.hashTable[j + 1];
                }
                this.hashTable[size] = null;
                break;
            }
        }
    }

    public HashTableItem searchByIndex(Integer key) {
        int index = hash(key.hashCode()) % (size + 1);

        return this.hashTable[index];
    }

    private synchronized int hash(int h) {

        h ^= (h >>> 20) ^ (h >>> 12);

        return h ^ (h >>> 7) ^ (h >>> 4);

    }

}
