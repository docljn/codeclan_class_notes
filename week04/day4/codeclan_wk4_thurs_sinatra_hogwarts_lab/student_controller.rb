require('sinatra')
require('sinatra/contrib/all')
require('pry-byebug')

require_relative('./models/student.rb')

#index
get('/students') do
  @students = Student.find_all()
  erb :index
end

# new
get('/students/new') do
  erb(:new)
end

# save new
post('/students') do
  @student = Student.new(params)
  @student.save()
  redirect "/students"
end
