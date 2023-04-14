# for (( i=1; i<=99; i+=2 ))
# do
#     echo $i
# done

# Sample Input 0
# Dan  
# Sample Output 0
# Welcome Dan  

# read name
# echo Welcome $name


# for (( i=1; i<=50; i+=1 ))
# do
#     echo $i
# done


# Đọc giá trị của X và Y từ input
read X
read Y

# Tính toán và in ra kết quả
echo $(($X + $Y))
echo $(($X - $Y))
echo $(($X * $Y))
echo $(($X / $Y))
