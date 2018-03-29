# controller.rb
require('sinatra')
require('sinatra/contrib/all')
require('pry-byebug')
require_relative('models/calculator.rb')

# routes for layout.erb file

get("/") do
  erb( :home )
end

get("/about_us") do
  erb( :about_us )
end

# routes for calculations 

get("/add/:num1/:num2") do
  calculator = Calculator.new( params[:num1].to_i, params["num2"].to_i )
  # params will take string or symbol as key

  # for debugging, include:
  # binding.pry
  # nil
  @calculation = calculator.add()
  # variable referenced in the .erb file
  erb( :result )
  # erb is a method which takes one argument
  # the symbol equivalent of the views .erb file name which MUST be in the views directory

end



get("/subtract/:num1/:num2") do
  calculator = Calculator.new( params[:num1].to_i, params[:num2].to_i)
  # return "Result: #{calculator.subtract()}"
  @calculation = calculator.subtract()
  erb( :result )
end

get("/multiply/:num1/:num2") do
  calculator = Calculator.new( params[:num1].to_i, params[:num2].to_i)
  # return "Result: #{calculator.multiply()}"
  @calculation = calculator.multiply()
  erb( :result )
end

get("/divide/:num1/:num2") do
  calculator = Calculator.new( params[:num1].to_f, params[:num2].to_f)
  # return "Result: #{calculator.divide()}"
  @calculation = calculator.divide()
  erb( :result )

end








# controller.rb
