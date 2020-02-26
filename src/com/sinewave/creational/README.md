## Creational Pattern

Creational Pattern defines how objects are being instantiated, composed and represented. Creational pattern are important when system evolves to depend more on the composition(has a relationship) than a class inheritance.


For creational design problem , we ll refer to problem mentioned in GoF . Problem statement is under ./problem folder

![](https://github.com/VivekanandanS/design-pattern/blob/master/resources/images/maze-problem.png)


The classes Room, Door, and Walldefine the components of the maze used in all our examples. We define only the parts of these classes that are important for creating amaze. We'll ignore players, operations for displaying and wandering around in a maze, and other important functionality that isn't relevant to building the maze. 

Each room has four sides. We use an enumeration Direction in Java implementations to specify the north, south, east, and west sides of a room
