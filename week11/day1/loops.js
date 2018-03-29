var pets = ['dog', 'cat', 'budgie'];
for(var i = 0; i < pets.length; i +=1){
  console.log(pets[i]);
}


for (var pet of pets){
  console.log(pet);
}

var x = 0;

while ( x < 10 ){
  console.log("this is loop" + (x + 1));
  x ++;
}


// the in keyword gives the index rather than the variable at the index position
for (var pet in pets){
  console.log(pet);
}

// but it DOES work in an object where you have key:value pairs

var object = {student1:3, student2:12, student4:10}
for (var student in object) {
  console.log("object." + student + " = " + object[student]);
}
