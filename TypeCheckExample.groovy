package com.app

//@groovy.transform.TypeChecked
class TypeCheckExample {

	def b = 5
	def foo() {
		def a = b + 5
	}

	def bar() {

		def b = 2
		foo()     }

	static void main(String ... args) {
		def x = new TypeCheckExample()
		println x.foo()
		println x.bar()     }
}

