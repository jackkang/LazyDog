#!/usr/bin/python

# Condition if

say_hello = 1

if say_hello:
	print 'Hello World!'


# Character value

currency=u'$'
print ord(currency)

# import module
import os

# get the environment

filename=os.environ.get('PYTHONPATH')
if filename and os.path.isdir(filename):
	print filename + " is a valid directory"

# The customization modules
import site
print site.getusersitepackages()
