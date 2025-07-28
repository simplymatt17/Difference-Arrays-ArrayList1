package differenceArraysArrayLists;

import java.util.ArrayList;
public class DiscussionPost {

	public static void main(String[] args) {
		        // ======== ARRAY EXAMPLE ==========
		        // Arrays have fixed size
		        int[] numbersArray = new int[3];
		        numbersArray[0] = 10;
		        numbersArray[1] = 20;
		        numbersArray[2] = 30;

		        // You cannot add more elements unless you create a new array
		        System.out.println("Array Elements:");
		        for (int i = 0; i < numbersArray.length; i++) {
		            System.out.println("Index " + i + ": " + numbersArray[i]);
		        }

		        // ======== ARRAYLIST EXAMPLE ==========
		        // ArrayLists can grow and shrink dynamically
		        ArrayList<Integer> numbersList = new ArrayList<>();

		        // Add elements using .add()
		        numbersList.add(10);
		        numbersList.add(20);
		        numbersList.add(30);
		        numbersList.add(40); // Can add more elements without size limits

		        System.out.println("\nArrayList Elements:");
		        for (int i = 0; i < numbersList.size(); i++) {
		            System.out.println("Index " + i + ": " + numbersList.get(i));
		        }

		        // Demonstrate additional ArrayList functionality
		        numbersList.remove(1); // Removes the element at index 1
		        System.out.println("\nAfter removing element at index 1:");
		        System.out.println("New size: " + numbersList.size());
		        System.out.println("Updated List: " + numbersList);
		    }
		}