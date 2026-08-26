let a = [2,4,6,8];
let sum = 0;

for(let i = 0; i< a.length;i++)
{
    sum = a[i] +sum;
}

console.log(sum);

let b = [20,21,19,14,15,26,33];
let counteven = 0;
let countodd = 0;

for(let i = 0; i < b.length; i++)
{
    if(b[i]%2==0)
    {
        counteven++;
    }

    else
    {
        countodd++;
    }
}

console.log(counteven);
console.log(countodd);

let c = [41,42,43,44,45];
let d = [];

for(let i = c.length-1; i >=0; i--)
{
 d.push(c[i]);
}

console.log(d);
