Difference between an abstract class and an interface:
1. extends vs implements;
2. implemented class should override all methods of the interface. Extended class can use methods of abstract class and should override only abstract methods.
3. it is possible to implement a few interface in the class, but it is not possible to extend more than 1 abstract class.
4. fields in abstract class could have any modification (public, protected, default, private), could be initialized or not.
Interface's restrictions: any fields in interface should be initialized and all fields are public, static and final by default.

Difference between Runnable and Thread:
Runnable has method run() and could be executed in thread. 
Thread has method start() and create new thread inside main thread.
