read expr

result=$(echo "scale=10; $expr" | bc)

rounded_result=$(printf "%.3f" $result)

echo $rounded_result