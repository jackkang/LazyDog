#!/usr/bin/python


print '2 + 2 = ' + str(2+2)

print '5.7 - 1.2 =' + str(5.7 - 1.2)

a = 5 + 6j

b = complex(4, -7)

print str(a) + ' + ' + str(b) + ' = ' + str(a + b)

c = a * b

print str(c) + ': real = ' + str(c.real) + '  imag = ' + str(c.imag)

print 'abs(-4.5) = ' + str(abs(-4.5))

tax = 12.5 / 100
price = 100.50
print round(tax * price, 2)
