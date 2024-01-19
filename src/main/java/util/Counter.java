package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--; // faulty decrement
	}

	// method resets _ctr
	public void reset() {
		_ctr = 0; // faulty reset, _ctr should rather be 0
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
		increment();
		// Check if the current value of _ctr is even
		if (_ctr % 2 == 0) {
			// Already even, no need to increment
			System.out.println("Counter is already even.");
		} else {
			// Increment to the closest even number
			_ctr = (_ctr % 2 == 0) ? _ctr : _ctr + 1;
			System.out.println("Incremented to the closest even number.");
		}
	}

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		decrement();
		// Check if the current value of _ctr is even
		if (_ctr % 2 == 0) {
			// Already even, no need to decrement
			System.out.println("Counter is already even.");
		} else {
			// Decrement to the closest even number
			_ctr = (_ctr % 2 == 0) ? _ctr : _ctr - 1;
			System.out.println("Decremented to the closest even number.");
		}
	}
    

	// TODO: dev2- method for increment to closest prime number
	public void incrementToPrime() {
        // Increment _ctr until a prime number is found
        while (!isPrime(_ctr)) {
            _ctr++;
        }
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

	// TODO: dev2- method for decrement to closest prime number
	public void decrementToPrime() {
        // Decrement _ctr until a prime number is found
        while (!isPrime(_ctr)) {
            _ctr--;
        }
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public static void main(String[] args) {
        WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();
        String sentence = "This is a sample sentence. Sample sentences are used for testing.";
        String targetWord = "sample";

        int frequency = wordFrequencyCounter.countFrequency(targetWord, sentence);

        System.out.println("Frequency of '" + targetWord + "': " + frequency);

        Map<String, Integer> wordFrequencyMap = wordFrequencyCounter.getWordFrequencyMap();
        System.out.println("Word frequencies: " + wordFrequencyMap);
    }

}
