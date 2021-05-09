package Collections;

public class HashMapQuestions {

	public static void main(String[] args) {
		//Put Method works on HashMap principle and it stores values in the form of key and value pair. 
		//Hashcode will be calculated and on its' basis index will be calculated. 
		//Every node has 4 info. :- key,HashCode,value,pointer
		//Key and Value should implement hashcode method. 
		//Hashcode method is from object class .
		//Hashcode method is applied at the time of insertion (put()) method and Equals method is called at the time of get() 
		//retrieving of values
		//.equals method will be used at the time of get method and it CHecks hashcode of key is matched or not
		//it will return ,whatever the value is available 
		// Requirement of Key or value in HashMap-->both k and v should implement hashcode() and equals() method
		//if we store the existing key,it will override the existing value.
		//only one key (of same type)is allowed in HashMap
		//Hashmap does allow only one null keys and it allows multiple null values.
		//Hashmap does not allow duplicate keys// Hashmap can have duplicate values.
		//Initially HashMap create 16 buckets with load factor 0.75
		//if 2 values are stores at same index then it is called as collision.and two nodes are stored in the form of Linkedlist
		//once 8 nodes of linked list are filled ,java will convert it into Binary Balanced tree
		//All the bigger value will be stored at RHS and lesser value at LHS
		//Linked list and binary tree are used to represent HashMap
		//NO can't store duplicate keys in the HashMap will get the latest value at the time of call.(won''t give any error at runtime)
		//No can't store duplicate values in the HashMap and will get the latest value at the time of call.
		//HashMap is not thread-safe //non-synchronized
		//can't use hashmap in multithreading ,data may get corrupted/data may not get udpated.
		// different ways to iterate hashmap:--->
		//1)Keyset and iterator //2) entryset and iterator 
		//3)entryset and enhanced for loop /4)keyset and get method
		//5)for each method and lambda 
		
		//remove() to remove the mapping in the Hashmap
		//Hashmap is stored in random order.//Cuz hashcode might be different everytime it is calculated and index also might
		// be different
		
		// we can not sort Hashmap in java unlike list as it does not maintain any order.
		// we will have to convert it into SortedMap or LinkedHashMap for sorting purpose.
		// load factor is a number that controls the resizing of Hashmap .When the number of elements in hashmap crosses
		// load factor (LF=0.75) then resizing triggers and involved array copy.
		
		//There is no limit to store any key-value pair // to check the size -Size()\
		//Capacity of Hashmap-->Means how many entried HashMap can store .
		//Size()-->count of mappings/key-value() present
		
		//two different keys are having same hashcode then collision will happen and they 
		//wil be stored in LL order and //Best Time complexity:-O(n)
		//Worst time complexity - O(logn)
		 
		
		
	}

}
