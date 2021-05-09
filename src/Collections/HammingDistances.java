package Collections;

//Java program to find hamming distance 
//b/w two string 
public class HammingDistances
{ 
//function to calculate Hamming distance 
static int hammingDist(String str1, String str2) 
{ 
	int i = 0, count = 0; 
	while (i < str1.length()) 
	{ 
		if (str1.charAt(i) != str2.charAt(i)) 
			count++; 
		i++; 
	} 
	return count; 
} 

//Driver code 
public static void main (String[] args) 
{ 
	String str1 = "Help"; 
	String str2 = "Hell"; 

	// function call 
	System.out.println("Hamming Distance between "+ str1 +" and "+ str2 +" is "+hammingDist (str1, str2)); 
} 
} 



