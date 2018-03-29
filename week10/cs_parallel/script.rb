# question = "Who should I say hello to?"
# p question
# input = gets.chomp
#
# while imput = != "quit"
#   p "Hello, #{input}"
#   input = gets.chomp
# end


def fib(n)
  return 1 if n < 3
  return fib(n - 1) + fib(n - 2)
end



question = 'Which Fibonacci number would you like to know?'
puts question
input = gets.chomp

while (input != 'quit')
  puts 'Thinking...'

  new_thread = Thread.new do
    time_start = Time.new
    num_to_calc = input.to_i
    result = fib(num_to_calc)
    time_end = Time.new
    time_taken = (time_end - time_start)*1000.round(3)
    puts "#{result}:#{num_to_calc}th fibonacci in #{time_taken} ms"
  end

  puts question
  input = gets.chomp
end

# thread.join()
