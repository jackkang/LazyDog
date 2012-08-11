#!/usr/bin/python

#if statement
x = int(raw_input('Please enter an integer: '))

if x < 0:
	print 'Negative'
elif x == 0:
	print 'Zero'
else:
	print 'Positive'


#for statement
objects = ['cat', 'window', 'defenestrate']
for o in objects:
	print o, len(o)

for o in objects[:]:
	if len(o) > 6:
		objects.insert(0, o)
print objects

#range() function

print range(10)
print range(9, 13)
print range(2, 10, 2)

#for with range
for i in range(len(objects)):
	print i, objects[i]
else:
	print i

#find out the prime number
for i in range(2, 10):
	for x in range(2, i):
		if i % x == 0:
			print i, ' equals', x, ' * ', i/x
			break;
	else:
		print i, ' is a prime number'

#function definition

def fib(n): # Define a Fibonacci series
	a, b = 0, 1;
	while a < n:
		print a,
		a, b = b, a + b
	print '\n'

fib(2000)

#functions with parameter
def ask_ok(prompt, retries = 4, complaint = 'Yes or no, please!'):
	while True:
		ok = raw_input(prompt)
		if (ok in ('y', 'ye', 'yes')):
			return True
		if (ok in ('n', 'no', 'nop', 'nope')):
			return False
		retries = retries - 1;
		if retries < 0:
			raise IOError('refusenik user')
		print complaint

ask_ok('Please enter your choose: ')

# defining scope
i = 5;
def(arg = i):
	print arg

i = 6
def()

# The default value is evaluated only once.
def fun(a, L=[]):
	L.append(a)
	return L

print f(1)
print f(2)
print f(3)


