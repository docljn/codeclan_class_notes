# pizza_order.rb

require('pg')

class PizzaOrder

  # class is resposible for creating all pizza orders
  # resonsible for all instances i.e. returning all pizza orders is a class method. self.all() Not available to an instance of the class, but to the class as a whole.

  attr_accessor :first_name, :last_name, :quantity, :topping
  attr_reader :id

  def initialize( options )
    # id will come from the database
    # we don't want to set the id if it doesn't exist in the options hash i.e. it has been returned from the database, if it isn't there, you get nil as a return value, which evaluates to false.
    @id = options['id'].to_i if options['id']
    @first_name = options['first_name'] # equivalent to options[:first_name] but allows us to use the string format information which is retrieved from the database.
    @last_name = options['last_name']
    @quantity = options['quantity'].to_i
    @topping = options['topping']
  end

  def save()
    # connect to database
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
      # run some sql
      sql = "INSERT INTO pizza_orders
      ( first_name,
        last_name,
        quantity,
        topping)
      VALUES
      ( $1, $2, $3, $4 )
      RETURNING * "  # in this case, we only need the id, not the whole record, but useful to return the whole object record...
      # $1 etc are placeholders
      # there is only one sql command, so ; isn't needed here

      values = [@first_name, @last_name, @quantity, @topping] #replace placeholders in order

      db.prepare("save", sql)  # my prepared statement will be called "save" and it will have the sql query 'sql' attached to it.
      # this .prepare can be constructed in advance, and then called multiple times for efficiency as well as for santitizing data.
      @id = db.exec_prepared("save", values)[0]['id'].to_i
      # execute my prepared statement "save" using the values that I provided.
      # save the 'id' key's value of the hash which is at the '0' position of the array which has been returned from the method, as an instance variable @id
    db.close()
  end

  def self.all()
    # connect to database
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    # run some sql
    sql = "SELECT * FROM pizza_orders"
    # no external input, so santizing not needed
    # use prepare statement for speed
    db.prepare("all", sql)
    # think of 'all' as the key and sql as the value
    orders = db.exec_prepared("all") # store the data that's coming back
    db.close()
    # return orders
    # the pg gem gives an array of hashes as a return object PG::Result
    # all data is returned as a string, no matter what the datatype in the table
    # what we actually want back is PizzaOrder objects, rather than a hash of strings.  -> use .map

    return orders.map {|order| PizzaOrder.new(order)}
    # this is why the initialize method uses an options hash with all data as a string.
    # now we get an array of PizzaOrder objects
    # we have taken info from ruby, to database, and back again to ruby readable.
  end

  def self.delete_all()
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    sql = "DELETE FROM pizza_orders"
    db.prepare("delete_all", sql)
    db.exec_prepared("delete_all")
    db.close()
    # no need to return anything here
  end

  def delete()
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    sql = "DELETE FROM pizza_orders WHERE id = $1"
    values = [@id]
    db.prepare("delete_one", sql)
    db.exec_prepared("delete_one", values)
    db.close()
    # delete_one is the sql prepared bit, delete is the method name
  end

  def update()
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    sql = "UPDATE pizza_orders SET (
      first_name,
      last_name,
      quantity,
      topping
    ) = (
      $1, $2, $3, $4
      )
      WHERE id = $5"

    values = [@first_name, @last_name, @quantity, @topping, @id]

    db.prepare("update", sql)
    db.exec_prepared("update", values)
    # update the database based on the current state of the object so you can use this to change any attribute.
    db.close
  end



end


# (
# '#{@first_name}',
#   '#{@last_name}',
#   #{@quantity},
#   '#{@topping}')"
# replaced by the $1 placeholders

# db.exec(sql) replaced by







# pizza_order.rb
