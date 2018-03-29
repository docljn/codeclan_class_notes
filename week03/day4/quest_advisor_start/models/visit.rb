require_relative("../db/sql_runner")

class Visit

  attr_reader :id
  attr_accessor :user_id, :location_id, :review

  def initialize( options )
    @id = options['id'].to_i
    @user_id = options['user_id'].to_i
    @location_id = options['location_id'].to_i
    @review = options['review']
  end

# class methods
  def self.all()
    sql = "SELECT * FROM visits"
    visits = SqlRunner.run(sql)
    result = visits.map { |visit| Visit.new( visit ) }
    return result
  end

  def self.delete_all()
    sql = "DELETE FROM visits"
    SqlRunner.run(sql)
  end

# instance methods
  def save()
    sql = "INSERT INTO visits
    (
      user_id,
      location_id,
      review
    )
    VALUES
    (
      $1, $2, $3
    )
    RETURNING id"
    values = [@user_id, @location_id, @review]
    visit = SqlRunner.run( sql,values ).first
    @id = visit['id'].to_i
  end

  def user()
    # who visited and left a review?
    # we want the whole object, so select *
    sql = "SELECT * FROM users WHERE id = $1;"
    values = [@user_id]
    user_hash = SqlRunner.run(sql, values)[0]
    return User.new(user_hash)
    # .map would give you an array, and you want just a single object
  end

  def location()
    sql = "SELECT * FROM locations WHERE id = $1;"
    values = [@location_id]
    location_hash = SqlRunner.run(sql, values).first()
    return Location.new(location_hash)
  end




end
