// 1st Question

let name = "Arun";
let age = 20;
let city = "Madurai"

console.log(name,age,city);

//2nd Question

let x = 10;
let y = 5;
let sum = x+y
console.log("Sum = "+ sum);

//3rd Question

var a = "I am var";
let b = "I am let";
const c = "I am const";

function testScope() {
    console.log(a);
    console.log(b);
    console.log(c);

    if (true) {
        var d = "I am inside if - var";
        let e = "I am inside if - let";
        const f = "I am inside if - const";

        console.log(d);
        console.log(e);
        console.log(f);
    }

    console.log(d);
    // console.log(e);
    // console.log(f);
}

testScope();

console.log(a);
console.log(b);
console.log(c);

// console.log(d);
// console.log(e);
// console.log(f);
