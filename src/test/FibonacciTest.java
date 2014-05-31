package test;

import math.Fibonacci;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest {
	@Test
	public void testFib() {
		assertEquals("Fibonacci(1) is 1", 1, Fibonacci.fib(1));
		assertEquals("Fibonacci(2) is 1", 1, Fibonacci.fib(2));
		assertEquals("Fibonacci(3) is 2", 2, Fibonacci.fib(3));
		assertEquals("Fibonacci(4) is 3", 3, Fibonacci.fib(4));
		assertEquals("Fibonacci(5) is 5", 5, Fibonacci.fib(5));
		assertEquals("Fibonacci(6) is 8", 8, Fibonacci.fib(6));
		assertEquals("Fibonacci(7) is 13", 13, Fibonacci.fib(7));
	}
}
