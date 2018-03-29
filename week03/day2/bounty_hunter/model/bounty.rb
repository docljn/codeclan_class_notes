# bounty.rb
require('pg')
require('pry-byebug')

class Bounty
  attr_reader :id
  attr_accessor :name, :bounty_value, :favourite_weapon, :collected_by

  def initialize(options)
    # if you don't include the if statement, anything that doesn't come from the database would be set to nil.to_i i.e. 0
    @id = options['id'].to_i if options['id']
    @name = options['name']
    @bounty_value = options['bounty_value'].to_i
    @favourite_weapon = options['favourite_weapon']
    @collected_by = options['collected_by']
  end

  def save() # CREATE
    db = PG.connect({ dbname: 'space_cowboys', host: 'localhost'})
    # sql = "
    #     INSERT INTO bounties (
    #       name,
    #       bounty_value,
    #       favourite_weapon,
    #       collected_by
    #     ) VALUES (
    #       $1, $2, $3, $4
    #     ) RETURNING *
    # ;"
    # BETTER TO JUST RETURN ID IF YOU DON'T NEED THE REST:
    sql = "
        INSERT INTO bounties (
          name,
          bounty_value,
          favourite_weapon,
          collected_by
        ) VALUES (
          $1, $2, $3, $4
        ) RETURNING id
    ;"
    values = [@name, @bounty_value, @favourite_weapon, @collected_by]
    db.prepare("save", sql)
    @id = db.exec_prepared("save", values)[0]['id'].to_i
    db.close
  end

  def update() # UPDATE
    db = PG.connect({ dbname: 'space_cowboys', host: 'localhost'})
    sql = "
        UPDATE bounties SET (
            name,
            bounty_value,
            favourite_weapon,
            collected_by
          ) = (
            $1, $2, $3, $4
          ) WHERE id = $5
            ;"
    values = [@name, @bounty_value, @favourite_weapon, @collected_by, @id]
    db.prepare("update", sql)
    db.exec_prepared("update", values)
    db.close
  end

  # Graeme did these on his own.
  # def delete()
  #   db = PG.connect({ dbname: 'space_cowboys', host: 'localhost'})
  #   sql = "DELETE FROM bounties WHERE id = $1;"
  #   values = [@id]
  #   db.prepare("delete_one", sql)
  #   db.exec_prepared("delete_one", values)
  #   db.close()
  # end
  #
  # def self.delete_all()
  #   db = PG.connect({ dbname: 'space_cowboys', host: 'localhost'})
  #   sql = "DELETE FROM bounties;"
  #   db.prepare("delete_all", sql)
  #   db.exec_prepared("delete_all")
  #   db.close()
  # end
  # def find_by_id()
  #   db = PG.connect({ dbname: 'space_cowboys', host: 'localhost'})
  #   sql = "SELECT * FROM bounties WHERE id = $1;"
  #   values = [@id]
  #   db.prepare("find_by_id", sql)
  #   bounty = db.exec_prepared("find_by_id", values)
  #   db.close()
  #   return bounty.map{|bounty| Bounty.new(bounty)}
  # end

  # Implement a `find` method that returns **one** instance of your class (do you have to use a map method? Hmm.)
  # Solo work:
  # Under what circumstances would you be searching for something in a database by id?
  # Would it be less or more efficient to retrieve a selection of records and then iterate through them?

  def delete()
    db = PG.connect({dbname: 'space_cowboys', host: 'localhost'})
    sql = "DELETE FROM bounties where id = $1"
    values = [@id] #i.e. where the table item id matches the instance id that method is called on.
    db.prepare("delete_one", sql)
    db.exec_prepared("delete_one", values)
    db.close()
  end

  # also valid to do def self.delete(id)
  # but you don't know that the id is valid
  # if you do instance.delete() you can be certain that the id is valid as you are deleting a specific instance

  def self.delete_all()
    db = PG.connect({dbname: 'space_cowboys', host: 'localhost'})
    sql = "Delete from bounties"
    db.prepare("delete_all", sql)
    db.exec_prepared("delete_all")
    db.close()
  end

  def Bounty.all() # READ [or self.all]
    db = PG.connect({dbname: 'space_cowboys', host: 'localhost'})
    sql = "SELECT * from bounties"
    # not mandatory to have values if there are none in the sql statement
    values = []
    db.prepare("all", sql)
    # not mandatory to include values where there are none
    results = db.exec_prepared("all", values)
    db.close()
    bounties = results.map {|bounty_hash| Bounty.new(bounty_hash)}
    return bounties
  end

# DON'T DO THIS!
  # def self.find_by(column_name, value) # READ
  #   # can't do this yet.
  #   # can't feed in id as a non-string as ruby goes nuts
  #   # can't feed in 'id' as then my sql string doesn't work
  #   # can't concatenate as $1 isn't a string at the point that I'm writing the SQL, but if I don't use $1 then I'm not sanitising my data.
  #
  #   db = PG.connect({dbname: 'space_cowboys', host: 'localhost'})
  #   # sql = "SELECT * FROM bounties WHERE #{column_name} = #{value} "  -- this works just fine, but no santising
  #   sql = "SELECT * FROM bounties WHERE $1 = $2"
  #
  #   values = [column_name, value]
  #   db.prepare("find", sql)
  #   bounties = db.exec_prepared("find", values)
  #   db.close()
  #   object = bounties.map {|bounty_hash| Bounty.new(bounty_hash)}
  #   return object
  # end

  def self.find_by_id(id) # READ
    db = PG.connect({dbname: 'space_cowboys', host: 'localhost'})
    sql = "SELECT * FROM bounties WHERE id = $1"

    values = [id]
    db.prepare("find", sql)
    results = db.exec_prepared("find", values)
    bounty_hash = results[0]
    bounty = results.map {|bounty_hash| Bounty.new(bounty_hash)}
    binding.pry
    return object
  end

end

# bounty.rb
