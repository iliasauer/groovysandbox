package operators

/**
 * Created on 03.08.16.
 */
class MethodPointer {

	public static class Person {
		private String name;
		private int age;

		Person(final String name, final int age) {
			this.name = name
			this.age = age
		}

		String getName() {
			return name
		}

		int getAge() {
			return age
		}
	}

	 public static def transform(List elements, Closure action) {
		def result = []
		elements.each {
			result << action(it)
		}
		result
	}

	public static String describe(Person person) {
		"$person.name is $person.age years old"
	}

}
