package ca.bcit.comp1510.lab11;

/** if object lockable.
 * @author Alex Wong a.wong555@bcit.ca
 * @version 1.0
 */
public class Lockable {
    /** set keys.
     * @param key int 
     * @return int of key.
     */
    public int setKey(int key) {
        return key;
    }
    
    /** lock.
     * @param key int
     * @return boolean if locked
     */
    public boolean lock(int key) {
        return true;
    }
    
    /** unlock key.
     * @param key int
     * @return boolean if unlocked
     */
    public boolean unlock(int key) {
        return true;
    }
    
    /** locked.
     * @return true if obj is locked.
     */
    public boolean locked() {
        return true;
    }
    
    
    
    
}
