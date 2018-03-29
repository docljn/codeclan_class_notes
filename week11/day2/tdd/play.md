```Javascript
const assert = require("assert");
```

assert.equal(true, true);
 assert.equal(true, false);
 assert.equal(1, '1');
 assert.equal(1, true);
 .equal is equivalent to == i.e. it is not type checking and can use coercion

 const firstArray = [1,2,3];
 const secondArray = firstArray;
 assert.strictEqual(firstArray, secondArray)

 assert.strictEqual(1, true); => fail
 assert.strictEqual([1,2,3],[1,2,3]); => fail

 .strictEqual is equivalent to === i.e. are they the same object
 this setup only allows for a single failure, so not useful generally

 deep looks at the content of the items being compared, not the objects
```Javascript
assert.deepEqual([1,2,3],["1",2,3]);
```
