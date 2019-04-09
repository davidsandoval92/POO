package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream {

	static List<String> stringCollection = new ArrayList<>();

	public static void main(String[] Args) {

		addElements();
		useStream();
		useSorted();
		useMap();
		useMatch();
		useCount();
		useReduce();
	}

	public static void addElements() {
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
	}

	public static void useStream() {
		stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		System.out.println("----------------^useStream^----------------");
	}

	public static void useSorted() {
		stringCollection.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		System.out.println("----------------^useSorted^----------------");
	}

	public static void useMap() {
		stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a))
				.forEach(System.out::println);
		System.out.println("----------------^useMap^----------------");
	}

	public static void useMatch() {
		boolean anyStartWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
		System.out.println("anyStartWithA: " + anyStartWithA);
		boolean allStartWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));
		System.out.println("allStartWithA: " + allStartWithA);
		boolean noneStartWithZ = stringCollection.stream().noneMatch((s) -> s.startsWith("z"));
		System.out.println("noneStartWithZ: " + noneStartWithZ);
		System.out.println("----------------^useMatch^----------------");
	}

	public static void useCount() {
		long startWithB = stringCollection.stream().filter((s) -> s.startsWith("b")).count();
		System.out.println("startWithB: " + startWithB);
		System.out.println("----------------^useCount^----------------");
	}

	public static void useReduce() {
		Optional<String> reduced = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "##" + s2);
		reduced.ifPresent(System.out::println);
		System.out.println("----------------^useReduce^----------------");
	}

}
