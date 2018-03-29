# console.rb

# a playground to manually test the code

require ('pry-byebug')
require_relative ('./models/pizza_order.rb')

# to match what the database will eventually provide, all options have to be in string format.

# we can't specify an id at this stage, as it is auto-generated in the database.

# we use a gem: pg to link the database and ruby code.
# this is in the pizza_order.rb file as that is where it is being used.

# in this file, we can test the initialize, save and other methods.

PizzaOrder.delete_all()  # clears the table before each run.

order1 = PizzaOrder.new({
  'first_name' => 'Luke',
  'last_name' => 'Skywalker',
  'quantity' => '1',
  'topping' => 'Napoli'
})

order2 = PizzaOrder.new({
  'first_name' => 'Darth',
  'last_name' => 'Vader',
  'quantity' => '1',
  'topping' => 'Quattro Formaggi'
})

order1.save()
order2.save()
# order1.delete()

order1.first_name = "Fred"
order1.update()
# then need an update method to reflect that in the database.

orders = PizzaOrder.all()

binding.pry
# there must be something for binding.pry to grab onto and stop.
nil
