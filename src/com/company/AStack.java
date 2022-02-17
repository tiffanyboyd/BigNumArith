package com.company;

class AStack implements Stack {
    private Object stackArray[];    // Array holding stack
    private static final int DEFAULT_SIZE = 10;
    private int maxSize;            // Maximum size of stack
    private int top;                // First free position at top

    // Constructors
    AStack(int size) {
        maxSize = size;
        top = 0;
        stackArray = new Object[size]; // Create stackArray
    }
    AStack() { this(DEFAULT_SIZE); }

    public void clear() { top = 0; }    // Reinitialize stack

    // Push "it" onto stack
    public boolean push(Object it) {
        if (top >= maxSize) return false;
        stackArray[top++] = it;
        return true;
    }

    // Remove and return top element
    public Object pop() {
        if (top == 0) return null;
        return stackArray[--top];
    }

    public Object topValue() {          // Return top element
        if (top == 0) return null;
        return stackArray[top-1];
    }

    public int length() { return top; } // Return stack size

    public boolean isEmpty() { return top == 0; } // Check if the stack is empty
}
