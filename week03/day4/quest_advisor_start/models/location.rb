# model of tripadvisor-like site

require_relative("../db/sql_runner")

class Location

  attr_reader :id
  attr_accessor :name, :category

  def initialize( options )
    @id = options['id'].to_i
    @name = options['name']
    @category = options['category']
  end

  def self.all()
    sql = "SELECT * FROM locations"
    location_hashes = SqlRunner.run(sql)
    return Location.map_items(location_hashes)
    # could also be written as "map_items(location_hashes)"
    # even if there is a map_items instance method
    # ruby will assume you want a class method.
  end

  def self.delete_all()
    sql = "DELETE FROM locations"
    SqlRunner.run(sql)
  end

  def self.map_items(location_hashes)
    # helper method to extract the .map{} which is run on the result of the SqlRunner.run method
    result = location_hashes.map{|hash| Location.new(hash)}
    return result
  end


  def save()
    sql = "INSERT INTO locations
    (
      name,
      category
    )
    VALUES
    (
      $1, $2
    )
    RETURNING id"
    values = [@name, @category]
    location = SqlRunner.run( sql, values ).first
    @id = location['id'].to_i
  end

  def users()
    sql = " SELECT DISTINCT users.*
    FROM users
    INNER JOIN visits
    ON visits.user_id = users.id
    WHERE visits.location_id = $1;"
    values = [@id]
    user_hash_array = SqlRunner.run(sql, values)
    return User.map_items(user_hash_array)
  end

  # DISTINCT will give unique answers in a sql query
  # otherwise we will get duplication if a user has left many reviews of a single location

  # to make an inner join, there must be data in common between them i.e. "REFERENCES" in setup


end
