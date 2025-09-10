function twoSum(arr, target) {
  const map = new Map();
  for (let i = 0; i < arr.length; i++) {
    let complement = target - arr[i];

    if (map.has(complement)) {
      return [map.get(complement), i];
    }

    map.set(arr[i], i);
  }

  return [];
}

module.exports = twoSum;
