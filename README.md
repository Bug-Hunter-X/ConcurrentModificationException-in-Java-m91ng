# ConcurrentModificationException in Java

This repository demonstrates a common error in Java: the `ConcurrentModificationException`.  The `ConcurrentModificationExceptionExample.java` file contains code that throws this exception.  The `ConcurrentModificationExceptionSolution.java` file provides a corrected version.

The problem arises when attempting to modify a collection (like an ArrayList) while iterating over it using a traditional for-each loop or an iterator that doesn't support concurrent modifications.  This can lead to unexpected behavior and crashes. This example showcases how to avoid this.