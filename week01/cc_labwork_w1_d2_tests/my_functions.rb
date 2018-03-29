def greet(input_name, time_of_day)
  words = "Hello #{input_name}, good #{time_of_day}"
  return words
end

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

def number_to_short_month_name(month_number)
  case month_number
  when 1
    return "Jan"
  when 3
    return "Mar"
  when 9
    return "Sep"
  end
end

def volume_of_cube(length)
end

my_name = "dou"
time_period = "afternoon"

mauritius_population = 5373000
mauritius_area = 77933

p greet(my_name, time_period)

p add(2,3)

p population_density(mauritius_population, mauritius_area)
