# JackLang-Java

JackLang Compiler in Java.

JackLang is an interpreted language.

Frontend by ANTLR, Backend by Java.

## Introduction

DataType: int, int[] (Single Dimensional Array)

You may declare variable globally or locally.

Function Parameter DataType Only Support **int**

Supported Statement: if-else, while, do-while

Supported Operator: unary -, unary !,+,-,*,/,<,<=,>=,>,==,!=,&&,||

Supported Input & Output Function:

`printInt(x)` : Write an Integer to STDOUT

`printSpace()` : Write a Space to STDOUT

`printLn()` : Write a '\n' to STDOUT

`x=readInt()` : Read an Integer from STDIN to variable x

l-value only include `ARRAY[i]` and `IDENTIFIER`.

You may get more information about syntax at ANTLR4 Grammar File: src/JackLang.g4

## Example

Simple A+B:
```
int main(){
	int a,b;
	a=readInt();
	b=readInt();
	printInt(a+b);
}
```

GCD:
```
int gcd(int a,int b){
	if(b==0)return a;
	return gcd(b,a%b);
}
int main(){
	int a,b,c;
	a=readInt();
	b=readInt();
	c=gcd(a,b);
	printInt(c);
	printSpace();
	printInt(a*b/c);
}
```

Sort:
```
int n;
int[50] arr;
int input(){
	n=readInt();
	int i;
	i=0;
	while(i<n){
		arr[i]=readInt();
		i=i+1;
	}
}
int output(){
	int i;
	i=0;
	while(i<n){
		printInt(arr[i]);
		printSpace();
		i=i+1;
	}
	printLn();
}
int sort(){
	int i;
	int j;
	int tmp;
	i=0;
	while(i<n){
		j=i+1;
		while(j<n){
			if(arr[i]>arr[j]){
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
			j=j+1;
		}
		i=i+1;
	}
}
int main(){
	input();
	sort();
	output();
}
```

Num Reverse:
```
int main(){
	int num;
	num=readInt();
	if(num==0){
		printInt(0);
		return 0;
	}
	while(num){
		printInt(num%10);
		num=num/10;
	}
	return 1;
}
```
