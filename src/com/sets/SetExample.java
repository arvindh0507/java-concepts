package com.sets;

import java.util.*;

public class SetExample {
	public static void main(String[] args) {

		Set<Integer> hash_Set = new HashSet<Integer>();

		// HashSet is backed by a HashMap. It makes no guarantees about the
		// sequence of the elements
		// when you iterate them.
		//HashSet internally uses Hashmap for its implementation.
		//HashSet is an unordered collection and doesn't maintain any order.

		// LinkedHashSet differs from HashSet by guaranteeing that the order of
		// the elements during iteration is the same
		// as the order they were inserted into the LinkedHashSet. Reinserting
		// an element that is already in the LinkedHashSet
		// does not change this order.

		// TreeSet also guarantees the order of the elements when iterated, but
		// the order is the sorting order of the elements.
		// In other words, the order in which the elements would be sorted if
		// you used a Collections.sort()
		// on a List or array containing these elements. This order is
		// determined either by their natural order
		// (if they implement Comparable), or by a specific Comparator
		// implementation.

		// Set setA = new HashSet();
		// Set setB = new LinkedHashSet();
		// Set setC = new TreeSet();

		hash_Set.add(10);
		hash_Set.add(5);
		hash_Set.add(15);
		hash_Set.add(15);
		hash_Set.add(2);
		hash_Set.add(3);

		System.out.println(hash_Set);
		
		System.out.println("Traversing over Set Without Iterator");
		for (Integer i : hash_Set) {
			System.out.println("Value : " + i);
		}
		
		// traversing over HashSet
		Iterator<Integer> itr = hash_Set.iterator();
		System.out.println("Traversing over Set using Iterator");
		while (itr.hasNext()) {
			System.out.println("Value From Iterator : "+itr.next());
		}

		System.out.println("Size = " +hash_Set.size());
		System.out.println(" HashCode = "+ hash_Set.hashCode());
		
		hash_Set.remove(2);
		System.out.println(hash_Set);
		System.out.println(" HashCode = "+ hash_Set.hashCode());
		
		System.out.println("Size = " +hash_Set.size());
		System.out.println(" HashCode = "+ hash_Set.hashCode());
		
		hash_Set.clear();
		System.out.println(hash_Set);
		
		System.out.println("Size = " +hash_Set.size());
		
		System.out.println(" HashCode = "+ hash_Set.hashCode());
		
		// int size() Returns the number of elements in the set.
		// boolean isEmpty() Checks whether the set is empty or not.
		// boolean contains(Object o) Checks whether this set has specified
		// element.
		// Iterator<E> iterator() Returns an iterator over the set.
		// Object[] toArray() It returns an array containing all elements of the
		// set.
		// <T> T[] toArray(T[] a) It returns an array of specified type
		// containing all elements of this set.
		// boolean add(E e) This method adds specified element to this set only
		// if that element doesn’t present already. It returns true if element
		// is added successfully otherwise returns false.
		// boolean remove(Object o) Removes the specified element from this set.
		// boolean containsAll(Collection<?> c) It checks whether this set
		// contains all elements of passed collection.
		// boolean addAll(Collection<? extends E> c) Adds all elements of the
		// passed collection to this set if they are not already present.
		// boolean removeAll(Collection<?> c) Removes all elements of this set
		// which are also elements of passed collection.
		// boolean retainAll(Collection<?> c) Retains only those elements in
		// this set which are also elements of passed collection.
		// void clear() Removes all elements in this set.
		// boolean equals(Object o) Compares the specified object with this set
		// for equality.
		// int hashCode() Returns the hash code value of this set.
	}
}
