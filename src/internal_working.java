////public class internal_working {
////
////    JCF Class	Backed By	Internal Working You MUST Know
////    ArrayList	Dynamic Array	- Resizing logic (grow() method)
////            - Amortized O(1) add()
////            - O(n) remove()
////    LinkedList	Doubly Linked List	- Node structure
////- O(1) insertion/deletion from ends
////- O(n) search
////    HashMap	Array + Linked List + Tree (Red-Black)	- Hashing (hashCode(), equals())
////            - Load Factor (default 0.75)
////- Rehashing
////- Collision handling via chaining
////- Treeify after 8 entries
////    HashSet	Backed by HashMap	- Stores keys as map keys with dummy value <Object>
////- Same hashing + collision logic as HashMap
////    TreeMap	Red-Black Tree	- O(log n) operations
////- Natural or custom order
////- Node structure with balancing
////    TreeSet	Backed by TreeMap	- Same as TreeMap internally
////- Stores elements as map keys
////    PriorityQueue	Min Heap (Binary Heap)	- Heapify logic
////- offer() and poll() are O(log n)
////    Stack (legacy)	Vector subclass	- Synchronized
////- Outdated; prefer Deque
////    Deque (e.g., ArrayDeque)	Resizable Circular Array	- Fast O(1) addFirst, removeLast etc.
////    Vector	Resizable Array	- Like ArrayList but synchronized
////
////🧠 Also Understand:
////    Fail-fast vs fail-safe
////
////    Iterator vs ListIterator
////
////    Comparator vs Comparable
////
////    Synchronized Collections: Collections.synchronizedList(), ConcurrentHashMap (segmented locking before Java 8)
////
////    Load Factor and Threshold in HashMap
////
////    TreeMap ordering logic (compareTo() or compare())
////
////
////}
//
//
//
//
//
//Topic	Status	Next Action
//        🔘 ListIterator	❌ Not done	Must cover (it allows bidirectional traversal)
//        🔘 Fail-Fast vs Fail-Safe Iterators	❌ Not done	Very important for interviews
//        🔘 Enumeration (legacy)	❌ Optional	Not asked often, but good for completeness
//        🔘 HashMap Internal Working	⚠️ Partial	Need to cover put(), get(), resizing, load factor, etc.
//        🔘 TreeMap, TreeSet Internals	❌ Not done	Based on Red-Black Tree, good for MS-level prep
