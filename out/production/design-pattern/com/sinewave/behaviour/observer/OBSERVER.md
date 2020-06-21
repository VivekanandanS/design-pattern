## Observer Pattern

### Intent 
Define one-to-many relationship between objects so that when state of one object changed , all its dependents 
notified and updated accordingly.

### Anti Pattern

Within a system, among different modules; sometimes its necessary to maintain consistency between them. This leading to
tight coupling, where one class have all their growing dependents to notify the changes. Here comes the observer pattern 
let us to concentrate on the relationship rather than how flow of data happens.

### Key Objects
   
* Subject
    Subject may have any number of observers.
* Observer
    Observer are notified, when state of subject is changed.
    
 