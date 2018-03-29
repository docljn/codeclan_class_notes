require('pry-byebug')
require_relative('./models/pizza_order')
require_relative('./models/customer')
require_relative('./db/sql_runner')
# will work without sql_runner explicitly required as it's required elsewhere, but it makes the links between files clear, so include as best practice.

PizzaOrder.delete_all()
Customer.delete_all()


customer1 = Customer.new ({
  'first_name' => 'Sandy',
  'last_name' => 'Metz'
  })

customer2 = Customer.new ({
  'first_name' => 'David',
  'last_name' => 'Hansson'
  })

customer3 = Customer.new ({
  'first_name' => 'Robert',
  'last_name' => 'Martin'
  })

customer1.save()
customer2.save()
customer3.save()

order1 = PizzaOrder.new({
  'topping' => 'Mushroom',
  'quantity' => '2',
  'customer_id' => customer1.id
  })
order2 = PizzaOrder.new({
  'topping' => 'Parma Ham & Rocket',
  'quantity' => '1',
  'customer_id' => customer3.id
  })
order3 = PizzaOrder.new({
  'topping' => 'Pepperoni & Olives',
  'quantity' => '3',
  'customer_id' => customer3.id
  })

order1.save()
order2.save()
order3.save()

# order2.delete()

order3.quantity = 100
order3.update()

my_customer = order1.customer()

my_orders = customer3.pizza_orders()



# customer = PizzaOrder.find_customer_by_pizza_id(order3.id)



binding.pry
nil
