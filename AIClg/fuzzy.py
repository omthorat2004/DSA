A = {
    "a": 0.2,
    "b": 0.3,
    "c": 0.6,
    "d": 0.6
}
B = {
    "a": 0.9,
    "b": 0.9,
    "c": 0.4,
    "d": 0.5
}
print('The First Fuzzy Set is:', A)
print('The Second Fuzzy Set is:', B)

union = {}
for key in A:
    union[key] = max(A[key], B[key])
print('Fuzzy Set Union is:', union)

intersection = {}
for key in A:
    intersection[key] = min(A[key], B[key])
print('Fuzzy Set Intersection is:', intersection)

complement = {}
for key in A:
    complement[key] = 1 - A[key]
print('Fuzzy Set Complement of A is:', complement)

difference = {}
for key in A:
    difference[key] = min(A[key], 1 - B[key])
print('Fuzzy Set Difference (A - B) is:', difference)
