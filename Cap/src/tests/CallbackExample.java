package Cap.src.tests;


// This is a test java functional JDK


@FunctionalInterface
interface Callback {
    void call(String response);
}

public class CallbackExample {
    public static void search(String term, Callback callback) {

        callback.call(term + " found");
    }

    public static void main(String[] args) {
        search("term", new Callback() {

            @Override
            public void call(String response) {
                System.out.println(response);
            }

        });

        search("tejhgferm", (response) -> {
            System.out.println(response);
        });

        search("term", System.out::println);
    }
}