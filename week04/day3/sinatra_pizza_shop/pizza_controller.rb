require( 'sinatra' )
require( 'sinatra/contrib/all' )
require( 'pry-byebug' )
require_relative( './models/pizza.rb')

# RESTful

# | **URL**          | **HTTP Verb**    |  **Action**|
# |------------      |-------------     |------------|
# | /pizzas          | GET              | index
# | /pizzas/:id      | GET              | show
# | /pizzas/new      | GET              | new
# | /pizzas          | POST             | create
# | /pizzas/:id/edit | GET              | edit
# | /pizzas/:id      | [PATCH/PUT] POST | update
# | /pizzas/:id      | [DELETE] POST    | destroy

# PUT and DELETE are NOT BROWSER FORM SUPPORTED:
# USE POST in both cases
# [they are in javascript]

# /path/ != /path

# CARE: keep logic, database connection etc in the model not the controller

# STEPS: access params hash, return something, go to views

# INDEX ROUTE: :4567/pizzas
get('/pizzas') do
  # ask the model to retrieve all the pizzas:
  @pizzas = Pizza.all()
  # can't return a ruby object to be displayed in the browser
  # need a new method to display the information....
  # that's a view! Name it the same as the restful method you're following, for consistency and readability.
  # CARE: last line is what is returned!
  erb(:index)
end


# NEW ORDER
# need two routes: GET - gives form and POST - adds record

  # NEW
  # this pattern matches the SHOW route, so must be BEFORE it in the controller file
  # sends a POST request to /pizzas
get('/pizzas/new') do
  erb(:new)
end

  # CREATE
  # because this is a POST request, and the INDEX route is a GET request, we can use the same path without any issues.
post('/pizzas') do
  # because we named the input field name="" to match the model and database, we can just use params as the options hash to create a new instance of Pizza
  @pizza = Pizza.new(params)
  @pizza.save()
  # creates the database entry, which returns the id.
  # could redirect to /pizzas again, but probably want to confirm the order instead
  erb(:create)

end






# SHOW
get('/pizzas/:id') do
  id = params[:id]
  @pizza = Pizza.find(id)
  # .find(id) means that @pizza is an object which is an instance variable
  erb(:show)
end

# DELETE route

post('/pizzas/:id/delete') do
  id = params[:id]
  @pizza = Pizza.find(id)
  @pizza.delete()

  redirect "/pizzas"

end

# EDIT route
# two stage route: find then update database

get('/pizzas/:id/edit') do
  @pizza = Pizza.find(params[:id])
  erb(:edit)
end

post('/pizzas/:id') do
  @pizza = Pizza.new(params)
  @pizza.update
  redirect "/pizzas/#{@pizza.id}"
end


# pizza_controller.rb
