require_relative('../db/sql_runner.rb')

class Student

  attr_reader :id
  attr_accessor :first_name, :second_name, :house, :age

def initialize(options)
  @id = options['id'].to_i if options['id']
  @first_name = options['first_name']
  @second_name = options['second_name']
  @house = options['house']
  @age = options['age'].to_i
end


# CLASS METHODS

def self.find_all()
  sql = "SELECT * FROM students;"
  values = []
  result = SqlRunner.run(sql, values)
  returned_objects = result.map {|hash| Student.new(hash)}
end

def self.find_by_id(id)
  sql = "SELECT * FROM students WHERE id = $1;"
  values = [id]
  result = SqlRunner.run(sql, values)
  student = Student.new(result[0])
end



# INSTANCE METHODS

def save()
  sql = "INSERT INTO students (
    first_name,
    second_name,
    house,
    age
  ) VALUES (
    $1, $2, $3, $4
    ) RETURNING id;"
    values = [@first_name, @second_name, @house, @age]
    result = SqlRunner.run(sql, values).first['id'].to_i
    @id = result
end

end
