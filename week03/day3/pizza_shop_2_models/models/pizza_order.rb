require('pg')
require_relative('../db/sql_runner')
require_relative('../models/customer')

class PizzaOrder

  attr_accessor :quantity, :topping
  attr_reader :id, :customer_id

  def initialize( options )
    @id = options['id'].to_i() if options['id']
    @customer_id = options['customer_id'].to_i()
    @quantity = options['quantity'].to_i()
    @topping = options['topping']
  end

  def save()
    sql =
      "INSERT INTO pizza_orders
        ( customer_id,
          quantity,
          topping
        )
      VALUES
        ($1, $2, $3)
      RETURNING id
      ;"
    values = [@customer_id, @quantity, @topping]
    @id = SqlRunner.run(sql, values)[0]['id'].to_i
  end

  # class methods

  def self.all()
    sql = "SELECT * FROM pizza_orders;"
    orders = SqlRunner.run(sql)
    return orders.map {|order| PizzaOrder.new(order)}
  end

  def self.delete_all()
    sql = "DELETE FROM pizza_orders;"
    SqlRunner.run(sql)
  end

  # instance methods

  def delete()
    sql = "DELETE FROM pizza_orders WHERE id = $1;"
    values = [@id]
    SqlRunner.run(sql, values)
  end

  def update()
    sql = "UPDATE pizza_orders
      SET (
        customer_id,
        quantity,
        topping
      ) =
      (
        $1, $2, $3
      )
      WHERE id = $4;"
    values = [@customer_id, @quantity, @topping, @id]
    SqlRunner.run(sql, values)
  end

  def customer()
    # might be better to create a Customer class method to find a customer by id, and then use that to select the customer.
    # means all customer-related queries are in the Customer class
    sql = "SELECT * FROM customers where id = $1;"
    values = [@customer_id]
    customer_hash_array = SqlRunner.run(sql, values)
    customer_hash = customer_hash_array[0]
    return  Customer.new(customer_hash)
  end


  def PizzaOrder.find_order_by_id(id)
    sql = "SELECT * FROM pizza_orders WHERE id = $1;"
    values = [id]
    result = SqlRunner.run(sql, values)
    result_hash = result[0]
    order_object = PizzaOrder.new(result_hash)
    return order_object
  end



end

# pizza_order.rb
