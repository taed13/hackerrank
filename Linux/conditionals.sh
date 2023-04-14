# Read in one character from STDIN.
# If the character is 'Y' or 'y' display "YES".
# If the character is 'N' or 'n' display "NO".
# No other character will be provided as input.

# read char
# if [[ $char == 'y' || $char == 'Y' ]]; then
#     echo "YES"
# else
#     echo "NO"
# fi

# Given three integers (X, Y, and Z) representing the three sides of a triangle, identify whether the triangle is scalene, isosceles, or equilateral.
# • If all three sides are equal, output EQUILATERAL.
# • Otherwise, if any two sides are equal, output ISOSCELES.
# • Otherwise, output SCALENE.

# Prompt the user to enter the sides of the triangle
echo "Enter the three sides of the triangle: "
read x
read y
read z

# Check if the sides form a valid triangle
if (( $x + $y <= $z || $x + $z <= $y || $y + $z <= $x )); then
    echo "Error: The sides do not form a valid triangle."
    exit 1
fi

# Identify the type of triangle
if (( $x == $y && $y == $z )); then
    echo "EQUILATERAL"
elif (( $x == $y || $y == $z || $x == $z )); then
    echo "ISOSCELES"
else
    echo "SCALENE"
fi

