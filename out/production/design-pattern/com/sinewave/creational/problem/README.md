This function is pretty complicated, considering that all it does is create a maze with two rooms. There are obvious ways to make it simpler. For example, the Room constructor could initialize the sides with walls ahead of time. But that just moves the code somewhere else.The real problem with this member function isn't
its size but its inflexibility. It hard-codes the maze layout. Changing the layout means changing this member function, either by overriding it—which means reimplementing the whole thing—or by changing parts of it—which is error-prone and doesn't promote reuse.


The creational patterns show how to make this design more flexible, not necessarily
smaller. In particular, they will make iteasy to change the classes that define
the components of a maze 