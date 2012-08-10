#!/usr/bin/python

str1 = 'This is a string'
str2 = "This is a new string"
str3 = 'This is a very \
long string.'
str4 = '''
This 
is
a
multiple
line string
'''

print str1
print str2
print str3
print str4

word = str1

print 'len(word) = ' + str(len(word))
print 'word[4] = ' + word[4]
print 'word[ :5] = ' + word[ :5]
print 'word[12: ] = ' + word[12: ]

print 'word[4:-6] = ' + word[4:-6]

print 'strip(" a b c d  ") = ' + ' a b c d'.strip()

