require_relative('../db/sql_runner.rb')

class House

  attr_reader :id
  attr_accessor :name, :url

  def initialize(options)
    @name = options['name']
    @url = options.fetch('url', 'n/a')
    @id = options['id'].to_i if options['id']
  end

  def save()
    sql = "INSERT INTO houses (name, url) VALUES ($1, $2) RETURNING id;"
    values = [@name, @url]
    sql_result = SqlRunner.run(sql, values)
    @id = sql_result[0]['id']
  end

end
