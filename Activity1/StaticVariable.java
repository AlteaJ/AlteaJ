class StaticVariable {
    static int instanceCount = 0; // Static variable to count instances

    StaticVariable() {
        instanceCount++; // Increment the instance count on object creation
    }
}

