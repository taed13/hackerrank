read n

read -a arr

sum=0
for i in "${arr[@]}"; do
    sum=$(expr $sum + $i)
done

average=$(echo "scale=3; $sum / $n" | bc)

echo $average