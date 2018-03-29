require_relative('./models/student.rb')
require_relative('./models/house.rb')
require('pry-byebug')

# @id = options['id'].to_i if options['id']
# @first_name = options['first_name']
# @second_name = options['second_name']
# @house = options['house']
# @age = options['age'].to_i


# harry = Student.new({'first_name' => 'Harry', 'second_name' => 'Potter',
#   'house' => 'Gryffindor', 'age' => '12'})
#   harry.save()
#
# all_students = Student.find_all()

houses = ['Gryffindor', 'Slytherin', 'Hufflepuff', 'Ravenclaw']

houses.each do |name|
  newhouse = House.new({'name' => name})
  newhouse.save()
end



  binding.pry
  nil
