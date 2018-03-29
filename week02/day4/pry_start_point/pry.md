*gem install pry

at top of ruby file: require("pry")
above line where error is happening: binding.pry

this will pause the program at the point before the error
you can then inspect all the variables and methods by typing them into the terminal
ls will give you everything you have access to at this point.
the environment is very similar to irb

you can use multiple binding.pry points to step through the app.

to exit pry, type !!!


*gem install pry-byebug

adds to pry

in pry, type 'continue' to step through the function.
this will move from one binding.pry to the next, and then return to loop through the function if the binding is within a loop

in pry, you can reassign variables etc to make temp changes as part of debugging
