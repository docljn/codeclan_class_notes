require_relative("../db/sql_runner")

class User

  attr_reader :id
  attr_accessor :name

  def initialize( options )
    @id = options['id'].to_i
    @name = options['name']
  end

  def self.all()
    sql = "SELECT * FROM users"
    users = SqlRunner.run(sql)
    # result = users.map { |user| User.new( user ) }
    # return result
    return map_items(users)
  end

  def self.delete_all()
    sql = "DELETE FROM users"
    SqlRunner.run(sql)
  end

  def self.map_items(user_hashes)
    return user_hashes.map{|hash| User.new(hash)}
  end





  def save()
    sql = "INSERT INTO users
    (
      name
    )
    VALUES
    (
      $1
    )
    RETURNING id"
    values = [@name]
    user = SqlRunner.run( sql, values ).first
    @id = user['id'].to_i
  end

  def locations()
    # refactor using the helper method in the Locations class
    sql = "SELECT DISTINCT locations.*
          FROM locations
          INNER JOIN visits
          ON visits.location_id = locations.id
          WHERE visits.user_id = $1 ;"
    values = [@id]
    location_hashes = SqlRunner.run( sql, values )
    return Location.map_items(location_hashes)
  end

  # DISTINCT will give unique answers in a sql query
  # otherwise we will get duplication if a user has left many reviews of a single location

  # to make an inner join, there must be data in common between them i.e. "REFERENCES" in setup


end
