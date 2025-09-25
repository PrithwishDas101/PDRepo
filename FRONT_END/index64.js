// .reduce() = reduce the elements of an array
//             to single value

const prices = [5, 10, 30, 40, 50];

const total = prices.reduce(sum);

console.log(`$${total.toFixed(2)}`)

function sum(accummulator, element){
    return accummulator + element   //  (accummulator = 0 + 5  -->
                                    //  accummulator = 5 + 10  -->
                                    //  accummulator = 15 + 30 -->
                                    //  accummulator = 45 + 40 -->
                                    //  accummulator = 85 + 50 -->
                                    //  135 (final value returned))
}

const grades = [75, 65, 45, 90, 100];

const max = grades.reduce(maximum);
const min = grades.reduce(minimum);

console.log(max);
console.log(min)

function maximum(accummulator, element){
    return Math.max(accummulator, element);
}

function minimum(accummulator, element){
    return Math.min(accummulator, element);
}
