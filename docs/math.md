# Math

## Prime Number

정수 n 이 소수가 아니라면 두 정수 a, b 의 곱으로 나타낼수 있다.

이때 a^2 ≤ n 또는 b^2 ≤n 이 성립한다.

즉 2이상 루트n 이하의 인수가 반드시 존재한다.

따라서 n 을 2 이상 루트 n 이하의 모든 정수로 나누었을 때 나누어 떨어지지 않으면 소수이다.

## 유클리드 알고리즘

최대 공약수 (gcd : greatest common divisor)

최소 공배수 (lcm : lowest common multiple)

gcd(a,b) = (b==0)?a:gcd(b, a mod b)