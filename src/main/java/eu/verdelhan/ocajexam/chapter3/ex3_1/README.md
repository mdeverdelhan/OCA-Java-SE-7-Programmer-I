*Here is the solution of the exercise 3-1.*

#### Compound Assignment Statements

Assigned Value of _a_  |   Compound Assignment    |     Refactored Statement    |  New Value of _a_
-----------------------|--------------------------|-----------------------------|------------------
`a = 10;`              |`a += 3;`                 |`a = a + 3;`                 |13
`a = 15;`              |`a -= 3;`                 |`a = a - 3;`                 |12
`a = 20;`              |`a *= 3;`                 |`a = a * 3;`                 |60
`a = 25;`              |`a /= 3;`                 |`a = a / 3;`                 |8
`a = 30;`              |`a %= 3;`                 |`a = a % 3;`                 |0
`a = 35;`              |`a &= 3;`                 |`a = a & 3;`                 |3
`a = 40;`              |`a ^= 3;`                 |`a = a ^ 3;`                 |43
`a = 45;`              |<code>a &#124;= 3;</code> |<code>a = a &#124; 3;</code> |47
`a = 50;`              |`a <<= 3;`                |`a = (byte) (a << 3);`       |-112
`a = 55;`              |`a >>= 3;`                |`a = a >> 3;`                |6
`a = 60;`              |`a >>>= 3;`               |`a = a >>> 3;`               |7
