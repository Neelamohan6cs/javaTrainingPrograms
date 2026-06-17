nums=[10, 5, 20, 8]
def second_largest(nums):
    if len(nums) < 3:
        return None
    first = second = 0
    for num in nums:
        if num > first:
            second = first
            first = num
    return first 
print(second_largest(nums))

