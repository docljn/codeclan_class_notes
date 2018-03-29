# my_functions.rb

# # Douglas' code
#
# my_name = "dou"
# time_period = "afternoon"
#
# mauritius_population = 5373000
# mauritius_area = 77933
#
# p greet(my_name, time_period)
#
# p add(2,3)
#
# p population_density(mauritius_population, mauritius_area)
#
# # what_year
#
# p "What year was Ruby created?"
# correct = 1995
# answer = gets.chomp.to_i
#
# if (answer == correct)
#   p "Yes"
# else
#   p "Nope, Ruby was created in #{correct}"
# end
#
# # what_animal
#
# p "What animal are you?"
# name = gets.chomp.downcase
#
# if (name == "chicken")
#   p "This is my favourite animal."
# elsif (name == "kitten")
#   p "Aww, I love kittens (for breakfast)."
# else
#   p "Sad, not my favourite animal."
# end
#
#
# # case_statement
# # reference: https://www.w3resource.com/ruby/ruby-if-else-unless.php
# # https://www.w3resource.com/ruby/ruby-if-else-unless.php
#
# p "What did you score?"
# score = gets.chomp.to_i
#
# case score
# when 10
#   p "genius"
# when 8..9
#   p "merit"
# when 5..7
#   p "pass"
# when 4
#   p "resit"
# else
#   p "fail"
# end
#
# # alternative syntax if only one result needed: single line if
# score = 6
# result = "fail"
# result = "pass" if (score >= 6)
# p result
#
#
# # ternary syntax: can be confusing to read/debug
# score = 6
# result = score > 5 ? "pass" : "fail"
# p result
#
#
# # guard statement: only possible if there is only one option [not heavily used]
# alex_hungry = true
# alex_tired = true
#
# p "Alex is hangry" if alex_hungry && alex_tired
# p "Alex needs a break" if alex_hungry || alex_tired
#
#
#
# def greet(input_name, time_of_day)
#   words = "Hello #{input_name}, good #{time_of_day}"
#   return words
# end

# lab pair programming

def add(first_number, second_number)
  sum = first_number + second_number
  return sum
end

def subtract(first_number, second_number)
  result = first_number - second_number
  return result
end

def population_density(population, area)
  density = population / area
  return density
end

def multiply(number1, number2)
  result = number1 * number2
  return result
end

def divide(number1, number2)
  return number1 / number2
end

def length_of_string(string1)
  result = string1.length()
  return result
end

def join_string(string1, string2)
  return string1 + string2
end

def add_string_as_number(string1, string2)
  result = string1.to_i + string2.to_i
  return result
end

def number_to_full_month_name(month_number)
  case month_number
  when 1
    return "January"
  when 3
    return "March"
  when 9
    return "September"
  end
end

# def number_to_short_month_name(month_number)
#   case month_number
#   when 1
#     return "Jan"
#   when 3
#     return "Mar"
#   when 9
#     return "Sep"
#   end
# end

# refactoring
def number_to_short_month_name(month_number)
  short_name =  number_to_full_month_name(month_number).slice(0,3)
  return short_name
end


# solo work
def volume_of_cube(length)
  return length ** 3
end

def volume_of_sphere(radius)
  return (4/3.00 * Math::PI * radius**3)
end

def fahrenheit_to_celsius(degrees_f)
  result = (degrees_f - 32) / 1.8
end
