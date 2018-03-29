require_relative('../db/sql_runner')
# don't need to require 'pg' as it is only used by sql_runner

class Customer

  attr_reader :id
  attr_accessor :first_name, :last_name

  def initialize (options)
    @id = options['id'].to_i if options['id']
    @first_name = options['first_name']
    @last_name = options['last_name']
  end

  # class methods

  def Customer.delete_all()
    SqlRunner.run("DELETE FROM customers;")
  end

  # instance methods

  def save()
    sql = "INSERT INTO customers (first_name,last_name)
    VALUES
    ($1, $2)
    RETURNING id;"

    returned = SqlRunner.run(sql, [@first_name, @last_name])
    @id = returned[0]['id'].to_i
  end

  def pizza_orders()
    # think about a method in the Pizza class, somehow.
    sql = "SELECT * FROM pizza_orders WHERE customer_id = $1"
    values = [@id]
    returned_array_of_hashes = SqlRunner.run(sql, values)
    pizza_orders = returned_array_of_hashes.map {|order| PizzaOrder.new(order)}
  end

end

# customer.rb
