# Mollapp exam

To the real statment and solution of my teacher click here: [dfleta](https://github.com/dfleta/mollap-intercepting-filter)

This exam is a little bit confusing since it was created to learn how to "create" a software architecture, and I solved it like if it was a normal exam.

It was though to be expanded to larger scales of products, that is why it is short code. 

## How Mollapp works

Mollapp is an app which consist on giving someone access to a vehicle, a car, a bike... or what-ever.

This aplication works like the following:

* First, the users sign in.
* When he decides the vehicle he wants, the app sends a petition to the system.
* The systems, autorize and autenticate the user. Then send a signal to unblock the vehicle they are trying to use.

Since it is a "beta", there is no check autentication or authorization. Everyone is free to use it.

## UML diagram

(The diagram was created by my teacher)

![uml](./doc/diagrama_clases_UML_intercepting_filter.jpg)

## USER stroy

This one was the one my teacher gave us 
```
Autenticación OK para Francesc
Autorización OK para Francesc
Puerta abierta Francesc!
```

We had to create something similar to this.

## Intercept filter design-patter

As commented, this exam was created using the "intercepting filter design pattern" here is some information about it:
'''
The intercepting filter design pattern is used when we want to do some pre-processing / post-processing with request or response of the application. Filters 
are defined and applied on the request before passing the request to actual target 
application. Filters can do the authentication/ authorization/ logging or tracking of 
request and then pass the requests to corresponding handlers
'''

If you want to know more about it:

[intercepting filter design pattern](https://www.tutorialspoint.com/design_pattern/intercepting_filter_pattern.htm)
