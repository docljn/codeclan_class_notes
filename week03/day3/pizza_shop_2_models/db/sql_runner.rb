require ('pg')

class SqlRunner

  # no need for instances of the class

  # class method

  def SqlRunner.run(sql, values = [])
    # argument = default_argument: if nothing given
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    db.prepare('query', sql)
    result = db.exec_prepared('query', values)
    db.close
    return result
  end


end
