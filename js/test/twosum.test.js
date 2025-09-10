const twoSum = require("../twosum");

test("Case 1: target=9", () => {
  expect(twoSum([2,7,11,15], 9)).toEqual([0,1]);
});

test("Case 2: target=6", () => {
  expect(twoSum([3,2,4], 6)).toEqual([1,2]);
});

test("Case 3: target=6 with duplicates", () => {
  expect(twoSum([3,3], 6)).toEqual([0,1]);
});

test("Case 4: no solution", () => {
  expect(twoSum([1,2,3], 7)).toEqual([]);
});
