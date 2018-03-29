require_relative('../db/sql_runner')
require_relative('artist')

class Album

  attr_reader :id
  attr_accessor :title, :genre, :artist_id

  def initialize(options)
    @id         = options['id'].to_i if options['id']
    @title      = options['title']
    @genre      = options['genre']
    @artist_id  = options['artist_id']
  end

  # class methods
  def self.delete_all()
    sql = "DELETE FROM albums"
    SqlRunner.run(sql)
  end

  def self.find_all()
    sql = "SELECT id, title, genre, artist_id FROM albums"
    return SqlRunner.run(sql).map{|album| Album.new(album)}
  end

  def self.find_albums_by_artist(artist_id)
    sql = "SELECT id, title, genre, artist_id FROM albums WHERE artist_id = $1"
    values = [artist_id]
    return SqlRunner.run(sql, values).map{|album| Album.new(album)}
  end

  # instance methods

  def save() # this means that you have no ambiguity, and no need to know whether the object you are dealing with is new or already exists in the database.
    if @id
      update()
    else
      insert()
    end
  end


  private
  def insert()
    sql = "INSERT INTO albums (title, genre, artist_id) VALUES ($1, $2, $3) RETURNING id"
    @id = SqlRunner.run(sql, [@title, @genre, @artist_id])[0]['id']
  end

  def update()
    sql = "UPDATE  albums SET (title, genre, artist_id) = ($1, $2, $3) WHERE id = $4 "
    values = [@title, @genre, @artist_id, @id]
    SqlRunner.run(sql, values)
  end



end
