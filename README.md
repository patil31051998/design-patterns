# design-patterns
## Creational design pattern
### Factory method
The factory design pattern says to define an interface ( A java interface or an abstract class) for creating the object and let the subclasses decide which class to instantiate.

![Factory](https://github.com/patil31051998/design-patterns/assets/145420889/b1f9b7e3-5c08-4a79-8492-6448898f0431)

### Abstract factory method
Abstract Factory patterns work around a super-factory which creates other factories. It's a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

![AbstractFactory drawio](https://github.com/patil31051998/design-patterns/assets/145420889/130c22d2-9917-4d23-aa73-a34e62d088b5)

### Singleton
Singleton Pattern says that define a class that has only one instance and provides a global point of access to it.

![Singleton drawio](https://github.com/patil31051998/design-patterns/assets/145420889/a3492517-80bc-4f98-89be-b5de71b2173d)

### Builder
The Builder Design Pattern is a creational pattern used in software design to construct a complex object step by step
There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes
1. Too Many arguments to pass from client program to the Factory class
2. Some parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
3. If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.

![Builder drawio](https://github.com/patil31051998/design-patterns/assets/145420889/6eeed031-1786-4c84-9863-ea6d07ed16d5)

### Prototype
Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs

![Prototype drawio](https://github.com/patil31051998/design-patterns/assets/145420889/4d902c40-1039-40ed-8904-28fb0ed68e74)
