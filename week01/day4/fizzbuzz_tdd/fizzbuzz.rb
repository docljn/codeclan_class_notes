# fizzbuzz.rb

# REQUIREMENTS
# write a function

# name: fizzbuzz
# input: single integer (assume input is valid)
# returns "Fizz" if number is exactly divisible by 3
# returns "Buzz" if number is exactly divisible by 5
# returns "FizzBuzz" if number is exactly divisible by 3 and 5
# otherwise return original number as a string


# QUERY: WHY NOT START WITH THE DEFAULT RESPONSE FIRST IE RETURNS INTEGER AS STRING? - design decision only.

# QUERY: What about if you wanted to change the numbers divisible - wouldn't you have to rewrite all the tests as they are currently constructed? YES.

# Use if..end without explicit return if you want to evaluate multiple conditions in the same function.



def fizzbuzz(integer)
  if (integer % 3 == 0) && (integer % 5 == 0)
    return "FizzBuzz"
  end
  if integer % 5 == 0
    return "Buzz"
  end
  if integer % 3 == 0
    return "Fizz"
  end
  return integer.to_s
end
