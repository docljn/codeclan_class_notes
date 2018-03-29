def puts_later(string, seconds_to_wait)
  # you can pass a code block to Thread.new instead of arguments
  Thread.new do
    sleep(seconds_to_wait)  # pauses the application completely UNLESS you have a separate thread which is paused while the main thread continues...
    p string
  end
end


p "Hi"

thread = puts_later("bye", 4)
new_thread = puts_later("Am I late?", 3)
p "What's up"

thread.join() # pause the main thread AT THIS POINT until this thread finishes executing
new_thread.join() # only pauses the main thread, so this will be called before thread

# CARE: if one thread relies on the output of a previous thread, then you have to call the joins in the order of calculations
