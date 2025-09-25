#include <stdio.h>
#include <math.h>

int countDigits(int num){ // count the digits in num
    int count = 0;

    while (num != 0){
        count++;
        num /= 10;
    }
    return count;
}

int isArmstrong(int num){ // check if armstrong
    int digits = countDigits(num);
    
    int sum = 0, 
    temp = num;

    while (temp != 0){
        int digit = temp % 10;
        sum += pow(digit, digits);
        temp /= 10;
    }

    return (sum == num);
}

void ArmstrongInRange(int m, int n){ // print armstrong numbers in a range

    printf("Armstrong numbers between %d and %d are:\n", m, n);

    for (int i = m; i <= n; i++){

        if (isArmstrong(i)){
        
            printf("%d ", i);
        }
    }

    printf("\n");
}

int main(){
    int num, m, n;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (isArmstrong(num)){
        printf("%d is an Armstrong number.\n", num);
    }

    else{
        printf("%d is NOT an Armstrong number.\n", num);
    }

    printf("\nEnter range (m and n): ");
    scanf("%d %d", &m, &n);

    ArmstrongInRange(m, n);

    return 0;
}
