package ru.artem.cherkasov.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAlgorithms {

	@Test
	public void testAlgorithms(){
		
		Integer a[] = {
						45,
						34,
						443,
						656,
						1234,
						46,
						2,
						45,
						34,
						120,
						23
					};

		assertEquals(1234, Algorithms.maxElement(a).intValue());
		assertEquals("dcba", Algorithms.reverseLine("abcd"));
		
		String line = "AAAAABBBCCA";
		
		assertEquals(3, Algorithms.frequencyLetters(line).size());
		assertEquals(6, Algorithms.frequencyLetters(line).get("A").intValue());
		assertEquals(2, Algorithms.frequencyLetters(line).get("C").intValue());
		
	}
	
}